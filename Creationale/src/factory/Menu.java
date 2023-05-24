package factory;
public class Menu {
    public Menu() {
        System.out.println("Menu");
    }

    public Menu createMenu(){
        return new Menu();
    }
}
