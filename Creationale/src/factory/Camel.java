package factory;
public class Camel implements Animal{
    @Override
    public Animal createAnimal() {
        return new Camel();
    }

    public Camel() {
        System.out.println("Camel");
    }
}
