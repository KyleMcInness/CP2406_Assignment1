package model;

import java.awt.*;

public class Car extends Vehicle {
    // Declare variables
    private int x, y, xDir, yDir, width, height;
    private Color color;
    private Boolean is_horizontal;

    public Car(int x, int y, int xDir, int yDir) {
        super(x, y);
        this.x = x;
        this.y = y;
        this.height = 20;
        this.width = 40;
        this.xDir = xDir;
        this.yDir = yDir;
        this.color = Color.blue;
        this.is_horizontal = true;
    }

    @Override
    public void move() {
        x += xDir;
        y += yDir;
    }

    // Setters and Getters
    public void setPosX(int x) {
        this.x = x;
    }

    public void setPosY(int y) {
        this.y = y;
    }

    public void setXDir(int xDir) {
        this.xDir = xDir;
    }

    public void setYDir(int yDir) {
        this.yDir = yDir;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public int getPosX() {
        return this.x;
    }

    public int getPosY() {
        return this.y;
    }

    public int getXDir() {
        return this.xDir;
    }

    public int getYDir() {
        return this.yDir;
    }

    public Color getColor() {
        return this.color;
    }

    @Override
    public void update(int trafficLightXPos, int trafficLightYPos, TrafficLight.State state) {
        if ((x + width == trafficLightXPos && state == TrafficLight.State.STOP)) {
            xDir = 0;
        } else if ((state == TrafficLight.State.GO))
            xDir = 1;

        if (x + width == 249){
            yDir = 1;
            xDir = 0;
            is_horizontal = false;
        }

    }

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(color);


        if (is_horizontal)
            g.fillRect(x, y, width, height);
        else
            g.fillRect(x + width - 5, y, height, width);

    }

}
