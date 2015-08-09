class DataWrap
{
    public int a;
    public int b;
}

public class ReferenceTransferTest
{
    public static void swap(DataWrap dw)
    {
        int tmp = dw.a;
        dw.a = dw.b;
        dw.b = tmp;
        System.out.println("In method swap, the value of a Field is: " + dw.a + ", and the value of b Field is: " + dw.b);
        dw = null;
    }

    public static void main(String[] args)
    {
        DataWrap dw = new DataWrap();
        dw.a = 6;
        dw.b = 9;
        swap(dw);
        System.out.println("After swap, the value of a Field is: " + dw.a + ", and the value of b Field is: " + dw.b);
    }
}
