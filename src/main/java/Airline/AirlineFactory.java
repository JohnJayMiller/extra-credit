package Airline;

import java.util.HashMap;
import java.util.Map;

public class AirlineFactory {

    private static Map<String, Airline> airlineCache = new HashMap<>();

    private AirlineFactory() {}

    public static Airline getAirline(String string) {
        return airlineCache.computeIfAbsent(string, newstring -> {
            return new Airline(string);
        });
    }

}
