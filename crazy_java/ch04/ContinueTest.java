public class ContinueTest
{
    public static void main(String[] args)
    {
        for(int i = 0; i < 5; i ++)
        {
            System.out.println("The value of i is: " + i);
            if(i == 2)
            {
                System.out.println("2 will not be printed.");
                continue;
            }
        }
        System.out.println("Loop Over.");
    }
}
