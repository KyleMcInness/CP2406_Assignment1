import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class TestTrafficLight {
    @Test
    void initialState() {
        TrafficLight trafficLight = new TrafficLight(1, 1);
        Road road = new Road(1, 1, true);
        assertEquals(TrafficLight.State.GO, trafficLight.getState());
        assertEquals(10, trafficLight.getPositionY());
        assertEquals(road.getHeight(), trafficLight.getPositionX());
    }

    @Test
    void stateStop() {
        TrafficLight trafficLight = new TrafficLight(1, 1);
        Object state = trafficLight.setState();

        while (state != TrafficLight.State.STOP)
            state = trafficLight.setState();

        assertEquals(TrafficLight.State.STOP, trafficLight.getState());
    }
}