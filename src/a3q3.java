
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khant5061
 */
public class a3q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // create city and robot
        City kw = new City();
        Robot bob = new Robot(kw,1,1,Direction.EAST);
        // creating walls
        new Wall(kw,1,1,Direction.NORTH);
        new Wall(kw,1,3,Direction.NORTH);
        new Wall(kw,1,4,Direction.NORTH);
        new Wall(kw,1,4,Direction.EAST);
        new Wall(kw,2,4,Direction.EAST);
        new Wall(kw,3,4,Direction.EAST);
        new Wall(kw,3,4,Direction.SOUTH);
        new Wall(kw,3,3,Direction.SOUTH);
        new Wall(kw,3,2,Direction.SOUTH);
        new Wall(kw,3,1,Direction.SOUTH);
        new Wall(kw,1,1,Direction.WEST);
        new Wall(kw,2,1,Direction.WEST);
        new Wall(kw,3,1,Direction.WEST);
        //
        bob.move();
        if (bob.isBesideThing(IPredicate.aWall)== false){
            bob.turnLeft();
            bob.move();}
    }
}
