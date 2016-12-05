package com.packt.ticketportal.domain.repository.impl;

import com.packt.ticketportal.domain.Customer;
import com.packt.ticketportal.domain.HistoryLog;
import com.packt.ticketportal.domain.mappers.IMapResultSetIntoEntity;
import com.packt.ticketportal.domain.repository.IHistoryLogRepository;
import com.packt.ticketportal.domain.repository.RepositoryBase;
import com.packt.ticketportal.domain.unitofwork.IUnitOfWork;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Kuba on 2016-11-29.
 */
public class HistoryLogRepository extends RepositoryBase<HistoryLog> implements IHistoryLogRepository {

    public HistoryLogRepository(Connection connection, IMapResultSetIntoEntity<HistoryLog> mapper, IUnitOfWork uow) {
        super(connection, mapper, uow);
    }


    @Override
    protected String tableName() {
        return "historyLog";
    }

    @Override
    protected String createTableSql() {
        return "CREATE TABLE historyLog("
                + "id bigint GENERATED BY DEFAULT AS IDENTITY,"
                + "date DATE,"
                + "customer BIGINT,"
                + "event BIGINT,"
                + "amount BIGINT"
                + ")";
    }

    @Override
    protected String insertSql() {
        return "INSERT INTO historyLog(date,amount,customer,event) VALUES(?,?,?,?)";
    }


    @Override
    protected String updateSql() {
        return "UPDATE historyLog set date=?, amount=?, customer=?, event=?WHERE id=?";
    }


    @Override
    protected void setupInsert(HistoryLog entity) throws SQLException {
        insert.setString(1, entity.getDate().toString());
        insert.setInt(2, entity.getAmount());
        insert.setInt(3, entity.getCustomerId());
        insert.setInt(4, entity.getTicketForEventId());

    }

    @Override
    protected void setupUpdate(HistoryLog entity) throws SQLException {
        update.setString(1, entity.getDate().toString());
        update.setInt(2, entity.getAmount());
        update.setInt(3, entity.getCustomerId());
        update.setInt(4, entity.getTicketForEventId());
        update.setInt(5, entity.getId());

    }

    @Override
    public List<HistoryLog> byCustomer(Customer customer) {
        return null;
    }
}
