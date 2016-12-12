package com.packt.ticketportal.domain.unitofwork;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kuba on 2016-12-05.
 */
public class UnitOfWork implements IUnitOfWork {
    private List<Entity> entities = new ArrayList<>();

    private Connection connection;

    public UnitOfWork (Connection connection) throws SQLException{
        this.connection = connection;
        this.connection.setAutoCommit(false);
    }

    public void commit() throws SQLException {
        for(Entity entity: entities){
            entity.persist();
        }
        connection.commit();
        entities.clear();
    }

    public void undo() throws SQLException {
        connection.rollback();
        entities.clear();
    }

    public void markAsNew(Entity entity, IUnitOfWorkRepository repository) {
        entity.setState(Entity.EntityState.New);
        entity.setRepository(repository);
        entities.add(entity);
    }

    public void markAsDeleted(Entity entity, IUnitOfWorkRepository repository) {
        entity.setState(Entity.EntityState.Deleted);
        entity.setRepository(repository);
        entities.add(entity);
    }

    public void markAsChanged(Entity entity, IUnitOfWorkRepository repository) {
        entity.setState(Entity.EntityState.Changed);
        entity.setRepository(repository);
        entities.add(entity);
    }
}
