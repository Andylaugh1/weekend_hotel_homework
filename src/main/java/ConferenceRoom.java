public class ConferenceRoom extends Room {

    private double price;

    public ConferenceRoom(int capacity, double price){
        super(capacity);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
