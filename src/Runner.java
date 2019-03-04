import java.util.Scanner;


public class Runner {


    public static void main(String[] args) {
        System.out.println("How good are you at LIFE?");
        System.out.println("Please respond to each question as a number between 1 and 10, 1 being least agreeable and 10 being most agreeable");

        Question q = new Question();
        Scanner sc = new Scanner(System.in);


        for (int i=0; i<q.que.length; i++) {
                System.out.println(q.que[i]);
                if (sc.hasNextInt()) {
                    int w = sc.nextInt();
                    if (w >= 1 && w <= 10) {
                        q.ans[i] = w;
                    } else {
                        System.out.println("Error. Please input a number on the scale 1-10.");

                    }
                }else{
                    System.out.println("Error. Please input a number on the scale 1-10. Restart by pressing play");
                    break;
                }
        }








        int eval = q.evaluate();

        if (eval >=0 && eval <=20){
            System.out.println("Please seek help immediately.");
        }
        if(eval > 20 && eval <=40){
            System.out.println("You are not doing well in life at all. I would look into some major life choices. Good luck!");
        }

        if (eval > 40 && eval <= 60){
            System.out.println("You are doing fine. You might want to make a couple small lifestyle changes, but otherwise keep living life!");
        }
        if(eval > 60 && eval <=90){
            System.out.println("Good job at life! Keep doing what you are doing!");
        }
        if(eval > 90 && eval <=100){
            System.out.println("You should teach a class on life.");
        }

    }
}