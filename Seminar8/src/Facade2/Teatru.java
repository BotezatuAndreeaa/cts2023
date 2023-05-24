package Facade2;

import java.util.List;

public class Teatru {
    private String denumire;

    public Teatru(String denumire) {
        this.denumire = denumire;
    }
    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public Actor adaugaActor(String nume, int varsta){
        Actor actor = new Actor(nume, varsta, this);
        System.out.println(actor.toString());
        return actor;

    }
}
