package quizgame;
// @author Tahani Dhaifallah

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    private ArrayList<Question> quiz;
    private int score;
    public Quiz() {
        this.quiz = new ArrayList<>();
        this.score=0;
    }

    public void addQuestion(Question q) {
        quiz.add(q);
    }
    
    public void start(){
        Scanner in=new Scanner(System.in);
        System.out.println("Welcome to the Quiz Game!");
        for (int i = 0; i <quiz.size(); i++) {
            System.out.println("Question "+(i+1)+": "+quiz.get(i));
            System.out.println("Your answer:");
            int ans=in.nextInt()-1;
            boolean check=quiz.get(i).isCorrect(ans);
            if (check) {
              this.score++;
                System.out.println("Correct!");
            }
            else{
                System.err.println("Wrong! The correct answer was: "+quiz.get(i).getTheCorrectAnswer());
            }
        }
        showResult();
    }
                  
    public String getResult(){
    double result=(double)score/quiz.size()*100;
        if (result>=100) {
            return "Perfact!!";  
        }
        else if(result>=70){
            return"Good job";
        }
        else if(result>=50){
            return"Not bad, keep practicing!";
        }
        else{
            return"You need practice.";
        }
    }
    
    public void showResult(){
        System.out.println("---------------------");
        System.out.println("Quiz Finished!");
        System.out.println("Your Score: "+this.score+" / "+quiz.size());
        System.out.println("Grade: "+getResult());
        System.out.println("---------------------");
    }
}
