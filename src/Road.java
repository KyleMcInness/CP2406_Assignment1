import java.util.Random;

public class Road {
    private int length;

    public void setLength(int car_length) //  sets the road to be a random length between 6 and 15
    {
        int bus_length = car_length*3; // Sets bus_length to 3 times car_length
        Random random = new Random();
        int random_int = random.nextInt(bus_length*5); // Gets a random int between 0 and 15
        while (random_int < bus_length*2) // While the int is below the minimum road_length
            random_int = random.nextInt(bus_length*5);
        this.length = ++random_int; // Assigns the int to the length of the road

    }

    public int getLength()
    {
        return this.length;
    }
}
