class Person{
    //instance field
    public String name;
    //class field
    public static int eyeNum;
}

public class PersonTest{
    public static void main(String[] args){
        System.out.println("Person的sysNum类field值：" + Person.eyeNum);

        Person p = new Person();
        //get field by instance
        System.out.println("p变量的name filed值是：" + p.name + "，p对象的eyeNum filed值是：" + p.eyeNum);
        //赋值
        p.name = "孙悟空";
        p.eyeNum = 2;
        System.out.println("p.name is: " + p.name + ", and p.eyeNum is: " + p.eyeNum);
        //visit field by class
        System.out.println("Person.eyeNum is: " + Person.eyeNum);

        Person p2 = new Person();
        System.out.println("p2.eyeNum is: " + p2.eyeNum);
        p2.name = "猪八戒";
        p2.eyeNum = 3;
        System.out.println("p2.neme is: " + p2.name);
        System.out.println("p2.eyeNum is: " + p2.eyeNum);
        System.out.println("p.name is: " + p.name + ", and p.eyeNum is: " + p.eyeNum);

    }
}
