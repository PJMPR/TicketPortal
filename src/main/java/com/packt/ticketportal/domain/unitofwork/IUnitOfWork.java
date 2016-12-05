package com.packt.ticketportal.domain.unitofwork;

import java.sql.SQLException;

/**
 * Created by Kuba on 2016-12-05.
 */
public interface IUnitOfWork {
    public void commit() throws SQLException;
    public void undo() throws SQLException;
    public void markAsNew(Entity entity, IUnitOfWorkRepository repository);
    public void markAsDeleted(Entity entity, IUnitOfWorkRepository repository);
    public void markAsChanged(Entity entity, IUnitOfWorkRepository repository);
}
