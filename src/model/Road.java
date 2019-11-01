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

    void setDimensions(Boolean is_horizontal) //  sets the road to be a random length between 6 and 15
    {
        if (!is_horizontal) {
            this.is_horizontal = false;
            this.width = height;
            this.height = width;
        }
        else
            this.is_horizontal = true;
    }
    int getX() {return this.x;}
    int getY() {return this.y;}
    int getHeight() {
        return this.height;
    }
    int getWidth() {
        return this.width;
    }
    Boolean getOrientation() {return this.is_horizontal;}

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
