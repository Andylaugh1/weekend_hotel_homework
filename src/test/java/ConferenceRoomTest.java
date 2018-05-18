import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceroom;

    @Before
    public void before(){
        conferenceroom = new ConferenceRoom(30, 100);
    }

    @Test
    public void canGetRoomPrice(){
        assertEquals(100.00, conferenceroom.getPrice(), 0.01);
    }

    @Test
    public void canGetCapacity(){
        assertEquals(30, conferenceroom.getCapacity());
    }

    @Test
    public void getNumberOfGuests(){
        assertEquals(0, conferenceroom.getNumberOfGuests());
    }
}
