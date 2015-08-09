public class VarArgs
{
    public static void test(int a, String... books)
    {
        for (String book: books)
        {
            System.out.println(book);
        }
        System.out.println(a);
    }

    public static void main(String[] args)
    {
        test(5, "Crazy Java.", "I love Programe.");
    }
}
