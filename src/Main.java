public static void main(String[] args) {

    HashSet<TicketClass> availableClasses = new HashSet<>();
    availableClasses.add(TicketClass.ECONOMY);
    availableClasses.add(TicketClass.BUSINESS);


    Flight flight = new Flight("Emirates", "Dubai", "Rome", LocalDate.of(2026
            , 02, 20),
            LocalTime.of(20, 34), LocalDate.of(2027, 02, 2), LocalTime.of(20, 34), "A-150",
            "Airbus", 150, availableClasses);

    FlightService.addFlight(flight);

    FlightService.getAllFlights();
    FlightService.findArrivalbyDate(LocalDate.of(1895, 02, 2));


}
