package com.packt.ticketportal.domain.unitofwork;


/**
 * Created by Kuba on 2016-12-05.
 */
public interface IUnitOfWorkRepository {

    public void persistDelete(Entity entity);
    public void persistUpdate(Entity entity);
    public void persistAdd(Entity entity);
}
