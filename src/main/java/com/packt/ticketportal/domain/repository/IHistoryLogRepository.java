package com.packt.ticketportal.domain.repository;

import com.packt.ticketportal.domain.Customer;
import com.packt.ticketportal.domain.HistoryLog;

import java.util.List;

/**
 * Created by Kuba on 2016-12-05.
 */
public interface IHistoryLogRepository extends IRepository<HistoryLog> {

     List<HistoryLog> byCustomer(Customer customer);
}
