public class ReturnTest
{
    public static void main(String[] args)
    {
        for(int i = 0; i < 5; i ++)
        {
            System.out.println("The value of i is: " + i);
            if(i == 3)
            {
                return;
            }
        }
    }
}
