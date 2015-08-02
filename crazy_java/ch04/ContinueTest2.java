public class ContinueTest2
{
    public static void main(String[] args)
    {
        outer:
        for(int i = 0; i < 10; i ++)
        {
            for(int j = 0; j < 5; j ++)
            {
                System.out.println("The value of i is: " + i + "\n" + "The value of j is: " + j);
                if(i == 3)
                {
                    System.out.println("i=3 will not be printed.");
                    continue outer;
                }
            }
        }
    }
}
