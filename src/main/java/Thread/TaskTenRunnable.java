package Thread;

public class TaskTenRunnable implements Runnable{
    @Override
    public void run() {

            for (int i = 1; i <= 10; i++) {
                System.out.println("TaskTen Executed - Iteration: " + i);
        }
    }
}
