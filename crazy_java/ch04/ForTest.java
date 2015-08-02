public class ForTest
{
    public static void main(String[] args)
    {
        for (int count = 0; count < 10; count ++)
        {
            System.out.println(count);
        }
        System.out.println("Loop Over !");
        System.out.println("------------\n\n");

        for (int b = 0, s = 0, p = 0;
                b < 10 && s < 4 && p < 10;
                p ++)
        {
            System.out.println(b ++);
            System.out.println(++s + p);
        }
        System.out.println("Loop Over !");
    }
}
