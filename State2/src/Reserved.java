public class Reserved implements State{
    @Override
    public void doAction() {
        System.out.println("State changed to: Reserved");
    }
}
