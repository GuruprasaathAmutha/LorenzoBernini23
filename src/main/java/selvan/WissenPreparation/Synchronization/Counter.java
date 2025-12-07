package selvan.WissenPreparation.Synchronization;

public class Counter {

    private int counter;

    public synchronized int getCounter(){
        return counter;
    }

    public synchronized void increment(){
        counter++;
    }
}
