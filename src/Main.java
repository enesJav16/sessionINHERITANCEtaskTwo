import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
//        Mother mother =new Mother();
//        Daughter daughter1= new Daughter();
//        mother.setName("Mother");
//        daughter1.setName("Daughter");
//
//        System.out.println(mother.getName1());
//        System.out.println(daughter1.toString());

        Tech tech = new Tech();

        Phone phone1 = new Phone("Note 10","Samsung","1.12.34",1,"black","12345");
        Phone phone2 = new Phone();

        Computer computer1 = new Computer("Ideapad","Lenovo","21.21.21",1,40);
        Computer computer2 = new Computer();

        SmartWatch watch1 = new SmartWatch("Smartwach","Samsung","1.6.5",0,200);
        SmartWatch watch2 = new SmartWatch();


        boolean check = true;
        while (check) {
            System.out.println("Chose device: ");
            System.out.println("1: Phone\n2: Computer\n3: Watch");
            int choseDevice= scanner.nextInt();
            switch (choseDevice){
                case 1:
                   phone1.turnOnOff(phone1.getPassword());
                   break;
                case 2:
                    computer1.turnOnOff(computer1.getName());
                    break;
                case 3:
                    watch1.turnOnOff(watch1.getName());
                    break;
                default:
                    System.out.println("Chose another device");
                    break;
            }
        }
    }
}