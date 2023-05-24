public class FiltredInternet implements IInternet{
    private IInternet internet;

    @Override
    public void connect(String url) {
        if (isAllowed(url)) {
            if (internet null) {
                internet = new Reallnternet();

            }

            internet.connect (url) ;
        } else {
            System.out.println ("Access to "+ url + is blocked");

    }
    private boolean isAllowed(String url){
        return !url.contains("socialmedia");
    }
}
