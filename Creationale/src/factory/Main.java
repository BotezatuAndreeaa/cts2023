package factory;
public class Main {
    public static void main(String[] args) {

//       Pizza pizza = Pizza.createPizza("Peperonni");
//       System.out.println(pizza.toString());
        Pizza pizza = Pizza.createPizza("Margherita");


//        AnimalFactory af1, af2, af3;
//        af1  = new DogFactory();
//        af1.createAnimal();
//
//        af2 = new CatFactory();
//        af2.createAnimal();
//
//        af3 = new CamelFactory();
//        af3.createAnimal();


        GUIFactory gf, gf2;
        gf  = new WindowsGUIFactory();
        gf.createButtton();
        gf2 = new MacGUIFactory();
        gf2.createMenu();

    }
}