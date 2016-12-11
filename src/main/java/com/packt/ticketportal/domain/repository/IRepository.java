package com.packt.ticketportal.domain.repository;

import com.packt.ticketportal.domain.IHaveId;

import java.util.List;

/**
 * Created by Kuba on 2016-11-29.
 */
 public interface IRepository<TEntity extends IHaveId> {
     TEntity get(int id);

     List<TEntity> getAll();

     void add(TEntity entity);

     void update(TEntity entity);

     void delete(TEntity entity);
}
