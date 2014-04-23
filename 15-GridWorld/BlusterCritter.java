import info.gridworld.actor.Actor;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import java.util.ArrayList;
import java.awt.Color;

public class BlusterCritter extends Critter{
    int c;
    public BlusterCritter(int x){
	super();
	c = x;
    }
    public ArrayList<Actor> getActors(){
	ArrayList<Actor> actors = new ArrayList<Actor>();

	Location l = getLocation();
	for (int r = l.getRow-2; r<l.getRow+2;r++){
	    for (int c = l.getCol-2;c<l.getCol+2;c++){
		Location tmp = new Location(r,c);
		Grid<Actor> g = getGrid();
		if (g.isValid(tmp)){
		    Actor a = g.get(tmp);
		    if (a != null)
			actors.add(a)
			    }
	    }
	}
    }
}
