public class VariableOverrideTest{
    private String name = "Tom";
    private static double price = 78.0;
    public void info(){
        String name = "John";
        System.out.println(name);
        System.out.println(this.name);
    }

    public static void main(String[] args){
        int price = 70;
        System.out.println(price);
        System.out.println(VariableOverrideTest.price);
        new VariableOverrideTest().info();
    }
}
