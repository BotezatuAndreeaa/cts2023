import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Shape blueCircle = ShapeFactory.getShape("blue-circle", Color.BLUE, 2);


        blueCircle.draw(10, 10);
        blueCircle.draw(30, 30);
    }
}
