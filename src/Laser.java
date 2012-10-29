import geometry.*;

import idraw.*;

import java.awt.Color;

public class Laser {
	Posn loc;
	
	Laser(Posn loc){
		this.loc = loc;
	}
	
	public void moveUp(){
		this.loc.y = this.loc.y - 10;
	}
	
	public boolean draw(Canvas c){
		c.drawRect(new Posn(this.loc.x, this.loc.y), GameWorld.LASER_WIDTH, GameWorld.LASER_HIEGHT, Color.orange);
		return true;
	}

}
