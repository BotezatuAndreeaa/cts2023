import Strategy.*;

public class Main {
    public static void main(String[] args) {
        SistemGPS sistemGPS = new SistemGPS("Bucuresti-Sinaia");

        sistemGPS.setRutaStrategy(new RutaScurta());
        sistemGPS.calculareRuta(41.698, -169.4125, 64.0532, -179.266);

        sistemGPS.setRutaStrategy(new RutaRapida());
        sistemGPS.calculareRuta(63.5654, 187.3698, 25.1654, 112.2158);

        RutaTuristica rutaTuristica = new RutaTuristica();

        sistemGPS.setRutaStrategy(rutaTuristica);
        sistemGPS.calculareRuta(63.5654, -187.3698, 25.1654, 112.2158);
    }
}