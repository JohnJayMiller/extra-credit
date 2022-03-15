package Airline;

import java.io.Serializable;
import java.util.Objects;

public class Airline implements AirlineInterface, Serializable {
    private String String;

    public Airline(String string) throws IllegalArgumentException {

        setString(string);
}

    private void setString(String string) throws IllegalArgumentException{
        if (string.length()>=8){
            throw new IllegalArgumentException("Airline name is too long");
        }
        String = string;
    }

    public java.lang.String getString() {
        return String;
    }

    @Override
    public java.lang.String toString() {
       return "Airline{" +
               "String='" + String + '\'' +
              '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;
        return Objects.equals(String, airline.String);
    }

    @Override
    public int hashCode() {
        return Objects.hash(String);
    }
}
