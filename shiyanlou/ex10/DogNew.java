public class DogNew extends Animal{
    public void bark(){
        System.out.println("Some dogs don't like to bark !");
    }

    public static void main(String[] args){
        DogNew a = new DogNew();
        a.bark();
    }
}
