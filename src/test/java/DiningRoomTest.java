import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningroom;
    Guest guest;

    @Before
    public void before(){
        diningroom = new DiningRoom(200, 34);
        guest = new Guest("Andy");
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

    @Test
    public void canAddGuestToDiningRoom(){
        diningroom.addGuestToRoom(guest);
        assertEquals(1, diningroom.getNumberOfGuests());
    }

    @Test
    public void canRemoveGuestFromDiningRoom(){
        diningroom.addGuestToRoom(guest);
        diningroom.removeGuestFromRoom(guest);
        assertEquals(0, diningroom.getNumberOfGuests());
    }

    @Test
    public void canGetRidOfAllGuestsFromDiningRoom(){
        diningroom.addGuestToRoom(guest);
        diningroom.getRidOfAllGuests();
        assertEquals(0, diningroom.getNumberOfGuests());
    }
}
