import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;


public class Flight {

    private String companyName;
    private String departureCity;
    private String arrivalCity;
    private LocalTime departureTime;
    private LocalTime arrivalTime;
    private LocalDate departureDate;
    private LocalDate arrivalDate;
    private LocalDateTime departureDateTime;
    private LocalDateTime arrivalDateTime;
    private String flightNumber;
    private String aircraft;
    private int numarLocuri;


    private List<Ticket> tickets = new ArrayList<>();

    private Set<TicketClass> availableClasses = new HashSet<>();

    public Flight (String companyName, String departureCity, String arrivalCity,  LocalDate departureDate, LocalTime departureTime, LocalDate arrivalDate, LocalTime arrivalTime, String flightNumber, String aircraft, int numarLocuri, HashSet<TicketClass> availableClasses, List <Ticket> tickets ) {

        this.companyName = companyName;
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.flightNumber = flightNumber;
        this.aircraft = aircraft;
        this.numarLocuri = numarLocuri;
        this.availableClasses = availableClasses;
        this.tickets = tickets;

    }

    public int getNumarLocuri() {
        return numarLocuri;
    }

    public void setNumarLocuri(int numarLocuri) {
        this.numarLocuri = numarLocuri;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAircraft() {
        return aircraft;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }

    public Set<TicketClass> getAvailableClasses() {
        return availableClasses;
    }

    public void setAvailableClasses(Set<TicketClass> availableClasses) {
        this.availableClasses = availableClasses;
    }

    public boolean classIsAvailable(TicketClass ticketClass) {
        return availableClasses.contains(ticketClass);
    }

    public LocalDate getDepartureDate() {

        return departureDate;

    }

    public void setDepartureDate(LocalDate departureDate) {

        this.departureDate = departureDate;

    }

    public LocalDate getArrivalDate() {

        return arrivalDate;

    }

    public void setArrivalDate(LocalDate arrivalDate) {

        this.arrivalDate = arrivalDate;

    }

    public LocalDateTime getDateTimeDeparture() {

        return LocalDateTime.of(departureDate, departureTime);

    }

    public LocalDateTime getDateTimeArrival() {

        return LocalDateTime.of(arrivalDate, arrivalTime);

    }


    public int getDepartureYear() {

        return departureDate.getYear();

    }

    public int getDepartureMonth() {

        return departureDate.getMonthValue();
        // 1-12
    }

    public int getDepartureDay() {

        return departureDate.getDayOfMonth();

    }

    public int getDepartureHour() {

        return departureTime.getHour();

    }

    public int getDepartureMinute() {

        return departureTime.getMinute();

    }

    public List <Ticket> getTickets() {

        return new ArrayList<>(tickets);

    }

    public void setTickets(List<Ticket> tickets) {

        this.tickets = tickets;

    }

    @Override
    public String toString() {

        return companyName + " " + departureCity + " " + arrivalCity + " " + departureDate + " " + departureTime + " " + arrivalDate + " " + arrivalTime + " " + flightNumber + " " + aircraft + " " + numarLocuri + " " + availableClasses + " " + tickets;

    }

}
