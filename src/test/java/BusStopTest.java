import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person person;

    @Before
    public void before() {
        busStop = new BusStop("North Bridge");
        person = new Person();

    }

    @Test
    public void queueStartsAt0() {
        assertEquals(0, busStop.queueNumber());
    }
    @Test
    public void canAddPersonToQueue() {
        busStop.addPerson(person);
        assertEquals(1, busStop.queueNumber());
    }

    @Test
    public void canRemovePersonFromQueue() {
        busStop.addPerson(person);
        busStop.addPerson(person);
        busStop.removePerson();
        assertEquals(1, busStop.queueNumber());
    }


}
