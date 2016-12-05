package com.packt.ticketportal.domain.repository;

import com.packt.ticketportal.domain.IHaveId;

import java.util.List;

/**
 * Created by Kuba on 2016-11-29.
 */
 public interface IRepository<TEntity extends IHaveId> {
    public TEntity get(int id);

    public List<TEntity> getAll();

    public void add(TEntity entity);

    public void update(TEntity entity);

    public void delete(TEntity entity);
}
