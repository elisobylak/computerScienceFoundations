public class AirMapTest {
    public static void main(String[] args) {
 // load airports and flights
 Airport.loadAirports();  
 Flight.loadFlights();

 // create new AirMap and display it
 AirMap.showMap();
    }
}