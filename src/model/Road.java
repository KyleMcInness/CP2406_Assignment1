import java.awt.*;

public class Road extends Shape{
    private int height = 44, width = 200;

    private Boolean is_horizontal;

    public Road(int x, int y, Boolean is_horizontal) {
        super(x, y);
        this.x = x;
        this.y = y;
        this.is_horizontal = is_horizontal;
        this.color = Color.darkGray;
        setDimensions(is_horizontal);
    }

    public void setDimensions(Boolean is_horizontal) //  sets the road to be a random length between 6 and 15
    {
        if (!is_horizontal) {
            this.is_horizontal = false;
            this.width = height;
            this.height = width;
        }
        else
            this.is_horizontal = true;
    }
    public int getX() {return this.x;}
    public void setX(int x) {this.x = x;}
    public int getY() {return this.y;}
    public void setY(int y) {this.y = y;}
    public int getHeight() {
        return this.height;
    }
    public int getWidth() {
        return this.width;
    }
    public Boolean getOrientation() {return this.is_horizontal;}

    @Override
    public void update(int boundaryWidth, int boundaryHeight, TrafficLight.State state) { }

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(color);
        is_horizontal = getOrientation();

        if (is_horizontal)
            g.drawRect(x, y, 200, 44);
        else
            g.drawRect(x, y, 44, 200);
    }
}
