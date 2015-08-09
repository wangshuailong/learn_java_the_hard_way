public class PrimitiveTransferTest
{
    public static void swap(int a, int b)
    {
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("In method swap, the value of a is: " + a + ", and the value of b is: " + b);
    }

    public static void main(String[] args)
    {
        int a = 6;
        int b = 9;
        swap(a, b);
        System.out.println("After swap, the value of a is: " + a + ", and the value of b is: " + b);
    }
}
