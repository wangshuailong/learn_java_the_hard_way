public class PeopleInnerStatic{
    private String name = "Lilei";
    static String ID = "510xxxx199xxx826";

    //static inner class
    public static class Student{
        //inner variable
        String ID = "20150725";
        //inner method
        public void stuInfo(){
            System.out.println("ID outside: " + PeopleInnerStatic.ID);
            System.out.println("ID inside: " + ID);
        }
    }

    //test inner class
    public static void main(String[] args){
        Student a = new Student();
        a.stuInfo();
    }

}
