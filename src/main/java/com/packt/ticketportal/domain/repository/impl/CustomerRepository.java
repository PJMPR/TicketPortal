package com.packt.ticketportal.domain.repository.impl;

import com.packt.ticketportal.domain.Customer;
import com.packt.ticketportal.domain.Ticket;
import com.packt.ticketportal.domain.mappers.IMapResultSetIntoEntity;
import com.packt.ticketportal.domain.repository.ICustomerRepository;
import com.packt.ticketportal.domain.repository.RepositoryBase;
import com.packt.ticketportal.domain.unitofwork.IUnitOfWork;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kuba on 2016-11-29.
 */
public class CustomerRepository extends RepositoryBase<Customer> implements ICustomerRepository {

    public CustomerRepository(Connection connection, IMapResultSetIntoEntity<Customer> mapper, IUnitOfWork uow){
        super(connection,mapper, uow);
        try{
            selectByName = connection.prepareStatement(selectByNameSQL());
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    protected String tableName(){
        return "customer";

    }

    @Override
    protected String createTableSql(){
        return "CREATE TABLE customer(" + "id bigint GENERATED BY DEFAULT AS IDENTITY, " +
                "name VARCHAR(30)," + "address VARCHAR(40)," + "noOfOrders int, " +
                "registrationDate varchar(250) "   + ");";
    }

    @Override
    protected String insertSql() {
        return "INSERT INTO customer(name,address, noOfOrders, registrationDate) VALUES(?,?,?,?);";
    }

    @Override
    protected String updateSql() {
        return "UPDATE CUSTOMER set name=?,address=?, noOfOrders=?, registrationDate=? WHERE id=?;";
    }


    @Override
    protected void setupInsert(Customer entity) throws SQLException {
        insert.setString(1, entity.getName());
        insert.setString(2, entity.getAddress());
        insert.setInt(3,entity.getNoOfOrdersMade());
        insert.setString(4,entity.getRegistrationDate().toString());




    }

    @Override
    protected void setupUpdate(Customer entity) throws SQLException {
        update.setString(1, entity.getName());
        update.setString(2, entity.getAddress());
        update.setInt(3,entity.getNoOfOrdersMade());
        update.setString(4,entity.getRegistrationDate().toString());
        update.setInt(5, entity.getId());

    }
    private PreparedStatement selectByName;

    @Override
    public List<Customer> withName(String name) {
        try {
            List<Customer> result = new ArrayList<>();
            selectByName.setString(1, name);
            ResultSet rs = selectByName.executeQuery();
            while (rs.next()) {
                result.add(mapper.map(rs));
            }
            return result;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public String selectByNameSQL() {
        return "Select * FROM " + tableName() + " where name =?";
    }
}
