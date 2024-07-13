package Thread;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounterExampleForThreadSafeOperation {
    public static void main(String[] args) {
        //Create an AtomicInteger with an initial value of 0
        AtomicInteger atomicInteger = new AtomicInteger(10);

        // Perform atomic increment using incrementAndGet()

        int incrementedValue = atomicInteger.incrementAndGet();

        System.out.println("Incremented value: " + incrementedValue);

        // Performing multiple increments in a loop
        for (int i = 0; i < 10; i++) {
            int currentValue = atomicInteger.incrementAndGet();
            System.out.println("Current Value after increment: " + currentValue);
        }

    }
}
