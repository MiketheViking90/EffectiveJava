package chap10.item66;

import java.util.concurrent.TimeUnit;

public class BrokenStopThread {

    private static boolean stopRequested;

    public static void main(String[] args) throws InterruptedException {
        Thread bgThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (!stopRequested) {
                    i++;
                }
            }
        });
        bgThread.run();

        TimeUnit.SECONDS.sleep(2);
        stopRequested = true;
    }

}
