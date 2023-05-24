public class RealInternet implements IInternat {
    @Override
    public void connect(String url) {
        System.out.println("Connecting to: " + url);
    }
}
