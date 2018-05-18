import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedRooms;
    private ArrayList<DiningRoom> diningRooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(String name){
        this.name = name;
        this.bedRooms = bedRooms;
        this.diningRooms = diningRooms;
        this.conferenceRooms = conferenceRooms;
    }


    public String getName() {
        return this.name;
    }

    public int getNumberOfBedrooms() {
        return this.bedRooms.size();
    }
}
