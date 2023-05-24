package Strategy;

public class RutaTuristica implements RutaStrategy{
    @Override
    public void calculareRuta(double startLatitudine, double startLongitudine, double sfarsitLatitudine, double sfarsitLongitudine) {
        System.out.println("Se calculeaza ruta cu cele mai frumoase peisaje de la (" + startLatitudine + "," + startLongitudine + ") la" +
                " (" + sfarsitLatitudine + "," + sfarsitLongitudine + ")");
    }
}
