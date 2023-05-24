package Strategy;

public class RutaScurta implements RutaStrategy{
    @Override
    public void calculareRuta(double startLatitudine, double startLongitudine, double sfarsitLatitudine, double sfarsitLongitudine) {
        System.out.println("Se calculeaza ruta cea mai scurta de la (" + startLatitudine + "," + startLongitudine + ") la" +
                " (" + sfarsitLatitudine + "," + sfarsitLongitudine + ")");
    }
}
