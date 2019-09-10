import java.util.Random;

public class TrafficLight {
    private int position;
    private boolean status;
    private double change_rate;

    public TrafficLight() {
        this.position = 7;
        this.status = false;
        this.change_rate = 0.3;
    }

    // Setters and Getters

    public void setPosition(int position) {
        this.position = position;
    }

    public void setStatus()
    {
        Random random = new Random();
        double random_int = random.nextDouble(); // Generates a random double

        while (random_int >= this.change_rate && !this.status) { // While the random double is greater than the change rate and the status is false
            random_int = random.nextDouble(); // Generate a new random double
        }
        this.status = true;
    }

    public int getPosition()
    {
        return this.position;
    }

    public boolean isStatus()
    {
        return this.status;
    }

}
