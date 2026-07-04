package to.dolist;
// @author Tahani Dhaifallah

public class Task {

    private String task;
    private boolean isDone = false;

    public Task(String task) {
        this.task = task;
    }

    public void done() {
        this.isDone = true;
    }

    public String show() {
        String stauts = (isDone) ? "[X]" : "[]";
        return stauts + " " + this.task;
    }

    public String getTask() {
        return task;
    }

}
