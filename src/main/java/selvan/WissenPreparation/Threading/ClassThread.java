package selvan.WissenPreparation.Threading;

public class ClassThread extends Thread{


    private final int threadNumber;

    public ClassThread(int threadNumber){
        this.threadNumber=threadNumber;
    }

    @Override
    public void run() {

        for (int i=0;i<=5;i++){
            System.out.println("Thread number "+ threadNumber + " counting "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println();
    }
}
