package factory;
public class WindowsGUIFactory implements GUIFactory{
    @Override
    public Menu createMenu() {
        return new Menu();
    }

    @Override
    public Button createButtton() {
        return new Button();
    }
}
