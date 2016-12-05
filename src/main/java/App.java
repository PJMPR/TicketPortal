import com.packt.ticketportal.domain.Customer;
import com.packt.ticketportal.domain.HistoryLog;
import com.packt.ticketportal.domain.Ticket;
import com.packt.ticketportal.domain.repository.IRepositoryCatalogue;
import com.packt.ticketportal.domain.repository.impl.RepositoryCatalogue;
import com.packt.ticketportal.domain.unitofwork.UnitOfWork;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by Kuba on 2016-11-09.
 */
public class App {

    public static void main(String [] args)
    {
        String url = "jdbc:hsqldb:hsql://localhost/workdb";
        try{
            Connection connection = DriverManager.getConnection(url);
            IRepositoryCatalogue catalogue = new RepositoryCatalogue(new UnitOfWork(connection), connection);
            Customer A = new Customer("A", "Tricity");
            A.setRegistrationDate(new Date());
            A.setNoOfOrdersMade(0);
            catalogue.customer().add(A);
            Ticket T = new Ticket("ASD","TRICITY",new BigDecimal(100));
            T.setTicketsInStock(1000);
            T.setTicketDesc("Bilet na mecz");
            catalogue.ticket().add(T);
            HistoryLog H = new HistoryLog();
            H.setTicketForEventId(1);
            H.setAmount(2);
            H.setCustomerId(1);
            H.setDate(new Date());
            catalogue.historyLog().add(H);
            List<Ticket> D = catalogue.ticket().getAll();
            for(Ticket d: D){
                System.out.println(d.getId());
                System.out.println(d.getTicketName());
            }
            catalogue.saveAndClose();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
