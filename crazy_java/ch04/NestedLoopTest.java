public class NestedLoopTest
{
    public static void main(String[] args)
    {
        for(int i = 0; i < 5; i ++)
        {
            for(int j = 0; j < 3; j ++)
            {
                System.out.println("The value of i is: " + i + "\n" + "The value of j is: " + j);
            }
        }
        System.out.println("Loop Over !");
    }
}
