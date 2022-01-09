public class MT extends Thread {

    public void run() {
        int t = 10;
        while (t-- > 0) {
            System.out.println("Coming from thread");
        }
    }

    public static void main(String[] args) throws Exception {
        long startTime = System.nanoTime();
        MT thread = new MT();
        thread.start();
        Thread.sleep(10000);

        long endTime = System.nanoTime();

        System.out.println((endTime - startTime) / 1e9);
    }
}
