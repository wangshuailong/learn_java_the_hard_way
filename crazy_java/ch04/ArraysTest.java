import java.util.Arrays;

public class ArraysTest
{
    public static void main(String[] args)
    {
        int[] a = new int[]{3, 4, 5, 6};
        int[] a2 = new int[]{3, 4, 5, 6};
        System.out.println("If a equals a2: " + Arrays.equals(a, a2));
        int[] b = Arrays.copyOf(a, 6);
        System.out.println("If a squals b: " + Arrays.equals(a, b));
        System.out.println("Elements of b: " + Arrays.toString(b));
        Arrays.fill(b, 2, 4, 1);
        System.out.println("Elements of b: " + Arrays.toString(b));
        Arrays.sort(b);
        System.out.println("Elements of b: " + Arrays.toString(b));
    }
}

