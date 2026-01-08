import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.time.LocalDate;
import java.time.LocalTime;

import java.util.ArrayList;

public class FlightService {

    private static List<Flight> flightsList = new ArrayList<>();

    public static void validareTimpDepartureArrival(Flight flight) throws IllegalArgumentException {

        if (flight.getDateTimeArrival().isBefore(flight.getDateTimeDeparture())) {

            throw new IllegalArgumentException("Arrival date is before departure date");

        }
    }

    public static void validareData(Flight flight) throws IllegalArgumentException {

        if (flight.getDateTimeDeparture().isBefore(LocalDateTime.now())) {

            throw new IllegalArgumentException("Momentul decolarii e in trecut! Modifica si pune un timp viitor.");

        }
    }

    public static void validareNumarZbor(Flight flight, Flight newFlight) throws IllegalArgumentException {

        if (flight.getFlightNumber().equals(newFlight.getFlightNumber())) {

            throw new IllegalArgumentException("Exista un zbor cu acest numar!");

        }


    }

    public static void validareZborTimp(Flight flight, Flight newFlight) throws IllegalArgumentException {

        boolean sameRoute = (flight.getDepartureCity().equals(newFlight.getDepartureCity()) && flight.getArrivalCity().equals(newFlight.getArrivalCity()));

        long minutesBetween = Math.abs(Duration.between(flight.getDepartureTime(), newFlight.getDepartureTime()).toMinutes());

        if (sameRoute) {

            if (minutesBetween < 30) {

                throw new IllegalArgumentException("Exista deja un zbor ce decoleaza in acest intervar orar de la " + flight.getDepartureCity() + " si aterizeaza la " + flight.getArrivalCity());

            }

        }

    }


    public static void addFlight(Flight flight) {

        try {
            validareData(flight);
            validareTimpDepartureArrival(flight);


            for (Flight f : flightsList) {

                validareNumarZbor(f, flight);
                validareZborTimp(f, flight);
                 
            }

            flightsList.add(flight);

        }  catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());

        }

    }

    public void findFlightbyNumber(String flightNumber) {

        boolean found = false;

        for (Flight flight : flightsList) {

            if (flight.getFlightNumber().equals(flightNumber)) {

                System.out.println(flight);
                found = true;


            }
        }

        if (!found) {
            System.out.println("Nu exista acest numar de zbor: " + flightNumber);
        }
    }

    public void findFlightbyDeparture(String departure) {

        boolean found = false;

        for (Flight flight : flightsList) {

            if (flight.getDepartureCity().equals(departure)) {

                System.out.println(flight);
                found = true;

            }
        }

        if (!found) {
            System.out.println("Nu exista zboruri din acest oras: " + departure);
        }
    }

    public void findFlightbyDestination(String destination) {

        boolean found = false;

        for (Flight flight : flightsList) {

            if (flight.getArrivalCity().equals(destination)) {

                System.out.println(flight);
                found = true;

            }
        }

        if (!found) {
            System.out.println("Nu exista zboruri spre destinatia data: " + destination);
        }

    }

    public void findDeparturebyDate(LocalDate date) {

        boolean found = false;

        for (Flight flight : flightsList) {

            if (flight.getDepartureDate().equals(date)) {

                System.out.println(flight);
                found = true;


            }

        }

        if (!found) {
            System.out.println("Nu exista zboruri in data de: " + date);
        }
    }


    public void findDeparturebyTime(LocalDateTime time) {

        boolean found = false;

        for (Flight flight : flightsList) {

            if (flight.getDepartureTime().equals(time)) {

                System.out.println(flight);
                found = true;

            }
        }

        if (!found) {
            System.out.println("Nu exista zboruri! ");
        }
    }

    public static void findArrivalbyDate(LocalDate date) {

        boolean found = false;

        for (Flight flight : flightsList) {

            if (flight.getArrivalDate().equals(date)) {

                System.out.println(flight);
                found = true;

            }

        }

        if (!found) {

            System.out.println("Nu exista zboruri in data de: " + date);

        }
    }


    public void findArrivalbyTime(LocalTime time) {

        boolean found = false;

        for (Flight flight : flightsList) {

            if (flight.getArrivalTime().equals(time)) {

                System.out.println(flight);
                found = true;

            }
        }

        if (!found) {
            System.out.println("Nu exista zboruri! ");
        }
    }

    public static void getAllFlights() {

        boolean found = false;

        for (Flight flight : flightsList) {

            System.out.println(flight);
            found = true;

        }

        if (!found) {
            System.out.println("Nu exista zboruri! ");
        }
    }


    





}
