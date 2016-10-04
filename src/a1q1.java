
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khant5061
 */
public class a1q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         City kw = new City();
        Robot bob = new Robot(kw,1,1,Direction.EAST);
        // things
        new Wall(kw,1,5,Direction.EAST);
        new Thing(kw,1,6);
        // counting using while loop
        // create counter variable 
        int count = 0;
        // loop 5 times
        while (count < 4){
            // move robot
            bob.move();
            // count 1 step
            count = count +1;
        }
    }
}
