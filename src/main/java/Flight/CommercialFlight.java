package Flight;
import Airline.Airline;
import Airport.Airport;

import java.io.Serializable;
import java.util.Date;




public class CommercialFlight implements Flight, Serializable {
    private Airline airline;
    private Airport origin;
    private Airport destination;
    private String flightNumber;
    private Date departureTime;
    private int passengers;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-20s %n", "Commercial Flight"));
        sb.append(String.format("%-20s %s%n", "Airline:", getAirline()));
        sb.append(String.format("%-20s %s%n", "Origin:", getOrigin()));
        sb.append(String.format("%-20s %s%n", "destination:", getDestination()));
        sb.append(String.format("%-20s %s%n", "Flight Number:", getFlightNumber()));
        sb.append(String.format("%-20s %s%n", "Departure Time:", getDepartureTime()));
        return sb.toString();
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }


    public CommercialFlight(Airline airline, Airport origin, Airport destination, String flightNumber, Date departureTime) throws IllegalArgumentException {
        setAirline(airline);
        setOrigin(origin);
        setDestination(destination);
        setFlightNumber(flightNumber);
        setDepartureTime(departureTime);
    }



    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) throws NullPointerException {
        if (airline == null) {
            throw new NullPointerException("Airline cannot be null");
        }
        this.airline = airline;
    }

    public Airport getOrigin() {
        return origin;
    }

    public void setOrigin(Airport origin) throws NullPointerException {
        if (origin == null) {
            throw new NullPointerException("Origin cannot be null");
        }
        this.origin = origin;
    }

    public Airport getDestination() {
        return destination;
    }

    public void setDestination(Airport destination) throws NullPointerException {
        if (destination == null) {
            throw new NullPointerException("Destination cannot be null");
        }
        this.destination = destination;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }
}


