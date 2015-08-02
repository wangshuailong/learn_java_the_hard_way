public class ComparableOperator
{
    public static void main(String[] args)
    {
        System.out.println("5 > 4.0: " + (5 > 4.0));
        System.out.println("5 == 5.0: " + (5 == 5.0));
        System.out.println("97 == 'a': " + (97 == 'a'));
        System.out.println("true == false: " + (true == false));
        ComparableOperator t1 = new ComparableOperator();
        ComparableOperator t2 = new ComparableOperator();
        System.out.println("t1 == t2: " + (t1 == t2));
        ComparableOperator t3 = t1;
        System.out.println("t3 == t1: " + (t3 == t1));
    }
}
