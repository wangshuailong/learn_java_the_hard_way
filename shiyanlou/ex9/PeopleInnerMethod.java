public class PeopleInnerMethod{
    public void peopleInfo(){
        final String sex = "man";
        class Student{
            String ID = "20150726";
            public void print(){
                System.out.println("variable outside: " + sex);
                System.out.println("variable inside: " + ID);
            }
        }

        Student a = new Student();
        a.print();
    }

    public static void main(String[] args){
        PeopleInnerMethod b = new PeopleInnerMethod();
        b.peopleInfo();
    }
}
