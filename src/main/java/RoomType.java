public enum RoomType {
    SINGLE(60.00),
    DOUBLE(90.00),
    TWIN(100.00),
    FAMILY(130.00);

    private final double price;

    RoomType(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }
}


