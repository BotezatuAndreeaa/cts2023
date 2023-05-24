package factory;
public class Pizza {

    public static Pizza createPizza(String pizza) {
        if (pizza.equals("Cheese")) {
            return new CheesePizza();
        } else if (pizza.equals("Peperonni")) {
            return new PeperonniPizza();
        }
        else if (pizza.equals("Margherita")) {
            return new MargheritaPizza();
        }

        else return null;

    }

    @Override
    public String toString() {
        return "Pizza{}";
    }
}
