import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Location;

impoery java.util.ArrayList;

public class ChameleonKid extends ChameleonCritter{
    private static final double DARKENING_FACTOR = 0.05;

    public void processActors(){
	Actor Front = getGrid().get(Location.AHEAD);
	Actor Behind = getGrid().get(Location.HALF_CIRCLE);
	if (Front == null && Behind == null){
	    darken();
	    return;
	}
	else if ( Front == null)
	    setColor(Back.getColor());
	else if (Back == null)
	    setColor(Front.getColor());
	else{
	    int r =(int) (Math.random() *100 + 1);
	    if (r < 50)
		setColor(Front.getColor());
	    else 
		setColor(Back.getColor());
	}
    }
}
