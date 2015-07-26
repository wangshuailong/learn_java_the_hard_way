public class ScoreJudge{
    public static void main(String [] args){
    int score = 78;
    if (score >= 60){
        if (score >= 80){
            if (score >= 90){
                System.out.println("Excelent!");
                } else {
                        System.out.println("Good!");
                }
            } else{
                  System.out.println("Pass!");
            }
        } else{
            System.out.println("Failed!");
        }
    }
}
