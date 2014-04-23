import info.gridworld.actor.*;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;

public class Jumper extends Actor{
    public Jumper(Color jcolor){
	setColor(jcolor);
    }

 
    public void act(){
	if (canJump() == true)
	    jump();
	else 
	    turn();
    }

    public void turn(){
	setDirection(getDirection + Location.HALF_RIGHT);
    }

    public boolean canJump(){
	Grid<Actor> g = getGrid();
	if (g == null)
	    return false;
	int a = getDirection();
	Location l = getLocation;
	Location next = l.getAdjacentLocation(a).getAdjacentLocation(a);
	if (g.isValid(next)== false){
	    return false;
	}
	Actor n = g.get(next);
	if (n == null || n == flower)
	    return true;
	return false;
    }

    public void jump(){
	Grid<Actor> g = getGrid();
	if (g == null)
	    return;
	Location l = getLocation();
	int a = getDirection();
	Location next = l.getAdjacentLocation(a).getAdjacentLocation(a);
	if ( g.isValid(next)){
	    moveTo(next);
	}
	else 
	    removeSelfFromGrid();
    }

}
