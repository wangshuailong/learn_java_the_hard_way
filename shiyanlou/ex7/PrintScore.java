public class PrintScore{
     /*
     * function: calculate the total score:
     */
    public int calcSum(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args){
        //create object named a
        PrintScore a = new PrintScore();
        //initialize a variable.
        int rSum;
        //use the method
        rSum = a.calcSum(78, 89);
        System.out.println("The total score: " + rSum);
    }

}
