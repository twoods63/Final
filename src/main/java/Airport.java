import java.util.LinkedList;
public class Airport {
    private String name;
    LinkedList<Plane> planes = new LinkedList<>();
    private Object Plane;

    public Airport() {
        this.name = "Unknown Airport";
    }
    public Airport(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void depart(Plane plane) {
        planes.remove(Plane);
    }
    public void arrival (LinkedList planes) {
        planes.add(Plane);
    }

    @Override
    public String toString () {
        return "Airport " + name + " currently has the following planes:\n";
    }
}