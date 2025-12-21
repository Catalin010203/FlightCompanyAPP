import java.time.LocalDateTime;
import java.util.Set;
import java.util.HashSet;

public class Flight {

    private String companyName;
    private String departureCity;
    private String arrivalCity;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private String flightNumber;
    private String aircraft;
    private int numarLocuri;

    private Set<TicketClass> availableClasses = new HashSet<>();

    public Flight (String companyName, String departureCity, String arrivalCity,  LocalDateTime departureTime, LocalDateTime arrivalTime,  String flightNumber, Set<TicketClass> availableClasses ) {

        this.companyName = companyName;
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.flightNumber = flightNumber;
        this.availableClasses = availableClasses;

    }

    public int numarLocuri() {
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

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
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




}
