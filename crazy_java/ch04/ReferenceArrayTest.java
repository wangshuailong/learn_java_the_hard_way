public class ReferenceArrayTest
{
    public static class Person
    {
    public int age;
    public double height;
    public void info()
    {
        System.out.println("My age is: " + age +", and my height is: " + height);
    }

    }
    public static void main(String[] args)
    {
        Person[] students;
        students = new Person[2];
        Person zhang = new Person();
        Person lee = new Person();
        zhang.age = 25;
        zhang.height = 158;
        lee.age = 16;
        lee.height = 150;
        students[0] = zhang;
        students[1] = lee;
        lee.info();
        students[1].info();
    }
}
