package labexams.LabExam1;
// @author Tahani Dhaifallah
public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }
    
    public String toString(){
    return day+"/"+month+ "/"+year;
    }
}
