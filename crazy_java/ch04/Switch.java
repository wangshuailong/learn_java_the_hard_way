public class Switch
{
    public static void main(String[] args)
    {
        char score = 'C';
        switch (score)
        {
            case 'A':
                System.out.println("Excelent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Fair");
                break;
            case 'D':
                System.out.println("Pass");
                break;
            case 'E':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Wrong Score");

        }
    }
}
