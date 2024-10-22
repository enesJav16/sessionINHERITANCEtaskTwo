public class Daughter extends Mother {
    String hairColor;
    double height;

    public Daughter(){}
    public Daughter(String name,int age,String eyeColor,String hairColor,double height){
        super(name,age,eyeColor);
        this.hairColor=hairColor;
        this.height=height;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getHairColor() {
        return hairColor;
    }

    public double getHeight() {
        return height;
    }
    @Override
    public String toString(){
        return super.getName()+" this is daughter";
    }
}
