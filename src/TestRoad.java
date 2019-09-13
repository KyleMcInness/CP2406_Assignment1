import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestRoad {
    @Test public void CheckTestRoad() {
        Road road = new Road();

        // Asserting the default length is 0
        assertEquals(0, road.getLength());

        // Assigning a random length
        road.setLength();
        System.out.println(road.getLength());

    }
}
