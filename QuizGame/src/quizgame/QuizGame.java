package quizgame;
// @author Tahani Dhaifallah
public class QuizGame {

    public static void main(String[] args) {
        String []cho={"8 bits","16 bits","32 bits","64 bits"};
        Question q1=new Question("What is the size of an int in Java?",cho,2);
        String []cho2={"implements","extends","super","inhe"};
        Question q2=new Question("Which keyword is used to inherit a class?",cho2,1);
        String []cho3={"Open Office Protocol","Object Output Program","Operating Output Program","Object Oriented Programming"};
        Question q3=new Question("What does OOP stand for?",cho3,3);
        Quiz quiz1=new Quiz();
        quiz1.addQuestion(q1);
        quiz1.addQuestion(q2);
        quiz1.addQuestion(q3);
        
        quiz1.start();
        
    }
    
}
