public class Person
{
    public String name;
    public int age;

    public void say(String content)
    {
        System.out.println(content);
    }

    Person p = new Person();
    p.name = "Tom";
    p.say("Java is easy!");
    System.out.println(p.name);
}
