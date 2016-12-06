package com.packt.ticketportal.domain.unitofwork;


/**
 * Created by Kuba on 2016-12-05.
 */
public interface IUnitOfWorkRepository {

     void persistDelete(Entity entity);
     void persistUpdate(Entity entity);
     void persistAdd(Entity entity);
}
