package prototype.generic;

public class ConcretePrototypeA implements Prototype {
    public Prototype clone() {
        return new ConcretePrototypeA();
    }
}
