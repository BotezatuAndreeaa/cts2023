package factory;
public class Button {
    public Button() {
        System.out.println("Button");
    }

    public Button createButton(){
        return new Button();
    }
}
