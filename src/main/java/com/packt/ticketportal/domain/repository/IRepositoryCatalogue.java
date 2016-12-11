package com.packt.ticketportal.domain.repository;

/**
 * Created by Kuba on 2016-12-05.
 */
public interface IRepositoryCatalogue {

     ICustomerRepository customer();
     IHistoryLogRepository historyLog();
     ITicketRepository ticket();

     void saveAndClose();
      void save();
}
