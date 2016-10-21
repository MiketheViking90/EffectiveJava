package chap10.item66;

import java.util.concurrent.TimeUnit;

public class StopThread {

    private static boolean stopRequested = false;

    private static synchronized void requestStop() {
        stopRequested = true;
    }

    private static synchronized boolean isStopRequested() {
        return stopRequested;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread bgThread = new Thread(() -> {
            int i = 0;
            while (!isStopRequested()) {
                System.out.println(i++);
            }
        });
        bgThread.start();

        TimeUnit.SECONDS.sleep(1);
        requestStop();
    }
}
