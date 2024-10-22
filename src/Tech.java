import java.util.Scanner;

public class Tech {
    private String name;
    private String brand;
    private String version;
    private int type;

    public Tech(){}

    public Tech(String name, String brand, String version,int type) {
        this.name = name;
        this.brand = brand;
        this.version = version;
        this.type=type;
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

    public void setType(int type){
        this.type=type;
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
    int getType(){
        return type;
    }



    void turnOnOff(String password){
        System.out.println("What do you want to do turn on(1) or turn off(0)");
        int input= new Scanner(System.in).nextInt();
        if(input==1||input==0) {
            boolean onOff=true;
            if(input==1){
                onOff=true;
            } else if (input==0) {
                onOff=false;
            }

            if (this.type == 1) {
                boolean passCheck = false;
                System.out.println("Give password:");
                do {
                    String passInput = new Scanner(System.in).nextLine();
                    if (passInput.equals(password)) {
                        passCheck = true;
                    } else {
                        System.out.println("Password is incorrect.");
                    }
                } while (passCheck);


                if (onOff) {
                    System.out.println(name + " is on.");
                } else {
                    System.out.println(this.name + " is off.");
                }
            } else {
                if (onOff) {
                    System.out.println(this.name + " is on.");
                } else {
                    System.out.println(this.name + " is off.");
                }
            }
        }
        else{
            System.out.println("Error");
        }
    }
}
