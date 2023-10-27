/**
 * Name - Ankon Biswas
 * ID - B00915283
 * Description- The Demo class simulates a soccer game by setting up players, a field, and a soccer ball.
 * It demonstrates the players kicking the ball with random distances and angles,
 * displaying the resulting ball positions and whether the kicks resulted in reflections.
 */
import java.util.Scanner;//not used but kept for good practice
public class Demo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);//not used but kept for good practice

        Ball soccerBall;
        Field dalField;
        Player ankon;

        // Initializing players, field, and soccer ball
        System.out.println("SOCCER GAME SETUP!");
        ankon = new Player("Ankon");
        dalField = new Field(0.0, 0.0, 500.0, 400.0);
        soccerBall = new Ball(100.0, 200.0);

        // Displaying initial setup
        System.out.println(ankon + "\n" + dalField + "\n" + soccerBall);
        System.out.println("\n");

        for(int i=0; i<10; i++){

            // Generating random distance and angle for player 1
            double distanceOne = (Math.random() * (700.0-200.0)) + 200.0;
            double angleOne = (Math.random() * (360.0-0.0)) + 0.00;
            Player playerOne = new Player("(1)");

            // Kicking the ball and checking for reflection
            boolean reflection1 = playerOne.kick(dalField, soccerBall, distanceOne, angleOne);

            // Displaying kick details and ball position
            System.out.println(playerOne + " kicks the ball for a distance of " + distanceOne +
                    " pixels at " + angleOne + " degrees.");
            System.out.println(soccerBall);
            System.out.println("Reflection: "+ reflection1);


            // Generating random distance and angle for player 2
            double distanceTwo = (Math.random() * (700.0-200.0)) + 200.0;
            double angleTwo= (Math.random() * (360.0-0.0)) + 0.00;
            Player playerTwo = new Player("(2)");

            // Kicking the ball and checking for reflection
            boolean reflection2 = playerTwo.kick(dalField, soccerBall, distanceTwo, angleTwo);

            // Displaying kick details and ball position
            System.out.println(playerTwo + " kicks the ball for a distance of " + distanceTwo +
                    " pixels at " + angleTwo + " degrees.");
            System.out.println(soccerBall);
            System.out.println("Reflection: " + reflection2);

            //Displaying which of the kicks resulted in the ball being reflected
            if (reflection1 && reflection2) {
                System.out.println("Both players' kicks reflected the ball!");
            } else if (reflection1) {
                System.out.println("Player 1's kick reflected the ball!");
            } else if (reflection2) {
                System.out.println("Player 2's kick reflected the ball!");
            } else {
                System.out.println("None of the kicks reflected the ball.");
            }
            System.out.println("\n"); //giving a line break for the next output

        }
    }
}