package selvan.ponniyin.FunctionalInterface;

public class FuncImp implements greet {


    public static void main(String[] args) {
        greet g = (name) ->  "How are you today " +  name +" ? ";


        System.out.println(g.greetHim("Guru"));
    }

    @Override
    public String greetHim(String s) {
        return "Wassuppp??";
    }
}
