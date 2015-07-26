public class PeopleInner{
    private String name = "Lilei";

    public class Student{
        //inner atribute
        String ID = "20150725";
        //inner method
        public void stuInfo(){
            System.out.println("name outsides: " + name);
            System.out.println("ID inside: " + ID);
        }
    }

    //test inner class
    public static void main(String[] args){
        PeopleInner a = new PeopleInner();
        Student b = a.new Student();
        b.stuInfo();
    }
}
