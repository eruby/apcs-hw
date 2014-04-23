import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.*;
import info.gridworld.grid.*;

public class JumperRunner{
    public static void main(String[] args){
	ActorWorld w = new ActorWorld();
	w.add( new Jumper(RED));
	w.add(new Rock());
	w.add(new Flower());
	w.add(new Bug());

	world.show();
    }
}
