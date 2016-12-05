package com.packt.ticketportal.domain.repository.impl;

import com.packt.ticketportal.domain.mappers.CustomerMapper;
import com.packt.ticketportal.domain.mappers.HistoryLogMapper;
import com.packt.ticketportal.domain.mappers.TicketMapper;
import com.packt.ticketportal.domain.repository.ICustomerRepository;
import com.packt.ticketportal.domain.repository.IHistoryLogRepository;
import com.packt.ticketportal.domain.repository.IRepositoryCatalogue;
import com.packt.ticketportal.domain.repository.ITicketRepository;
import com.packt.ticketportal.domain.unitofwork.IUnitOfWork;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by Kuba on 2016-12-05.
 */
public class RepositoryCatalogue implements IRepositoryCatalogue {
    IUnitOfWork uow;
    Connection connection;

    public RepositoryCatalogue(IUnitOfWork uow, Connection connection){
        super();
        this.uow = uow;
        this.connection = connection;
    }

    public ICustomerRepository customer() {
        return new CustomerRepository(connection,new CustomerMapper(), uow);
    }
    public ITicketRepository ticket(){
        return new TicketRepository(connection, new TicketMapper(),uow);
    }
    public IHistoryLogRepository historyLog(){
        return new HistoryLogRepository(connection, new HistoryLogMapper(), uow);
    }

    public void saveAndClose() {
        try{
            uow.commit();
            connection.close();
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
