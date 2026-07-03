package labexams.LabExam1;
// @author Tahani Dhaifallah
public class Food extends Subscription{
  private int noOfMeals;
private boolean withSnack;

    public Food(int noOfMeals, String type, String name, Date startDate, Date enddate) {
        super(type, name, startDate, enddate);
        if(noOfMeals==2|| noOfMeals==3){
        this.noOfMeals = noOfMeals;}
        else{System.out.println("Invalid No.Of Meals should be either 2 or 3");}
        this.withSnack=type.equalsIgnoreCase("premium");  
    }

    public Food(int noOfMeals, boolean withSnack, String type, String name, Date startDate, Date enddate) {
        super(type, name, startDate, enddate);
        this.noOfMeals = noOfMeals;
        this.withSnack=withSnack; 
    }

    public void setNoOfMeals(int noOfMeals) {
        this.noOfMeals = noOfMeals;
    }

    public void setWithSnack(boolean withSnack) {
       this.withSnack=withSnack; 
    }

    public int getNoOfMeals() {
        return noOfMeals;
    }

    public boolean isWithSnack() {
        return withSnack;
    }

    public double CalculatePrice(){
      if(noOfMeals==2){
        return (withSnack==true)?60.0:50; }   
    
        return (noOfMeals==3&&withSnack==true)?80.0:70; 
            
    }

public String displyInfo(){
    String re=(withSnack==true)?"With Snack":"Without Snack";
return super.displayInfo()+"\n No. of Meals="+this.noOfMeals+" "+re+", Price="+CalculatePrice()+" SAR daily";
}
}
