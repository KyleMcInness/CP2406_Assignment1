import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class TestTrafficLight {
    @Test
    void initialState() {
        TrafficLight trafficLight = new TrafficLight(10, 10);
        Road road = new Road(1, 1, true);
        assertEquals(20, trafficLight.getWidth());
        assertEquals(TrafficLight.State.STOP, trafficLight.getState());
        assertEquals(10, trafficLight.getPositionY());
        assertEquals(10, trafficLight.getPositionX());
    }

    @Test
    void stateGo() {
        TrafficLight trafficLight = new TrafficLight(10, 10);
        Object state = trafficLight.setState();

        while (state != TrafficLight.State.STOP)
            state = trafficLight.setState();

        assertEquals(TrafficLight.State.STOP, trafficLight.getState());
    }
}
