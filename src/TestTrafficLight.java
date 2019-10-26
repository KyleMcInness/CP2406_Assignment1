import model.Road;
import model.TrafficLight;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class TestTrafficLight {
    @Test
    void initialState() {
        TrafficLight trafficLight = new TrafficLight(1, 1, Color.red);
        Road road = new Road(1, 1, Color.red);
        assertEquals(TrafficLight.State.GO, trafficLight.getState());
        assertEquals(10, trafficLight.getPositionY());
        assertEquals(road.getHeight(), trafficLight.getPositionX());
    }

    @Test
    void stateStop() {
        TrafficLight trafficLight = new TrafficLight(1, 1, Color.red);
        Object state = trafficLight.setState();

        while (state != TrafficLight.State.STOP)
            state = trafficLight.setState();

        assertEquals(TrafficLight.State.STOP, trafficLight.getState());
    }
}
