public class OverloadVarArgs{
    public void test(String msg){
        System.out.println("Test method with only one string parameter.");
    }

    public void test(String... books){
        System.out.println("test method with variable parameters.");
    }

    public static void main(String[] args){
        OverloadVarArgs olv = new OverloadVarArgs();
        //The second method
        olv.test();
        olv.test("hello", "world");
        //the first method
        olv.test("hello");
        //the second method
        olv.test(new String[]{"Hello World"});
    }
}
