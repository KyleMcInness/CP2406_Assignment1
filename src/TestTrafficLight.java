import org.junit.Test;

import static org.junit.Assert.*;

public class TestTrafficLight {
    @Test public void CheckTestTrafficLight()
    {
        TrafficLight trafficLight = new TrafficLight();

        // Asserting the default length is 0 & the status is set to false
        assertEquals(0, trafficLight.getPosition());
        assertFalse(trafficLight.isStatus());

        // Set the position and status
        trafficLight.setPosition();
        trafficLight.setStatus();

        // Assert that the status is set to true
        assertTrue(trafficLight.isStatus());

    }
}
