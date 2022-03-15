import Airline.Airline;
import Airport.Airport;
import Flight.Flight;
import Flight.FlightFactory;
import Flight.FlightLombok;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public final class FlightManager {
    private static FlightManager ourInstance;
    private static List<Flight> flights;

    public static FlightManager getInstance() throws Exception {
        if (ourInstance == null)
            ourInstance = new FlightManager();

        return ourInstance;
    }
    private FlightManager() {
        flights = new ArrayList<Flight>();
    }
    public String createFlight(FlightLombok data){
        String type = data.getType();
        Airline airline = data.getAirline();
        Airport origin = data.getOrigin();
        Airport destination = data.getDestination();
        String flightNumber = data.getFlightNumber();
        Date departureTime = data.getDepartureTime();
        int capacity = data.getPassengers();
        Flight flight = FlightFactory.createFlight(type,airline,origin,destination, flightNumber, departureTime,capacity);
        System.out.println(flight);
        flights.add(flight);
        return flight.getFlightNumber();
    }
    public Optional<Flight> getFlightByFlightNumber(String flightNumber){
        return flights.stream()
                .filter(flt -> flt.getFlightNumber().equals(flightNumber))
                .findFirst();
    }
}
