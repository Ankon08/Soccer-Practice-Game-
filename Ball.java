public class Ball {

    //instance variables
    //x and y coordinates of the ball
    private double bx,by;

    //constructor
    public Ball(double bx, double by){
        this.bx = bx;
        this.by = by;
    }

    //getter methods
    public double getBx() {
        return bx;
    }

    public double getBy() {
        return by;
    }

    //setter methods
    public void setBx(double bx) {
        this.bx = bx;
    }

    public void setBy(double by) {
        this.by = by;
    }

    //to print the new position of the ball
    public String toString() {
        return "Ball is at (" + bx + "," + by + ")";
    }
}
