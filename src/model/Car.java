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

    public void setXDir(int xDir) {
        this.xDir = xDir;
    }

    public void setYDir(int yDir) {
        this.yDir = yDir;
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
    public void update(TrafficLight trafficLight, Boolean is_horizontal, Road[] roads) {
        final int MAX_ROAD_X = 504;
        final int MIN_ROAD_X = 60;
        final int MAX_ROAD_Y = 260;
        final int MIN_ROAD_Y = 60;
        int first_turn_x = 0;
        int first_turn_y = 0;
        TrafficLight.State state = trafficLight.getState();
        final int TRAFFIC_LIGHT_WIDTH = trafficLight.getWidth();

        if (x + width == trafficLight.getPositionX() && y - TRAFFIC_LIGHT_WIDTH - 3 == trafficLight.getPositionY() && state == TrafficLight.State.STOP && is_horizontal && xDir > 0) {
            xDir = 0;
        } else if (x + width == trafficLight.getPositionX() && y - TRAFFIC_LIGHT_WIDTH - 3 == trafficLight.getPositionY() && state == TrafficLight.State.GO && is_horizontal && xDir == 0) {
            xDir = 1;
        }

        for (int i = 0; i < roads.length; i++) {
            if (trafficLight.getPositionX() + TRAFFIC_LIGHT_WIDTH == roads[i].getX() - 1) {
                if (roads[i].getOrientation())
                    first_turn_x = roads[i].getX();
                else
                    first_turn_x = roads[i].getX() + roads[i].getWidth();
                first_turn_y = roads[i].getY();
                break;
        }
        }

        if (x + width == first_turn_x && y - 2 == first_turn_y) {
            this.is_horizontal = false;
            setYDir(1);
            setXDir(0);
            x += (width / 2) - 1;
        }

        if (y + 40 == MAX_ROAD_Y && x + 20 == 303) {
            this.is_horizontal = true;
            setXDir(1);
            setYDir(0);
            y = 218;
        }

        if (x + width == MAX_ROAD_X && y == MAX_ROAD_Y - 44 + 2)
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
    public void paintComponent (Graphics g){
        g.setColor(color);
        if (is_horizontal) {
            g.fillRect(x, y, width, height);

        } else {
            g.fillRect(x, y, height, width);

        }
    }
}
