public class BreakTest
{
    public static void main(String[] args)
    {
        for(int i = 0; i < 10; i ++)
        {
            System.out.println("The value of i is: " + i);
            if(i == 5)
            {
                System.out.println("The loop will break when i = 5.");
                break;

            }
        }
    }
}
