package labexams.LabExam1;
// @author Tahani Dhaifallah
public class Subscription {
private String type;
private String name;
public static int SubscriptionCounter;
Date startDate;
Date endDate;

    public Subscription(String type, String name, Date startDate, Date enddate) {
       if(type.equalsIgnoreCase("standard")|| type.equalsIgnoreCase("Premium"))
       {this.type = type;}
       else {System.out.println("Invlid type Should be Either Standard or premium");}
        this.name = name;
        this.startDate = startDate;
        this.endDate = enddate;
        SubscriptionCounter++;
    }

    public String getType() {
       return this.type;
    }
    

    public String getName() {
        return name;
    }

    public static int getSubscriptionCounter() {
        return SubscriptionCounter;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setType(String type) {
       if(type.equalsIgnoreCase("standard")|| type.equalsIgnoreCase("Premium"))
       {this.type = type;}
       else {System.out.println("Invlid type Should be Either Standard or premium");}

    }

    public void setName(String name) {
        this.name = name;
    }

    public static void setSubscriptionCounter(int SubscriptionCounter) {
        Subscription.SubscriptionCounter = SubscriptionCounter;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date enddate) {
        this.endDate = enddate;
    }

public String displayInfo(){
return "Subscription: "+"Name= "+name+", Type= "+type+", End Date="+endDate.toString();
}
}
