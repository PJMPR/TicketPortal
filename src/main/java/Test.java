import com.packt.ticketportal.domain.Customer;
import com.packt.ticketportal.domain.Ticket;
import com.packt.ticketportal.domain.repository.IRepositoryCatalogue;
import com.packt.ticketportal.domain.repository.impl.RepositoryCatalogue;
import com.packt.ticketportal.domain.unitofwork.UnitOfWork;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

/**
 * Created by Kuba on 2016-11-09.
 */
public class Test {

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
            T.setTicketCat("Mecz");
            T.setTicketDesc("Bilet na mecz");
            catalogue.ticket().add(T);

            System.out.println("zapisuje janka");
            catalogue.saveAndClose();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
