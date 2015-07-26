public class People{
    private double height;
    public double getHeight(){
        return height;
    }
    public void setHeight(double newHeight){
        height = newHeight;
    }

    int age;
    boolean sex;

    void cry(){
        System.out.println("This man is crying!");
    }

    void laugh(){
        System.out.println("This man is laughing!");
    }

    void printBaseMes(){
        System.out.println("My height is " + height);
        System.out.println("My age is " + age);
        if (this.sex){
            System.out.println("I am male.");
        } else {
            System.out.println("I am female.");
        }
    }
}
