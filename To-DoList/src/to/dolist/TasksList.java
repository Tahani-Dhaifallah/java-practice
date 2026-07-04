package to.dolist;
//@author Tahani Dhaifallah

import java.util.ArrayList;

public class TasksList {

    private ArrayList<Task> list;

    public TasksList() {
        this.list = new ArrayList<>();
    }

    public void addTask(Task a) {
        this.list.add(a);
        System.out.println("Task added: " + a.getTask());
    }

    public void mark(int ind) {
        if (ind >= 0 && ind < list.size()) {
            Task change = this.list.get(ind);
            change.done();
        } else {
            System.out.println("InValid Value");
        }
    }

    public void remove(int r) {
        if (r >= 0 && r < list.size()) {
            list.remove(r);
        } else {
            System.out.println("InValid Value");
        }
    }

    @Override
    public String toString() {
        if (list.isEmpty()) {
            return "No tasks yet!";
        }
        String element = "";
        for (int i = 0; i < list.size(); i++) {
            element += i + "-" + list.get(i).show() + "\n";
        }
        return element;
    }

}
