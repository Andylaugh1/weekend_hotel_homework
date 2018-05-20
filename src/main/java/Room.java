import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guests;

    public Room (int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public int getCapacity(){
        return this.capacity;
    }

    public ArrayList getGuests(){
        return this.guests;
    }

    public int getNumberOfGuests(){
        return this.guests.size();
    }

    public boolean checkCapacity(){
        if (getNumberOfGuests() < this.capacity)
            return true;
        else
            return false;
    }

    public Guest getGuestList() {
        for (Guest guest : this.guests) {
            return guest; }
        return null;
    }

    public void addGuestToRoom(Guest guest){
        if (checkCapacity() == true)
            guests.add(guest);
    }

    public String notifyIfGuestCheckInOrNot(Guest guest){
        if (checkCapacity() == true)
            return "Guest has been checked in";
        else
            return "Guest cannot be checked in, room is full";
    }

    public void removeGuestFromRoom(Guest guest){
        guests.remove(guest);
    }

    public void getRidOfAllGuests(){
        guests.clear();
    }

    public boolean isRoomEmpty(){
        if (getNumberOfGuests() == 0)
            return true;
        else
            return false;
    }
}
