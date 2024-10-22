public class SmartWatch extends Tech{
    private int price;

    public SmartWatch() {}


    public SmartWatch(String name, String brand, String version,int type, int price) {
        super(name, brand, version,type);
        this.price = price;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    void turnOnOff(String password) {
        super.turnOnOff(password);
    }
}
