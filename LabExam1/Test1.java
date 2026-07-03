package labexams.LabExam1;

// @author Tahani Dhaifallah
public class Test1 {
    public static void main(String[] args) {
      Food f1=new Food(2,false,"standard","Sarah",new Date(2,10,2025),new Date(15,12,2025));
        System.out.println(f1.displyInfo()+"\n");
        Food f2=new Food(3,true,"Standard","Ahmed",new Date(2,10,2020),new Date(1,6,2025));
        System.out.println(f2.displyInfo()+"\n");  
          Food f3=new Food(2,"premium","Nourah",new Date(2,10,2025),new Date(12,1,2026));
        System.out.println(f3.displyInfo());
        System.out.println("\nNumber of Subscriptions: "+Subscription.SubscriptionCounter);
    }
}
