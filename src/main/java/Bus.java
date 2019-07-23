import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList();
    }

    public int numberOfPassengers() {
        return this.passengers.size();
    }

    public void addPassenger(BusStop busStop) {
        if(this.capacity > numberOfPassengers()) {
            Person person = busStop.removePerson();
            this.passengers.add(person);
        }
    }

    public void removePassenger() {
        this.passengers.remove(0);
    }
}
