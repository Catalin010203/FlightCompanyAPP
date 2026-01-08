import java.util.ArrayList;
import java.util.List;

public class TicketsService {

    private Flight flight;
    private Passenger passenger;
    private Ticket ticket;
    private FlightService flightService;

    private List<Ticket> ticketList = new ArrayList<>();


    public void buyTicket(Ticket ticket, Flight flight, Passenger passenger) {


        if (flight.getTickets().size() < flight.getNumarLocuri()) {

            ticketList.add(ticket);

        }

    }




}
