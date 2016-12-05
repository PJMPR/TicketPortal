package com.packt.ticketportal.domain.repository;

/**
 * Created by Kuba on 2016-12-05.
 */
public interface IRepositoryCatalogue {

    public ICustomerRepository customer();
    public IHistoryLogRepository historyLog();
    public ITicketRepository ticket();

    public void saveAndClose();
}
