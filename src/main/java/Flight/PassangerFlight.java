package Flight;

import Airline.Airline;
import Airport.Airport;

import java.io.Serializable;
import java.util.Date;

import static java.util.UUID.randomUUID;

public class PassangerFlight implements Flight, Serializable {
    private int passengerCapacity;
    private final String flightNumber;
    private Airline airline;
    private Airport origin;
    private Airport destination;
    private Date departureTime;


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-20s %n", "Passenger Flight"));
        sb.append(String.format("%-20s %s%n", "Flight Number:", getFlightNumber()));
        sb.append(String.format("%-20s %s%n", "Capacity:", getPassengerCapacity()));
        sb.append(String.format("%-20s %s%n", "Airline:", getAirline()));
        sb.append(String.format("%-20s %s%n", "Origin:", getOrigin()));
        sb.append(String.format("%-20s %s%n", "destination:", getDestination()));
        sb.append(String.format("%-20s %s%n", "Departure Time:", getDepartureTime()));
        return sb.toString();
    }



    public PassangerFlight(Airline airline, Airport origin, Airport destination, Date departureTime, int passengerCapacity){
        setPassengerCapacity(passengerCapacity);
        flightNumber= String.valueOf(randomUUID());
        setAirline(airline);
        setOrigin(origin);
        setDestination(destination);
        setDepartureTime(departureTime);
    }


    @Override
    public String getFlightNumber() {return flightNumber;}

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) throws IllegalArgumentException{
        if (passengerCapacity<=0){
           throw new IllegalArgumentException("Passenger Number Must be Nonzero");
        }
        this.passengerCapacity = passengerCapacity;
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
    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

}
