import com.packt.ticketportal.domain.Customer;
import com.packt.ticketportal.domain.HistoryLog;
import com.packt.ticketportal.domain.Ticket;
import com.packt.ticketportal.domain.repository.IRepositoryCatalogue;
import com.packt.ticketportal.domain.repository.impl.RepositoryCatalogue;
import com.packt.ticketportal.domain.repository.impl.TicketRepository;
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
            Customer A = new Customer("Imie", "Tricity");
            A.setRegistrationDate(new Date());
            A.setNoOfOrdersMade(0);
            catalogue.customer().add(A);
            Customer B = new Customer("Seba","Gdynia");
            B.setRegistrationDate(new Date(2016,3,20));
            B.setNoOfOrdersMade(1);
            catalogue.customer().add(B);
            catalogue.save();
            Ticket T = new Ticket("ASD","TRICITY",new BigDecimal(100));
            T.setTicketsInStock(1000);
            T.setTicketDesc("Bilet na mecz");
            T.setCustomerId(catalogue.customer().get(0).getId());
            catalogue.ticket().add(T);
            catalogue.save();
            HistoryLog H = new HistoryLog();
            H.setTicketForEventId(catalogue.ticket().get(0).getId());
            H.setAmount(2);
            H.setCustomerId(catalogue.customer().get(1).getId());
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
