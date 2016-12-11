package com.packt.ticketportal.domain.unitofwork;

import java.util.Objects;

/**
 * Created by Kuba on 2016-12-05.
 */
public class Entity {
    private Object entity;
    private IUnitOfWorkRepository repository;
    private EntityState state;

    public Entity(Object entity){
        super();
        this.entity = entity;
        this.state = EntityState.Unchanged;
    }
    public enum EntityState{
        New, Unchanged, Changed, Deleted, Unknown
    }

    public EntityState getState(){
        return state;
    }
    public void setState(EntityState state){
        this.state = state;
    }

    public Object getEntity() {
        return entity;
    }

    public void setEntity(Object entity) {
        this.entity = entity;
    }

    public IUnitOfWorkRepository getRepository() {
        return repository;
    }

    public void setRepository(IUnitOfWorkRepository repository) {
        this.repository = repository;
    }

    public void persist(){
        switch (getState()){
            case Changed:
                getRepository().persistUpdate(this);
                break;
            case Deleted:
                getRepository().persistDelete(this);
                break;
            case New:
                getRepository().persistAdd(this);
                break;
            default:
                break;
        }
    }
}
