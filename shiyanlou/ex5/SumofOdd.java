public class SumofOdd{
    public static void main(String[] args){
    int i1 = 1, i2 = 1;
    int sum1 = 0, sum2 = 0;

    while (i1 <= 1000){
        if (0 == i1 % 2){
            sum1 += i1;
            }
            i1++;
        }
    System.out.println("Add all the odd number between 1 and 1000 by while: " + sum1);

    do {
        if(0 == i2 % 2){
            sum2 += i2;
        }
        i2++;
    } while (i2 <= 1000);
    System.out.println("Add all the odd number between 1 and 1000 by do_while: " + sum2);

    int sum3 = 0;
    for (int i = 0; i <= 1000; i++){
        if (0 == i%2){
        sum3 += i;
        }
    }
    System.out.println("Add all the odd number between 1 and 1000 by for: " + sum3);
    }
}
