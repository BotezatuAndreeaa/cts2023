package Facade2;

public class Actor {
    private String nume;
    private int varsta;
    private Teatru teatru;

    public Actor(String nume, int varsta, Teatru teatru) {
        this.nume = nume;
        this.varsta = varsta;
        this.teatru = teatru;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public Teatru getTeatru() {
        return teatru;
    }

    public void setTeatru(Teatru teatru) {
        this.teatru = teatru;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", teatru=" + teatru +
                '}';
    }
}
