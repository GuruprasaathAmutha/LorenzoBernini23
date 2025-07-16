package selvan.ponniyin.DesignPattterns;

public class UnoSingleton {

    private static  UnoSingleton unoSingleton;

    private UnoSingleton(){
    }


    public static  UnoSingleton getInstance(){
        if(unoSingleton==null){
            unoSingleton = new UnoSingleton();
        }
        return unoSingleton;
    }



}
