package factory;
public class CamelFactory implements AnimalFactory{
    @Override
    public Animal createAnimal() {
        return new Camel();
    }
}
