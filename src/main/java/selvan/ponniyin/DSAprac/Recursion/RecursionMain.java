package selvan.ponniyin.DSAprac.Recursion;

public class RecursionMain {


    public static int counter=0;

    public static void main(String[] args) {


        System.out.println(recursionExampleOne(5));

    }



    public static int recursionExampleOne(int threshold){
        int k=0;
        if(counter==threshold) return 0;
        System.out.println(counter++);


        return recursionExampleOne(threshold);
    }
}
