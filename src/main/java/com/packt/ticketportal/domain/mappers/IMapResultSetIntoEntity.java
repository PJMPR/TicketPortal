package com.packt.ticketportal.domain.mappers;

import com.packt.ticketportal.domain.IHaveId;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Kuba on 2016-11-29.
 */
public interface IMapResultSetIntoEntity<TEntity extends IHaveId> {
    public TEntity map(ResultSet rs) throws SQLException;
}
