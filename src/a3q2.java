
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author akhan
 */
public class a3q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create city and robot
        City kw = new City();
        Robot bob = new Robot(kw,1,1,Direction.EAST);
        // creating walls
        new Wall(kw,1,1,Direction.NORTH);
        new Wall(kw,1,2,Direction.NORTH);
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
        // creating things
        new Thing(kw,1,2);
        new Thing(kw,2,2);
        new Thing(kw,2,3);
        new Thing(kw,2,4);
        new Thing(kw,3,1);
        new Thing(kw,3,4);
        // 
        bob.move();
        while( bob.canPickThing()){
            bob.pickThing();}
        
        for(int ThingsInBackpack = 0; ThingsInBackpack == 1; ThingsInBackpack = ThingsInBackpack + 1){
            bob.turnLeft();
            bob.turnLeft();
            bob.turnLeft();
            bob.move();
        }
     
       
        
            
    
        

    }
    
}
