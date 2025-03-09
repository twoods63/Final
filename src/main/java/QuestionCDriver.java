import java.util.ArrayList;

public class QuestionCDriver{
    public static void main(String[] args) {
        ArrayList<Airport> allAirports = new ArrayList<>();
        allAirports.add(new Airport("ATL"));
        allAirports.add(new Airport("CTL"));
        allAirports.add(new Airport("IAD"));
        allAirports.add(new Airport("SFO"));

        Plane ks101 = new Plane("KSU Air", 101, "ATL, SFO", allAirports);
        Plane ks115 = new Plane("KSU Air", 115, "CTL, IAD, ATL", allAirports);

        Thread myThread1 = new Thread(ks101);
        Thread myThread2 = new Thread(ks115);

        myThread1.start();
        myThread2.start();
    }
}
