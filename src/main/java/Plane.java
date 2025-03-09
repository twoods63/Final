import java.util.ArrayList;
import java.util.Scanner;

public class Plane extends Thread {
    private static String airline;
    private final int flightNumber;
    private final String route;
    private static ArrayList<Airport> allAirPorts;
    public Plane(String airline, int flightNumber, String route, ArrayList<Airport> allAirPorts) {
        Plane.airline = airline;
        this.flightNumber = flightNumber;
        this.route = route;
        Plane.allAirPorts = allAirPorts;
    }
    public int getFlightNumber() {
        return flightNumber;
    }
    public void run() {
        Scanner sc = new Scanner(System.in);
        String currentCity = sc.next();
        String nextCity = sc.next();
        do {
            System.out.println("Flight " + airline + getFlightNumber() + " is flying from " + currentCity + " to " + nextCity);
            for (Airport s : allAirPorts) {
                s.depart(this);
            }
        } while (allAirPorts.isEmpty());
    }
}
