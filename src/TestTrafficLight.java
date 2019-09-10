import org.junit.Test;

import static org.junit.Assert.*;

public class TestTrafficLight {
    @Test public void CheckTestTrafficLight()
    {
        TrafficLight trafficLight = new TrafficLight();

        assertEquals(0, trafficLight.getPosition());
        assertFalse(trafficLight.isStatus());

        trafficLight.setPosition(8);
        trafficLight.setStatus();

        assertEquals(8, trafficLight.getPosition());
        assertTrue(trafficLight.isStatus());

    }
}
