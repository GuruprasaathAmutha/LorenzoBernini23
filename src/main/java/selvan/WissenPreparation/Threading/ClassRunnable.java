package selvan.WissenPreparation.Threading;

public  class ClassRunnable implements Runnable{


    @Override
    public void run() {
        System.out.println("This is a separate thread");
        for (int i=0;i<=5;i++){
            System.out.println("Counting in thread "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
