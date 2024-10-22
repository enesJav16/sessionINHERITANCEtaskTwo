public class Computer extends Tech{
    private int ram;
    private String password;


    public Computer() {

    }

    public Computer(String name, String brand, String version,int type, int ram, String password) {
        super(name, brand, version,type);
        this.ram = ram;
        this.password=password;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    void turnOnOff(String password) {
        super.turnOnOff(password);
    }
}
