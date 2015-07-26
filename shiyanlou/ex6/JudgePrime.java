public class JudgePrime{
    public static void main(String[] args){
        int[] ages = {12, 18, 9, 33, 5, 60};
        int i = 1;
        for(int age: ages){
            System.out.println("The " + i + " element is " + age);
            i++;
        }

        String[][] names = {{"foo", "bar", "see"},
                            {"Lisa", "Tom", "John"}};
        for (int k = 0; k < 2; k++){
            for (int j = 0; j < 3; j++){
                System.out.println(names[k][j]);
            }
        }
    }
}
