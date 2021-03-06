import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom;
    DiningRoom diningroom;
    ConferenceRoom conferenceroom;
    Guest guest;
    Guest guest1;
    Guest guest2;

    @Before
    public void before(){
        hotel = new Hotel("Ibis");
        bedroom = new Bedroom(2, RoomType.DOUBLE, 28);
        diningroom = new DiningRoom(200, 34);
        conferenceroom = new ConferenceRoom(30, 100);
        guest = new Guest("Andy");
        guest1 = new Guest("John");
        guest2 = new Guest("Alicia");


    }

    @Test
    public void canGetName(){
        assertEquals("Ibis", hotel.getName());
    }

    @Test
    public void canGetNumberOfBedrooms(){
        assertEquals(0, hotel.getNumberOfBedrooms());
    }

    @Test
    public void canGetNumberOfDiningRooms(){
        assertEquals(0, hotel.getNumberOfDiningRooms());
    }

    @Test
    public void canGetNumberOfConferenceRooms(){
        assertEquals(0, hotel.getNumberOfConferenceRooms());
    }

    @Test
    public void canAddAConferenceRoom(){
        hotel.addConferenceRoom(conferenceroom);
        assertEquals(1, hotel.getNumberOfConferenceRooms());
    }

    @Test
    public void canAddADiningRoom(){
        hotel.addDiningRoom(diningroom);
        assertEquals(1, hotel.getNumberOfDiningRooms());
    }

    @Test
    public void canAddABedRoom(){
        hotel.addBedRoom(bedroom);
        assertEquals(1, hotel.getNumberOfBedrooms());
    }

    @Test
    public void canCheckGuestIntoRoom(){
        hotel.addBedRoom(bedroom);
        hotel.checkInAGuest(bedroom, guest);
        hotel.addConferenceRoom(conferenceroom);
        hotel.checkInAGuest(conferenceroom, guest1);
        hotel.addDiningRoom(diningroom);
        hotel.checkInAGuest(diningroom, guest2);
        assertEquals(1,hotel.getNumberOfBedrooms());
        assertEquals(1, bedroom.getNumberOfGuests());
        assertEquals(1,hotel.getNumberOfConferenceRooms());
        assertEquals(1, conferenceroom.getNumberOfGuests());
        assertEquals(1,hotel.getNumberOfDiningRooms());
        assertEquals(1, diningroom.getNumberOfGuests());
    }

    @Test
    public void cannotAddGuestCapacityFull(){
        hotel.addBedRoom(bedroom);
        hotel.checkInAGuest(bedroom, guest);
        hotel.checkInAGuest(bedroom, guest1);
        hotel.checkInAGuest(bedroom, guest2);
        assertEquals("Guest cannot be checked in, room is full", hotel.notifyReceptionist(bedroom, guest2));
        assertEquals(2, bedroom.getNumberOfGuests());
    }

    @Test
    public void canGetRoomGuestList(){
        hotel.addConferenceRoom(conferenceroom);
        hotel.checkInAGuest(conferenceroom, guest);
        hotel.checkInAGuest(conferenceroom, guest1);
        assertEquals(guest, hotel.getRoomGuestList(conferenceroom));
    }

    @Test
    public void canCheckGuestOut(){
        hotel.checkInAGuest(bedroom, guest);
        hotel.checkInAGuest(bedroom, guest);
        hotel.checkOutAGuest(bedroom, guest);
        assertEquals(1, bedroom.getNumberOfGuests());
    }

    @Test
    public void canCheckInAListOfGuests(){
        ArrayList guestlist = new ArrayList<Guest>();
        guestlist.add(guest);
        guestlist.add(guest1);
        guestlist.add(guest2);
        hotel.checkInGuestList(bedroom, guestlist);
        assertEquals(3, bedroom.getNumberOfGuests());
    }

    @Test
    public void canSeeListOfVacantBedrooms(){
        Bedroom bedroom1;
        Bedroom bedroom2;
        Bedroom bedroom3;
        ArrayList emptyrooms = new ArrayList<Room>();
        bedroom1 = new Bedroom(2, RoomType.DOUBLE, 1);
        bedroom2 = new Bedroom(5, RoomType.FAMILY, 2);
        bedroom3 = new Bedroom(1, RoomType.SINGLE, 3);
        hotel.addBedRoom(bedroom1);
        hotel.addBedRoom(bedroom2);
        hotel.addBedRoom(bedroom3);
        hotel.checkInAGuest(bedroom3, guest);
        assertEquals(2,  hotel.findVacantBedRooms().size());
    }


}
