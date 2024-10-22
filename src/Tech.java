import java.util.Scanner;

public class Tech {
    private String name;
    private String brand;
    private String version;
    private int type;

    Scanner scanner1 = new Scanner(System.in);
    Scanner scanner2 = new Scanner(System.in);

    public Tech() {
    }

    public Tech(String name, String brand, String version, int type) {
        this.name = name;
        this.brand = brand;
        this.version = version;
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public String getBrand() {
        return brand;
    }

    int getType() {
        return type;
    }


    void turnOnOff(String password) {
        System.out.println("What do you want to do turn on(1) or turn off(0)");
        int input = scanner1.nextInt();
        if (input == 1 || input == 0) {

            if (this.type == 1) {

                System.out.println("Give password:");
                boolean passCheck=false;
                do {
                    String passInput = scanner2.nextLine();
                    if (passInput.equals(password)) {
                        passCheck = true;
                    } else {
                        System.out.println("Password is incorrect.");
                        passCheck =false;
                    }
                } while (!passCheck);

                sout(input);
            }else{
                sout(input);
            }

        } else {
            System.out.println("Error");
        }
    }
    public void sout(int input){
        if (input == 1 ) {
            System.out.println(this.name + " is on.");
        } else if (input == 0 ) {
            System.out.println(this.name + " is off.");
        }
    }
}
