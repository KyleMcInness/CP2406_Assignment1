import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCar {
    @Test public void CheckTestCar() {
        Car car = new Car();

        assertEquals(1, car.getPosition());

        car.setPosition(5);
        assertEquals(5, car.getPosition());
        car.move();
        assertEquals(6, car.getPosition());




    }
}
