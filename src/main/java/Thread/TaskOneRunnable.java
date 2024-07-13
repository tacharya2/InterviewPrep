package Thread;

public class TaskOneRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <= 5 ; i++) {
            System.out.println("TaskOne Executed -Itr "+ i);
        }
    }
}
