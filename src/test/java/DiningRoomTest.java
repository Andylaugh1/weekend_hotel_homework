import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningroom;

    @Before
    public void before(){
        diningroom = new DiningRoom(200, 34);
    }

    @Test
    public void canGetNumberOfTables(){
        assertEquals(34, diningroom.getNumberOfTables());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(200, diningroom.getCapacity());
    }

    @Test
    public void getNumberOfGuests(){
        assertEquals(0, diningroom.getNumberOfGuests());
    }
}
