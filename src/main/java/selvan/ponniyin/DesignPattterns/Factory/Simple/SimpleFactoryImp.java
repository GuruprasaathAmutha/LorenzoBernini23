package selvan.ponniyin.DesignPattterns.Factory.Simple;

public class SimpleFactoryImp {


    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();
         Pizza p = pizzaFactory.createPizza("Cheese");
        p.getPizza();


    }
}
abstract  class Pizza{
    int i;
    abstract void getPizza(); }

class Peperoni extends Pizza{
    @Override
    void getPizza() {
        System.out.println("Pepperoni Received");
    }
}

class Cheese extends Pizza{
    @Override
    void getPizza() {
        System.out.println("Cheese Received");
    }
}

class PizzaFactory{
    Pizza createPizza(String Flavour){
        switch (Flavour){
            case("Peperoni"):
                return new Peperoni();
            case("Cheese"):
                return new Cheese();
            default:
                return null;

        }
    }
}