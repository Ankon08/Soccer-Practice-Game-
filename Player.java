public class Player {

    //instance variable
    private String name;

    //constructor
    public Player(String name){
        this.name = name;
    }

    //Displaying the player name
    public String toString() {
        return "Player " + name;
    }

    /* kick method for the players to kick the ball assuming the player is
    *  always near the ball. */
    public boolean kick(Field f, Ball b, double d, double r) {

        //changing the value of degree to radians
        double r_radians = Math.toRadians(r);
        double sinValue = Math.sin(r_radians);
        double cosValue = Math.cos(r_radians);

        //calculating the new coordinates
        double nx = b.getBx() + d * cosValue;
        double ny = b.getBy() + d * sinValue;

        if (nx > f.xpos && nx < f.xpos + f.length && ny > f.ypos && ny < f.ypos + f.width) {
            // New position is within the field bounds.
            // Update the ball's coordinates.
            b.setBx(nx);
            b.setBy(ny);

        }
        else{
            //nx and ny is reflected on right-y boundary(x.pos +length)
            if(nx > f.xpos && nx >= f.xpos + f.length && ny > f.ypos && ny < f.ypos + f.width){
                b.setBy(ny);
            }
            //nx and ny is reflected on bottom-x boundary(y.pos +width)
            else if (ny > f.ypos && ny >= f.ypos + f.width && nx > f.xpos && nx < f.xpos + f.length) {
                b.setBx(nx);
            }
            //nx and ny is reflected on left-y boundary
            else if (nx < f.xpos && ny > f.ypos && ny < f.ypos + f.width ) {
                b.setBy(ny);
            }
            //nx and ny is reflected on upper-x boundary
            else if (ny < f.ypos && nx > f.xpos && nx < f.xpos + f.length ) {
                b.setBx(nx);
            }
            //if both nx and ny are out of the bounds then balls reflects back to original position
            else{
                b.setBx(b.getBx());
                b.setBy(b.getBy());
            }

        }

        // Define a small threshold value (EPSILON) for comparing doubles
        double EPSILON = 1e-8;

        // Check if the ball is reflected and return true, else return false
        if (nx > f.xpos + f.length + EPSILON || nx < f.xpos - EPSILON ||
                ny > f.ypos + f.width + EPSILON || ny < f.ypos - EPSILON) {
            // Ball is reflected, return true
            return true;
        } else {
            // Ball is not reflected, return false
            return false;
        }
    }
}
