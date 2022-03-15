package Airport;

import java.io.Serializable;
import java.util.Objects;

public class Airport implements AirportInterface, Serializable {
    private String String;

    public Airport(String string) throws IllegalArgumentException {

        setString(string);

    }

    public static boolean uppercase(String string){
        for(int i=0;i<string.length();i++){
            if(!Character.isUpperCase(string.charAt(i))){
                return false;
            }
        }
        return true;
    }



    private void setString(String string) throws IllegalArgumentException {
        if(string.length()!=3){
            throw new IllegalArgumentException("Airport Code is improper length");
        }
        if(!uppercase(string))
            throw new IllegalArgumentException("Airport Code constructed with improper characters");
        String = string;
    }


    public String getString() {return String;}

    @Override
    public String toString() {
        return "Airport{" +
                "String='" + getString() + '\'' +
                '}';

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return Objects.equals(getString(), airport.getString());
    }

    @Override
    public int hashCode() {
        return Objects.hash(String);
    }
}

