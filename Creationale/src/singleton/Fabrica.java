package singleton;

public class Fabrica {
    String nume;
    String locatie;

    int nrMasiniPeOra;
    private Fabrica(String nume, String locatie, int nrMAsini){
        this.nume = nume;
        this.locatie = locatie;
        this.nrMasiniPeOra =nrMAsini;
    }
    private static Fabrica instance;
    public static Fabrica getInstance(){
        if(instance==null){
            Fabrica.instance = new Fabrica("Dacia", "Mioveni", 12);
            return Fabrica.instance;
        }
        else{
            return Fabrica.instance;
        }
    }

    public String showStatus(){
        Fabrica fabrica = Fabrica.getInstance();
        return "Fabrica"+ fabrica.nume + "se afla la" + fabrica.locatie  +  "si produce" + fabrica.nrMasiniPeOra ;

    }

    public Fabrica adauga(){
        Fabrica fabrica = Fabrica.getInstance();
        fabrica.nrMasiniPeOra++;
        return fabrica;
    }

    public Fabrica modifica( int nr){
        Fabrica fabrica = Fabrica.getInstance();
        fabrica.nrMasiniPeOra = nr;
        return fabrica;
    }

}
