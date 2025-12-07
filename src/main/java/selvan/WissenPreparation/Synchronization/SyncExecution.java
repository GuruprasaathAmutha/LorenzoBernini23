package selvan.WissenPreparation.Synchronization;

public class SyncExecution {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        System.out.println(counter.getCounter());




         new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        }).start();

         new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        }).start();

        Thread.sleep(5000);
        System.out.println(counter.getCounter());

    }
}
