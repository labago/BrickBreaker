import geometry.*;

import idraw.*;

import java.awt.Color;

public class PowerUp {
	Color color;
	String name;
	Posn loc;
	int release = 0;
	public PowerUp(Color color, String name, Posn loc) {
		this.color = color;
		this.name = name;
		this.loc = loc;
	}
	
	public void moveDown(){
		this.loc.y = this.loc.y + 2;
	}
	
	public boolean draw(Canvas c){
		c.drawRect(new Posn(this.loc.x, this.loc.y), GameWorld.POWER_WIDTH, GameWorld.POWER_HIEGHT, this.color);
		c.drawString(new Posn(this.loc.x + 10, this.loc.y + 20), this.name);
		return true;
	}
	

}
