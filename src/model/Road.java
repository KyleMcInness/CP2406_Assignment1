package model;

import java.awt.*;
import java.util.Random;

public class Road extends Shape{
    private int height, width;
    private int x, y;
    private Boolean is_horizontal;

    public Road(int x, int y, Color color, Boolean is_horizontal) {
        super(x, y, color);
        this.x = x;
        this.y = y;
        this.is_horizontal = is_horizontal;
        setDimensions();
    }

    public void setDimensions() //  sets the road to be a random length between 6 and 15
    {
        if (is_horizontal) {
            this.width = 200;
            this.height = 55;
        } else if (!is_horizontal) {
            this.width = 55;
            this.height = 200;
        }

    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
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
