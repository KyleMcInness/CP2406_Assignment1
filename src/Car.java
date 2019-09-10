class Car {
    // Declare variables
    private int position;
    private int length;

    public Car()
    {
        this.position = 1;
        this.length = 1;
    }

    public void move() // Moves the car 1 position forward
    {
        this.position++;
    }

    // Setters and Getters

    public void setPosition(int length)
    {
        this.position = length;
    }

    public int getLength()
    {
        return this.length;
    }

    public int getPosition()
    {
        return this.position;
    }
}
