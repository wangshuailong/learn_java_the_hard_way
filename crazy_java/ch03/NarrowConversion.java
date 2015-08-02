public class NarrowConversion
{
    public static void main(String[] args)
    {
        int iValue = 233;
        System.out.println("iValue is " + iValue);
        byte bValue = (byte)iValue;
        System.out.println("bValue is " + bValue);
        double dValue = 3.98;
        int tol = (int)dValue;
        System.out.println("tol is " + tol);
    }
}
