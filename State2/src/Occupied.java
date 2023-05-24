public class Occupied implements State{
    @Override
    public void doAction() {
        System.out.println("State changed to: Occupied");
    }
}
