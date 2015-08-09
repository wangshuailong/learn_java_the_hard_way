public class ThisInConstructor
{
    public int foo;
    public ThisInConstructor()
    {
        //another variable foo
        int foo;
        this.foo = 6;
    }

    public static void main(String[] args)
    {
        System.out.println(new ThisInConstructor().foo);
    }
}
