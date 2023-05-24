package prototype.generic;

public class ConcretePrototypeB implements Prototype {
    public Prototype clone() {
        return new ConcretePrototypeB();
    }
}
