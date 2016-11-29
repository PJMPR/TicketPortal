package com.packt.ticketportal.domain.repository.impl;

import com.packt.ticketportal.domain.Customer;
import com.packt.ticketportal.domain.Ticket;
import com.packt.ticketportal.domain.mappers.IMapResultSetIntoEntity;
import com.packt.ticketportal.domain.repository.RepositoryBase;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by Kuba on 2016-11-29.
 */
public class CustomerRepository extends RepositoryBase<Customer> {

    public CustomerRepository(Connection connection, IMapResultSetIntoEntity<Customer> mapper){
        super(connection,mapper);
    }

    @Override
    protected String tableName(){
        return "customer";

    }

    @Override
    protected String createTableSql(){
        return "CREATE TABLE customer(" + "id bigint GENERATED BY DEFAULT AS IDENTITY, " +
                "name VARCHAR(30)," + "address VARCHAR(40)," + "noOfOrders int, " +
                "registrationDate DATE, " + "tickets VARCHAR(255), "  + ")";
    }

    @Override
    protected String insertSql() {
        return "INSERT INTO customer(name,address, noOfOrders, registrationDate, tickets) VALUES(?,?,?,?,?)";
    }

    @Override
    protected String updateSql() {
        return "UPDATE CUSTOMER name=?,address=?, noOfOrders=?, registrationDate=?, tickets=? WHERE id=?";
    }


    @Override
    protected void setupInsert(Customer entity) throws SQLException {
        insert.setString(1, entity.getName());
        insert.setString(2, entity.getAddress());
        insert.setInt(3,entity.getNoOfOrdersMade());
        insert.setString(4,entity.getRegistrationDate().toString());
        insert.setArray(5,entity.getTickets());



    }

    @Override
    protected void setupUpdate(Customer entity) throws SQLException {
        update.setString(1, entity.getName());
        update.setString(2, entity.getAddress());
        update.setInt(3,entity.getNoOfOrdersMade());
        update.setString(4,entity.getRegistrationDate().toString());
        update.setArray(5,entity.getTickets());
        update.setInt(3, entity.getId());

    }

}
