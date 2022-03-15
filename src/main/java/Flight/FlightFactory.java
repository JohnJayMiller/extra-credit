package Flight;

import Airline.Airline;
import Airport.Airport;

import java.io.Serializable;
import java.util.Date;

public class FlightFactory implements Serializable {
    private FlightFactory(){

    }

    public static Flight createFlight(String type, Airline airline, Airport origin, Airport destination, String flightNumber, Date departureTime, int capacity){
        if (type.equals("commercial")) {
            try {

                return new CommercialFlight(airline, origin, destination,flightNumber,departureTime);
            } catch(IllegalArgumentException e) {
                return null;
            }
        }
        else if (type.equals("passenger")){
           // try{
               return new PassangerFlight(airline, origin, destination, departureTime, capacity);
            //} catch(IllegalArgumentException e){
            //   return null;
           // }
        }
        else return null;
    }
}

