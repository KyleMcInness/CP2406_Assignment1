import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestRoad {
    @Test public void CheckTestRoad() {
        Road road = new Road();
        Car car = new Car();

        // Asserting the default length is 0
        assertEquals(0, road.getLength());

        // Assigning a random length
        road.setLength(car.getLength());
        System.out.println(road.getLength());

    }
}
