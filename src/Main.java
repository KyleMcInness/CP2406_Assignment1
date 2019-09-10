public class Main
{
    public static void main(String[] args) {

        // Initialises each object
        Car car = new Car();
        Road road = new Road();
        Road road1 = new Road();
        TrafficLight traffic_light = new TrafficLight();

        // Set lengths for each road and the traffic lights
        road.setLength(car.getLength());
        road1.setLength(car.getLength());
        Road[] roads = {road, road1};
        traffic_light.setPosition(road.getLength());

        // Outputs current values for each object
        System.out.printf("Traffic light position: %d ; ", traffic_light.getPosition());
        System.out.printf("1st road length: %d ; ", road.getLength());
        System.out.printf("2nd road length: %d\n", road1.getLength());

    }
}
