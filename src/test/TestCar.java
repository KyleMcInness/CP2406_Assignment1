import org.junit.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

public class TestCar {
    @Test
    public void intialSetup() {
        Car car = new Car(1, 1, 1, 0);
        assertEquals(10, car.getPosX());
        assertEquals(100, car.getPosY());
        assertEquals(10, car.getWidth());
        assertEquals(20, car.getHeight());
        assertEquals(Color.red, car.getColor());
    }

    @Test
    public void moveXDirection() {
        Car car = new Car(1, 1, 1, 0);

        assertEquals(11, car.getPosX());
        assertEquals(100, car.getPosY());
    }

    @Test
    public void moveYDirection() {
        Car car = new Car(1, 1, 1, 0);
        car.setYDir(1);

        assertEquals(10, car.getPosX());
        assertEquals(101, car.getPosY());
    }

}
