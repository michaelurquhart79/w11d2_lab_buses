import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    private Bus bus;
    private Person person;
    private Bus smallBus;
    private BusStop busStop;

    @Before
    public void before() {
        bus = new Bus("Leith", 38);
        smallBus = new Bus("Leith", 2);
        person = new Person();
        busStop = new BusStop("Princes St.");
        busStop.addPerson(person);
        busStop.addPerson(person);
        busStop.addPerson(person);
        busStop.addPerson(person);
    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.numberOfPassengers());
    }

    @Test
    public void busCanPickUpPassenger() {

        assertEquals(0, bus.numberOfPassengers());
        bus.addPassenger(busStop);
        assertEquals(1, bus.numberOfPassengers());

    }

    @Test
    public void busCannotAddPassengerBecauseFull() {
        smallBus.addPassenger(busStop);
        smallBus.addPassenger(busStop);
        smallBus.addPassenger(busStop);
        smallBus.addPassenger(busStop);

        assertEquals(2, smallBus.numberOfPassengers());

    }

    @Test
    public void canRemovePassenger() {
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        bus.removePassenger();

        assertEquals(1,bus.numberOfPassengers());
    }

}
