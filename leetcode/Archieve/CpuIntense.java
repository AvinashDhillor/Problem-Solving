import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CpuIntense {

    static class Task implements Runnable {

        @Override
        public void run() {
            for (int i = 1; i < 1e9; i++) {
                Math.pow(i, 4);
            }
        }

    }

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(50);

        for (int i = 0; i < 10000; i++) {
            service.submit(new Task());
        }

        service.shutdown();

        try {
            service.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
