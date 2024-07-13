package Thread;

public class TaskTenThread extends Thread{
    public void run(){
        for (int i = 0; i <= 10; i++) {
            System.out.println("TaskTen Executed - Iteration " + i);
        }
    }
}
