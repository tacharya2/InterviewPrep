package Thread;

public class RunnableExample {
    public static void main(String[] args) {

        //Creating instance of tasks classes
        TaskOneRunnable taskOne = new TaskOneRunnable();
        TaskTenRunnable taskTen = new TaskTenRunnable();

        // Creating threads with the tasks
        Thread threadOne = new Thread(taskOne);
        Thread threadTen = new Thread(taskTen);

        // Running TaskOne
        threadOne.start();

        // Running TaskTen
        threadTen.start();

    }
}
