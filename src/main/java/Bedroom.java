public class Bedroom extends Room {

    private RoomType roomtype;
    private int roomNumber;

    public Bedroom(int capacity, RoomType roomtype, int roomNumber){
        super(capacity);
        this.roomtype = roomtype;
        this.roomNumber = roomNumber;
    }

    public RoomType getRoomType() {
        return this.roomtype;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }
}
