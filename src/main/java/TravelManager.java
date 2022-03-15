import Airline.Airline;
import Airline.AirlineFactory;
import Airport.Airport;
import Airport.AirportFactory;
import Flight.Flight;
import Flight.FlightLombok;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.File;
import java.util.*;

import static java.util.UUID.randomUUID;


public class TravelManager {
    public static void main(String[] args) throws Exception, JsonProcessingException{
        try {
           ObjectMapper om = new ObjectMapper();
            List<FlightLombok> flights = om.readValue(new File("flightdata.txt"), new TypeReference<List<FlightLombok>>() {});
            String flightNumber1 = FlightManager.getInstance().createFlight(flights.get(1));
            String flightNumber2 = FlightManager.getInstance().createFlight(flights.get(2));
            Optional<Flight> flight = FlightManager.getInstance().getFlightByFlightNumber(flightNumber1);
            Optional<Flight> flight2 = FlightManager.getInstance().getFlightByFlightNumber(flightNumber2);
            System.out.println(flight.get());
            System.out.println(flight2.get());
        } catch (NullPointerException ex) {
            ex.printStackTrace();


        }
    }

}
