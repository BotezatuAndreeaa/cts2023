package Strategy;

public class SistemGPS {
    private RutaStrategy rutaStrategy;
    private String denumireRuta;

    public SistemGPS(String denumireRuta) {
        this.denumireRuta = denumireRuta;
    }

    public void setRutaStrategy(RutaStrategy rutaStrategy) {
        this.rutaStrategy = rutaStrategy;
    }

    public void calculareRuta(double startLatitudine, double startLongitudine, double sfarsitLatitudine, double sfarsitLongitudine) {
        System.out.println("Pe ruta " + denumireRuta + ", ");
        rutaStrategy.calculareRuta(startLatitudine, startLongitudine, sfarsitLatitudine, sfarsitLongitudine);
        System.out.println("\n");
    }
}
