import java.util.*;

public class SolarSystem{
    public static void main(String... args){
        ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));

        // Saturn is missing from the planetList
        // Insert it into the correct position
        planetList.set(5, "Saturn" );
        planetList.set(6, "Uranus" );
        planetList.add("Neptune" );
            System.out.println(planetList);
    }
}