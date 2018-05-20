import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom(2, RoomType.DOUBLE, 28);
        guest = new Guest("Andy");
    }

    @Test
    public void canGetRoomNumber(){
        assertEquals(28, bedroom.getRoomNumber());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void canGetRoomType(){
        assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
    }

    @Test
    public void getRoomPrice(){
        assertEquals(90.00, bedroom.getRoomType().getPrice(), 0.01);
    }

    @Test
    public void getNumberOfGuests(){
        assertEquals(0, bedroom.getNumberOfGuests());
    }

    @Test
    public void canAddGuestToBedroom(){
        bedroom.addGuestToRoom(guest);
        assertEquals(1, bedroom.getNumberOfGuests());
    }

    @Test
    public void canRemoveGuestFromBedroom(){
        bedroom.addGuestToRoom(guest);
        bedroom.removeGuestFromRoom(guest);
        assertEquals(0, bedroom.getNumberOfGuests());
    }

    @Test
    public void canGetRidOfAllGuestsFromBedroom(){
        bedroom.addGuestToRoom(guest);
        bedroom.getRidOfAllGuests();
        assertEquals(0, bedroom.getNumberOfGuests());
    }

    @Test
    public void canGetGuestList(){
        bedroom.addGuestToRoom(guest);
        assertEquals(guest, bedroom.getGuestList());
    }


}
