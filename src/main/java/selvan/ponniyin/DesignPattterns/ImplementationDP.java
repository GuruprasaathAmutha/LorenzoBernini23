package selvan.ponniyin.DesignPattterns;

public class ImplementationDP {


    public static void main(String[] args) {

        UnoSingleton uno = UnoSingleton.getInstance();

        UnoSingleton uno1= UnoSingleton.getInstance();


        System.out.println(uno.equals(uno1) );
        System.out.println(uno.hashCode());
        System.out.println(uno1.hashCode());
    }
}
