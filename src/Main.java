import model.Car;
import model.Road;
import model.TrafficLight;

import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {
    private Timer timer;
    JButton button = new JButton();
    Road road = new Road(10, 100, Color.darkGray);
    Road road2 = new Road(road.getWidth() + road.getPositionX(),100, Color.darkGray);
    Car car = new Car(11, 102, 40, 20, Color.blue, 1, 0);
    TrafficLight trafficLight = new TrafficLight(road.getWidth() + road.getPositionX() - 26, road.getPositionY() - 26, Color.red);

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
                if (car.getXDir() == 1 || car.getXDir() == -1) {
                    car.moveX();

                } else if (car.getYDir() == 1 || car.getYDir() == -1) {
                    car.moveY();
                }

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

