public class Computer extends Tech{
    private int ram;


    public Computer() {

    }

    public Computer(String name, String brand, String version,int type, int ram) {
        super(name, brand, version,type);
        this.ram = ram;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    void turnOnOff(String password) {
        super.turnOnOff(password);
    }
}
