import java.awt.*;
import java.util.Random;

public abstract class Vehicle {
    private int x, y;
    private int xDir, yDir;

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

    public abstract void update(TrafficLight trafficLight, Boolean orientation, Road[] road);
}
