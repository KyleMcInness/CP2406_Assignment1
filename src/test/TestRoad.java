import org.junit.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

public class TestRoad{
    @Test
        public void intialRoad() {
            Road road = new Road(1, 1, true);
            assertEquals(10, road.getY());
            assertEquals(10, road.getX());

    }
}
