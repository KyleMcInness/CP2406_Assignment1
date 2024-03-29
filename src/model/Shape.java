import java.awt.*;

public abstract class Shape {
    int x, y;
    Color color;

    Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void paintComponent(Graphics g);
}
