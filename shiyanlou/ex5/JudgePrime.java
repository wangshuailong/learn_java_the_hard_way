public class JudgePrime{
    public static void main(String[] args){
    boolean result = true;
    for (int num = 2; num <= 100000; num++){
        for (int i = 2; i < num; i++){
            if (num % i == 0){
                result = false;
            }
        }
    if (result){
        System.out.println(num);
    } else {
        continue;
    }
    }
}
}
