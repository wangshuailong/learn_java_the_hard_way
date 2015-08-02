public class BreakTest2
{
    public static void main(String[] args)
    {
        //outer loop, marked as outer
        outer:
        for(int i = 0; i < 5; i ++)
        {
            //inner loop
            for (int j = 0; j < 3; j ++)
            {
                System.out.println("The value of i is: " + i + "\n" + "The value of j is: " + j);
                if (j == 2)
                {
                    System.out.println("Break out of the loop when j=2.");
                    break outer;
                }
            }
        }
    }
}
