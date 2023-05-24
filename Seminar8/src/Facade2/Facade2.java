package Facade2;

public class Facade2 {

    private Teatru teatru;
    private Actor actor;

    public Facade2() {
        this.teatru = new Teatru("Evreiesc");
        this.actor = new Actor("Ion", 23, teatru);
    }

    public void infoTeatru(){
        teatru.adaugaActor("Marian Ionescu", 78);

        System.out.println("Teatrul" + teatru.getDenumire() + " are actor pe" + actor.getNume());
    }
}
