package prototype;

import prototype.concret.Report;
import prototype.concret.ReportGenerator;
import prototype.generic.Client;
import prototype.generic.Prototype;

public class Main {

    public static void main(String[] args) {
        Client client = new Client();
        Prototype prototypeA = client.create("A");
        Prototype prototypeB = client.create("B");


        ReportGenerator reportGenerator = new ReportGenerator();
        Report salesReport = reportGenerator.generateReport("sales", "Sales data", "PDF");


    }
}
