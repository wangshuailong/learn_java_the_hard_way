public class ReturnThis
{
    public int age;

    public ReturnThis grow()
    {
        age ++;
        return this;
    }

    public static void main(String[] args)
    {
        ReturnThis rt = new ReturnThis();
        rt.grow()
            .grow()
            .grow();
        System.out.println("The age filed of rt is: " + rt.age);

    }
}
