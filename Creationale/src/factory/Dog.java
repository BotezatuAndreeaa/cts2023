package factory;
public class Dog implements Animal{
    public Dog() {
        System.out.println("DOg");
    }

    @Override
    public Animal createAnimal() {
        return new Dog();
    }

}
