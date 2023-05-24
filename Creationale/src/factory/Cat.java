package factory;
public class Cat implements Animal{
    public Cat() {
        System.out.println("Cat");

    }

    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
