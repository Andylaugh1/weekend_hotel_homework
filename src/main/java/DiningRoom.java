public class DiningRoom extends Room {

    private int tables;

    public DiningRoom(int capacity, int tables){
        super(capacity);
        this.tables = tables;
    }

    public int getNumberOfTables(){
        return this.tables;
    }
}
