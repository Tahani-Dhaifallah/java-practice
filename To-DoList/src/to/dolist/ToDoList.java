package to.dolist;
// @author Tahani Dhaifallah

import java.util.Scanner;

public class ToDoList {

    public static void main(String[] args) {
        TasksList myList = new TasksList();
        Scanner in = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Add Task\n2. Show Tasks\n3. Mark Done\n4. Remove Task\n5. Exit\nChoose:");
            choice = in.nextInt();
            in.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter task:");
                    String task = in.nextLine();
                    Task n = new Task(task);
                    myList.addTask(n);
                    break;
                case 2:
                    System.out.println(myList);
                    break;
                case 3:
                    System.out.println("Task number to mark done :");
                    int d = in.nextInt();
                    myList.mark(d);
                    break;
                case 4:
                    System.out.println("Task number to remove:");
                    int r = in.nextInt();
                    myList.remove(r);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);
        System.out.println("GoodBye!");
    }

}
