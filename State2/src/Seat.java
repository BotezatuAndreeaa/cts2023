public class Seat {
    private int no;
    private State currentState;

    public Seat(int no)
    {
        this.no = no;
        this.currentState = new Available();
    }

    public void reserveSeat()
    {
        if(this.currentState instanceof Available)
        {
            this.currentState = new Reserved();
            this.currentState.doAction();
        }
        else
        {
            System.out.println("Current seat is not available for reservation.");
        }
    }

    public void occupySeat()
    {
        if(!(this.currentState instanceof Occupied))
        {
            this.currentState = new Occupied();
            this.currentState.doAction();
        }
        else
        {
            System.out.println("Current seat is already occupied.");
        }
    }

    public void freeSeat()
    {
        if(!(this.currentState instanceof Available))
        {
            this.currentState = new Available();
            this.currentState.doAction();
        }
        else
        {
            System.out.println("Current seat is already available.");
        }
    }
}
