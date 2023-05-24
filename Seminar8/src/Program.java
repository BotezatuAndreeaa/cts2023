import Adapter.JSONParser;
import Adapter.XMLParser;
import Adapter.XMLtoJsonAdapter;
import Adapter2.AdapterAndroidToiOS;
import Adapter2.Android;
import Adapter2.iOS;
import Facade.Facade;
import Facade2.Facade2;
import Facade2.Actor;
import Facade2.Teatru;
import FacadeMasini.DealerAuto;

public class Program {
    public static void main(String[] args) {

        XMLParser xmlParser = new XMLParser();
        JSONParser jsonParser = new XMLtoJsonAdapter(xmlParser);
        jsonParser.parserJson("convert");

        Facade facade = new Facade();
        facade.drawCircle();
        facade.drawRectangle();
        facade.drawSquare();

        DealerAuto dealer = new DealerAuto();
        dealer.descriereMasinaElectrica();
        dealer.descriereMasinaFamilie();
        dealer.descriereMAsinaSport();
        System.out.println(dealer.descriereMasinaElectrica());

        // Adapter 2 - Android to iOS
        Android android = new Android("iOS", true);
        iOS ios = new AdapterAndroidToiOS(android);
        ios.runIOSApp();

        // Facade 2 - Teatru si Actori
        Facade2 facade2 = new Facade2();

        facade2.infoTeatru();

    }
}