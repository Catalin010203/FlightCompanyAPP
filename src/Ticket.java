public class Ticket {

    private Passenger passenger;
    private Flight flight;
    private boolean stare_checkIN;
    private double taxaPentruLoc;
    private double price;
    private TicketClass ticketClass;

    public Ticket(Passenger passenger, Flight flight, boolean stare_checkIN, double taxaPentruLoc, double price) {

        this.passenger = passenger;
        this.flight = flight;
        this.stare_checkIN = stare_checkIN;
        this.taxaPentruLoc = taxaPentruLoc;
        this.price = price;

    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public boolean isStare_checkIN() {
        return stare_checkIN;
    }

    public void setStare_checkIN(boolean stare_checkIN) {
        this.stare_checkIN = stare_checkIN;
    }

    public double getTaxaPentruLoc() {
        return taxaPentruLoc;
    }

    public void setTaxaPentruLoc(double taxaPentruLoc) {
        this.taxaPentruLoc = taxaPentruLoc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
