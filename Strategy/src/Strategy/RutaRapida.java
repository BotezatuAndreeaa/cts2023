package Strategy;

public class RutaRapida implements RutaStrategy{
    @Override
    public void calculareRuta(double startLatitudine, double startLongitudine, double sfarsitLatitudine, double sfarsitLongitudine) {
        System.out.println("Se calculeaza cea mai rapida ruta de la (" + startLatitudine + "," + startLongitudine + ") la (" + sfarsitLatitudine
                + "," + sfarsitLongitudine + ")");
    }
}
