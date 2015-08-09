public class Overload{
    public void test(){
        System.out.println("No Parameters.");
    }

    public void test(String msg){
        System.out.println("Overload method test: " + msg);
    }

    public static void main(String[] args){
        Overload ol =  new Overload();
        ol.test();
        ol.test("Hello World!");
    }
}
