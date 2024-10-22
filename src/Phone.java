import java.util.Scanner;

public class Phone extends Tech{
    private String color;
    private String password;

    public Phone() {
    }

    public Phone(String name, String brand, String version, int type, String color,String password) {
        super(name, brand, version,type);
        this.color = color;
        this.password=password;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
