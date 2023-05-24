package FacadeMasini;

public class DealerAuto {
    private MasinaElectrica masinaElectrica;
    private MasinaFamilie masinaFamilie;
    private MasinaSport masinaSport;

    public DealerAuto() {
        this.masinaElectrica = new MasinaElectrica();
        this.masinaFamilie = new MasinaFamilie();
        this.masinaSport = new MasinaSport();
    }

    public String descriereMAsinaSport(){
        return masinaSport.descriere("MasinaSport");
    }
    public String descriereMasinaFamilie(){
        return masinaFamilie.descriere("Masinafamilie");
    }
    public String descriereMasinaElectrica(){
        return masinaElectrica.descriere("MasinaElectrica");
    }
}
