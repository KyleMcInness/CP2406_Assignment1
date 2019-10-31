import java.awt.*;
import java.util.Random;

public abstract class Vehicle {
    int x, y;
    int xDir, yDir;

    Vehicle(int x, int y) {
        this.x = x;
        this.y = y;

        xDir = 0;
        yDir = 0;

    }

    public void move() {
        x += xDir;
        y += yDir;
    }

    public abstract void paintComponent(Graphics g);

    public abstract void update(int positionX, int positionY, TrafficLight.State state, Boolean orientation, Road road);
}
