import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceroom;
    Guest guest;

    @Before
    public void before(){
        conferenceroom = new ConferenceRoom(30, 100);
        guest = new Guest("Andy");
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

    @Test
    public void canAddGuestToConferenceRoom(){
        conferenceroom.addGuestToRoom(guest);
        assertEquals(1, conferenceroom.getNumberOfGuests());
    }

    @Test
    public void canRemoveGuestFromConferenceRoom(){
        conferenceroom.addGuestToRoom(guest);
        conferenceroom.removeGuestFromRoom(guest);
        assertEquals(0, conferenceroom.getNumberOfGuests());
    }

    @Test
    public void canGetRidOfAllGuestsFromConferenceRoom(){
        conferenceroom.addGuestToRoom(guest);
        conferenceroom.getRidOfAllGuests();
        assertEquals(0, conferenceroom.getNumberOfGuests());
    }
}
