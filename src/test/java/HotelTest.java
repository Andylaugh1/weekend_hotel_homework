import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom;
    DiningRoom diningroom;
    ConferenceRoom conferenceroom;
    Guest guest;

    @Before
    public void before(){
        hotel = new Hotel("Ibis");
        bedroom = new Bedroom(2, RoomType.DOUBLE, 28);
        diningroom = new DiningRoom(200, 34);
        conferenceroom = new ConferenceRoom(30, 100);
        guest = new Guest("Andy");
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
    public void addAConferenceRoom(){
        hotel.addConferenceRoom(conferenceroom);
        assertEquals(1, hotel.getNumberOfConferenceRooms());
    }

    @Test
    public void addADiningRoom(){
        hotel.addDiningRoom(diningroom);
        assertEquals(1, hotel.getNumberOfDiningRooms());
    }

    @Test
    public void addABedRoom(){
        hotel.addBedRoom(bedroom);
        assertEquals(1, hotel.getNumberOfBedrooms());
    }


}
