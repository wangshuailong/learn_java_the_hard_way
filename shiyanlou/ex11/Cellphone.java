public class Cellphone extends Telephone{
    @Override
    public void call(){
        System.out.println("I can call somebody by the telephone !");
    }

    @Override
    public void message(){
        System.out.println("I can send message to someone by the cellphone !");
    }

    public static void main(String[] args){
        Cellphone a = new Cellphone();
        a.call();
        a.message();
    }
}
