package selvan.Resurgence.graph;

public class DailyLeetCode {
    public static void main(String[] args) {
        System.out.println(countTriples(10));
    }

    public static int countTriples(int n) {

        if(n<5) return 0;
        int i=1;
        int j=2;
        int count=0;

        while(j<n){
            if(isPerfectSquare((i*i)+(j*j))){
                count++;
            }
            i++;
            j++;
        }
        return count*2;
    }

    public static boolean isPerfectSquare(int n){
        int mod = n%16;
        return (mod==0) || (mod==1) || (mod==4) || (mod==9);
    }
}
