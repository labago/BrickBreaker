import geometry.*;

import idraw.*;

import java.awt.Color;

public class Rocket {
	Posn loc;
	
	Rocket(Posn loc){
		this.loc = loc;
	}
	
	public void moveUp(){
		this.loc.y = this.loc.y - 10;
	}
	
	public boolean draw(Canvas c){
		c.drawRect(new Posn(this.loc.x, this.loc.y), 30, GameWorld.LASER_HIEGHT - 10, Color.black);
		c.drawRect(new Posn(this.loc.x, this.loc.y), 30, 10, Color.orange);
		return true;
	}

}