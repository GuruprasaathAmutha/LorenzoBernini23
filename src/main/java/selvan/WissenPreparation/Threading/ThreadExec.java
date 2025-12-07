package selvan.WissenPreparation.Threading;

public class ThreadExec {


    public static void main(String[] args) {

        System.out.println("This is in main thread running before creating new threads");



//        Runnable r = () -> {
//            for (int j=0;j<=5;j++) {
//                System.out.println("Thread is counting "+j);
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        };
        for(int  i=0;i<=15;i++){
//             new Thread(r).start();
            ClassThread thread = new ClassThread(i);
thread.start();
            System.out.println("Sout post start method");
        }


        System.out.println("This is after creating new threadssssss");
        System.out.println(Thread.currentThread().getName());
    }
}
