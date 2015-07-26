public class Math{
    public static void main(String[] args){
    int a, b, c, d;
    a = 6 + 7;
    System.out.println("The value of 6 + 7: " + a);
    b = a % 5;
    System.out.println("The value of a % 5: " + b);
    c = b++;
    System.out.println("The value of b after b++: " + b);
    System.out.println("The value of b++:" + c);
    d = ++b;
    System.out.println("The value of ++b: " + b);
    System.out.println("The value of ++b: " + d);
    d += a;
    System.out.println("The value of d after d += a: " + d);
    d -= a;
    System.out.println("The value of d after d -= a: " + d);
    d *= a;
    System.out.println("The value of d after d *= a: " + d);
    d /= a;
    System.out.println("The value of d after d /= a: " + d);
    d %= a;
    System.out.println("The value of d after d %= a: " + d);

    int e = 1;
    double f = 7.2;
    String str1 = "Hello";
    String str2 = "World";
    System.out.println("a = b: " + (e == f));
    System.out.println("a > a: " + (e > f));
    System.out.println("a <= b: " + (e <= f));
    System.out.println("str1 = str2: " + (str1 == str2));

    boolean g = true;
    boolean h = false;
    boolean i = false;
    boolean j = true;

    System.out.println("g && h: " + (g&&h));
    System.out.println("g || h: " + (g||h));
    System.out.println("!a: " + (!g));
    System.out.println("i^j: " + (i^j));

    double score = 68.9;
    String str = (score >= 60) ? "Yes":"No";
    System.out.println("How is the score: " + str);
    }
}
