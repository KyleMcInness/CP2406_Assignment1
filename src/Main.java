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

        for (int i = 0; i < roads.length; car.setPosition(1), i++) { // Iterate for every road object created, resetting the car's position
            for (;car.getPosition() <= roads[i].getLength(); car.move()) { // Loops while the car's position is lower than the current road's length

                if (car.getPosition() == traffic_light.getPosition() - 1 && i == 0) // Sets traffic light to green when the car reaches the position before it and it's on the first road
                {
                    traffic_light.setStatus(); // Change the status of the traffic light to true
                    for(int x = 0; x < 1000000000; ++x) // Add a delay
                        for(int y = 0; y < 1000000000; ++y);
                }

                System.out.printf("Car: Road %s, Segment %d : %s\n", i+1, car.getPosition(), traffic_light.isStatus()); // Outputs the cars current position on the road
            }
        }
    }
}
