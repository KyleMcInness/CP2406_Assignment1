import model.Car;
import model.Road;
import model.TrafficLight;

import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {
    private Timer timer;
    JButton button = new JButton();
    Road road = new Road(10, 100, Color.darkGray, true);
    Road road2 = new Road(210,100, Color.darkGray, false);
    Car car = new Car(road.getX() + 5, road.getY() + 5, 1, 0);
    TrafficLight trafficLight = new TrafficLight(road.getWidth() + road.getX() - 26, road.getY() - 26, Color.red);

    public Main() {
        super();
        add(button);
        button.addActionListener(actionEvent -> animate());
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
                car.update(trafficLight.getPositionX(), trafficLight.getPositionY(), trafficLight.getState());

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
        trafficLight.paintComponent(g);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new Main());
        frame.setSize(500, 400);
        frame.setVisible(true);
    }
}

