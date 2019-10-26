package model;

import java.awt.*;

public abstract class Shape {
    int x, y;
    Color color;

    Shape(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public abstract void update(int boundaryWidth, int boundaryHeight, TrafficLight.State state);

    public abstract void paintComponent(Graphics g);
}
