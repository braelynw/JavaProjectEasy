public class Question {
    public String[] key = new String[10];
    public String[] que = new String[10];
    public int ans[] = new int[10];
    public String name;


    public Question(){
        makeQuestions();

    }

    public void makeQuestions(){
        que[0] = "How optimistic are you?";
        que[1] = "How often do you exercise?";
        que[2] = "How often do you wear the color yellow?";
        que[3] = "If you saw a wallet in the ground, how likely would you be to take it?";
        que[4] = "How regularly do you eat an apple a day?";
        que[5] = "How often do you get 8 or more hours of sleep?";
        que[6] = "Are you a thrill seeker?";
        que[7] = "If you are given the choice between a stable job or a risk to pursue the job of your dreams, how likely are you to take the job of your dreams?";
        que[8] = "How much do you like chocolate";
        que[9] = "Are you happy?";
    }

    public int evaluate(){
        int sum = 0;
        for(int i=0; i<que.length; i++){
            int num = ans[i];
            sum =sum+num;

        }
    return sum;
    }



}
