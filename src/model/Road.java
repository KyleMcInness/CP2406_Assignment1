package model;

import java.awt.*;
import java.util.Random;

public class Road extends Shape{
    private int height, width;
    private int positionX, positionY;

    Car car = new Car(10, 100, 10, 20, Color.red, 1, 0);

    public Road(int x, int y, Color color) {
        super(x, y, color);
        this.width = 200;
        this.height = 44;
    }

    public void setHeight(int bus_length) //  sets the road to be a random length between 6 and 15
    {

        Random random = new Random();
        int random_int = random.nextInt(bus_length * 5); // Gets a random int between 0 and 15
        while (random_int < bus_length * 2) // While the int is below the minimum road_length
            random_int = random.nextInt(bus_length * 5);
        this.height = random_int; // Assigns the int to the length of the road
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public void setPosition() {
        this.positionX = car.getPosX();
        this.positionY = car.getPosY();
    }

    public int getPositionX() {
        return x;
    }

    public int getPositionY() {
        return y;
    }

    @Override
    public void update(int boundaryWidth, int boundaryHeight, TrafficLight.State state) {

    }

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(color);
        g.drawRect(x, y, width, height);
    }
}
