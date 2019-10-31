import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {
    Timer timer;
    private Road road = new Road(60, 60, true);
    Road road2 = new Road(260, 60, false);
    Road road3 = new Road(304, 216, true);
    Car car = new Car(road.getX() + 2, road.getY() + 2, 1, 0);
    TrafficLight trafficLight = new TrafficLight(road.getX() + road.getWidth() - 21, road.getY() - 21);


    public Main() {
        super();
        animate();
    }

    private void animate() {

        Boolean is_animate = Boolean.FALSE;

        while (!is_animate) {
            if (timer != null) {
                timer.stop();
            }
            timer = new Timer(1000 / 60, e -> {
                car.move();
                trafficLight.setState();
                repaint();
                car.update(trafficLight.getPositionX(), trafficLight.getPositionY(), trafficLight.getState(), car.getOrientation(), road);

            });
            timer.start();
            is_animate = Boolean.TRUE;
        }

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        car.paintComponent(g);
        road.paintComponent(g);
        road2.paintComponent(g);
        road3.paintComponent(g);
        trafficLight.paintComponent(g);
    }

    public static void main(String[] args) {
        Frame frame = new Frame();

        frame.setSize(564, 500);
        frame.setVisible(true);
        frame.pack();

        frame.add(new Main());
        frame.setVisible(true);
    }
}

