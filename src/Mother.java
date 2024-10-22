public class Mother {
    private String name;
    private int age;
    private String eyeColor;

    public Mother(){}
    public Mother(String name,int age, String eyeColor){
        this.name=name;
        this.age=age;
        this.eyeColor=eyeColor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    String getName1(){
        return name+" This is mother.";
    }
}
