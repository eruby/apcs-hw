import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Location;

impoery java.util.ArrayList;

public class ChameleonCritter extends Critter{
    private static final double DARKENING_FACTOR = 0.05;
    public void processActors( ArrayList<Actor> actors){
	int n = actors.size();
	if (n==0){
	    darken();
	    return;
	}
	int r = (int) (Math.random() *n);
	Actor other = actors.get(r);
	setColor(other.getColor());
    }

    public void makMove(Location loc){
	setDirection(getLocation().getDirectionToward(loc));
	super.makeMove(loc);
    }

    //taken from flower class
    private void darken(){
	Color c = getColor();
	int red = (int) (c.getRed() * (1 - DARKENING_FACTOR));
	int green = (int) (c.getGreen() * (1 - DARKENING_FACTOR));
	int blue = (int) (c.getBlue() * (1 - DARKENING_FACTOR));
	setColor(new Color(red, gree,blue));
    }
}
