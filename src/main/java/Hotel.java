import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedRooms;
    private ArrayList<DiningRoom> diningRooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(String name){
        this.name = name;
        this.bedRooms = new ArrayList<>();
        this.diningRooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
    }


    public String getName() {
        return this.name;
    }

    public int getNumberOfBedrooms() {
        return this.bedRooms.size();
    }

    public int getNumberOfDiningRooms() {
        return this.diningRooms.size();
    }

    public int getNumberOfConferenceRooms() {
        return this.conferenceRooms.size();
    }

    public void addConferenceRoom(ConferenceRoom conferenceroom) {
        this.conferenceRooms.add(conferenceroom);
    }

    public void addDiningRoom(DiningRoom diningRoom) {
        this.diningRooms.add(diningRoom);
    }

    public void addBedRoom(Bedroom bedroom) {
        this.bedRooms.add(bedroom);
    }

    public void checkInAGuest(Room room, Guest guest){
        room.addGuestToRoom(guest);
    }

    public String notifyReceptionist(Room room, Guest guest){
        return room.notifyIfGuestCheckInOrNot(guest);
    }

    public Guest getRoomGuestList(Room room){
        return room.getGuestList();
    }

    public void checkOutAGuest(Room room, Guest guest) {
        room.removeGuestFromRoom(guest);
    }

    public void checkInGuestList(Room room, ArrayList guestlist) {
        for (Object guest : guestlist) {
            room.getGuests().add(guest);
        }
    }

    public ArrayList findVacantBedRooms() {
        ArrayList emptyrooms = new ArrayList<Bedroom>();
        for (Bedroom bedroom : this.bedRooms) {
            if (bedroom.isRoomEmpty())
                emptyrooms.add(bedroom);
        }
        return emptyrooms;
    }

//    public int getVacantRoomNumbers(){
//        findVacantBedRooms();
//        for (Bedroom bedroom : emptyrooms) {
//            return bedroom.getRoomNumber();
//        }
//        return 0;
//    }

}
