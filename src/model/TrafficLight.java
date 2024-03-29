import java.awt.*;
import java.util.Random;

public class TrafficLight extends Shape{

    private int width, height;
    private State state;
    private double change_rate;

    public TrafficLight(int x, int y) {
        super(x, y);
        state = State.STOP;
        change_rate = 0.99;
        width = 20;
        height = 20;
        this.color = getColor();
    }

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
    public enum State {
        STOP, GO
    }

    // Setters and Getters

    Object setState() {
        Random random = new Random();
        double random_int = random.nextDouble(); // Generates a random double

        switch (state) {
            case GO:
                if (random_int >= this.change_rate) {
                    state = State.STOP;
                    color = Color.red;
                }
                break;

            case STOP:
                if (random_int >= this.change_rate) {
                    state = State.GO;
                    color = Color.green;
                }
                break;
        }
        return state;
    }

    int getPositionX() {
        return this.x;
    }
    int getPositionY() {
        return this.y;
    }
    int getWidth() {return this.width;}
     State getState() {
        return this.state;
    }

    private Color getColor() {
        if (state.equals(State.GO))
            return Color.green;
        else
            return Color.red;
    }
}
