package com.packt.ticketportal.domain.unitofwork;

import java.sql.SQLException;

/**
 * Created by Kuba on 2016-12-05.
 */
public interface IUnitOfWork {
     void commit() throws SQLException;
     void undo() throws SQLException;
     void markAsNew(Entity entity, IUnitOfWorkRepository repository);
     void markAsDeleted(Entity entity, IUnitOfWorkRepository repository);
     void markAsChanged(Entity entity, IUnitOfWorkRepository repository);
}
