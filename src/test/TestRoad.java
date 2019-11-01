import org.junit.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

public class TestRoad{
    @Test
        public void intialRoad() {
            Road road = new Road(10, 10, true);
            assertEquals(10, road.getY());
            assertEquals(10, road.getX());
            assertEquals(200, road.getWidth());
            assertEquals(44, road.getHeight());

            road.setDimensions(false);
            assertEquals(false, road.getOrientation());

    }
}
