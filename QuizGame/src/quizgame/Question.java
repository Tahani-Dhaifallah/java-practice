package quizgame;
// @author Tahani Dhaifallah

public class Question {

    private String question;
    private String choices[];
    private int correctAnswerInd;

    public Question(String question, String[] choices, int correctAnswerInd) {
        this.choices = new String[choices.length];
        for (int i = 0; i < this.choices.length; i++) {
            this.choices[i] = choices[i];
        }
        this.correctAnswerInd = correctAnswerInd;
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

    public boolean isCorrect(int userAnswerIndex) {
        return this.correctAnswerInd == userAnswerIndex;
    }

    public String getTheCorrectAnswer() {
        return this.choices[this.correctAnswerInd];
    }

    public String[] getChoices(){
    String[] cho=new String[this.choices.length];
        for (int i = 0; i <cho.length; i++) {
        cho[i]=this.choices[i];      
        }
        return cho;
    }
    @Override
    public String toString() {
        String choice = "";
        for (int i = 0; i <this.choices.length; i++) {
            choice += (i + 1) + " " + this.choices[i] + "\n";
        }
        return getQuestion() + "\n" + choice;
    }

}
