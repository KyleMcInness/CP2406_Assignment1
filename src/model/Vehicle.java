package model;

import java.awt.*;
import java.util.Random;

public abstract class Vehicle {
    int x, y;
    Color color;
    int xDir, yDir;
    int xSpeed, ySpeed;

    Vehicle(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;

        xDir = 0;
        yDir = 0;

    }

    public void move() {
        x += xDir;
        y += yDir;
    }

    public abstract void update(int width, int height);

    public abstract void paintComponent(Graphics g);
}
