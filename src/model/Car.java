import java.awt.*;
import java.util.Random;

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

    public Boolean getOrientation() {return this.is_horizontal;}

    public String get_direction() {

        Random random_number = new Random();
        int number = random_number.nextInt(2);

        if (number == 0)
            return "left";
        else if (number == 1)
            return "straight";
        else
            return "right";

    }

    @Override
    public void update(int trafficLightXPos, int trafficLightYPos, TrafficLight.State state, Boolean is_horizontal, Road road) {
        final int MAX_ROAD_X = 504;
        final int MIN_ROAD_X = 60;
        final int MAX_ROAD_Y = 260;
        final int MIN_ROAD_Y = 60;

        if (x + width == trafficLightXPos && y - 23 == trafficLightYPos && state == TrafficLight.State.STOP && is_horizontal && xDir > 0) {
            xDir = 0;
        } else if (x + width == trafficLightXPos && y - 23 == trafficLightYPos && state == TrafficLight.State.GO && is_horizontal && xDir == 0) {
            xDir = 1;
        }

        if (x + width == 303 && y - 2 == MIN_ROAD_Y) {
            this.is_horizontal = false;
            setYDir(1);
            setXDir(0);
            x += 20;
        }

        if (y + 40 == MAX_ROAD_Y && x + 20 == 303) {
            this.is_horizontal = true;
            setXDir(1);
            setYDir(0);
            y = 218;
        }

        if (x + width == MAX_ROAD_X && y == 218)
            resetCar();
    }

    private void resetCar() {
        x = 62;
        y = 62;
        xDir = 1;
        yDir = 0;
        this.is_horizontal = true;
    }

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(color);
        if (is_horizontal) {
            g.fillRect(x, y, width, height);

        }
        else {
            g.fillRect(x, y, height, width);

        }
    }

}
