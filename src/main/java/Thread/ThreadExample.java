package Thread;

public class ThreadExample {
    public static void main(String[] args) {

        // Creating instances of the task classes
        TaskOneThread taskOne = new TaskOneThread();
        TaskTenThread taskTen = new TaskTenThread();

        //Running TaskOne
        taskOne.start();

        //Running TaskTen
        taskTen.start();
    }
}