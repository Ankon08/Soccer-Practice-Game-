public class Field {
    //instance variables
    //x and y coordinates of top left corner of the field
    //length and width of the field
    protected double xpos,ypos,length,width;

    //constructor
    public Field(double xpos,double ypos,double length,double width){
        this.xpos = xpos;
        this.ypos = ypos;
        this.length = length;
        this.width = width;
    }

    //toString to display the values of instance variables
    public String toString() {
        return "Field:" +
                "[" + xpos +
                "," + ypos +
                "]" + length +
                "," + width;
    }
}
