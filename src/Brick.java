import geometry.*;

import idraw.*;

import java.awt.Color;

public class Brick {
	Color color;
	Posn loc;
	int hits;
	public Brick(Color color, Posn loc, int hits) {
		this.color = color;
		this.loc = loc;
		this.hits = hits;
	}
	
	public boolean draw(Canvas c){
		c.drawRect(new Posn(this.loc.x, this.loc.y), GameWorld.BRICK_WIDTH, GameWorld.BRICK_HIEGHT, this.color);
		c.drawLine(new Posn(this.loc.x, this.loc.y), new Posn(this.loc.x + GameWorld.BRICK_WIDTH, this.loc.y), Color.black);
		c.drawLine(new Posn(this.loc.x + GameWorld.BRICK_WIDTH, this.loc.y), new Posn(this.loc.x + GameWorld.BRICK_WIDTH, this.loc.y + GameWorld.BRICK_HIEGHT), Color.black);
		c.drawLine(new Posn(this.loc.x + GameWorld.BRICK_WIDTH, this.loc.y + GameWorld.BRICK_HIEGHT), new Posn(this.loc.x, this.loc.y + GameWorld.BRICK_HIEGHT), Color.black);
		c.drawLine(new Posn(this.loc.x, this.loc.y + GameWorld.BRICK_HIEGHT), new Posn(this.loc.x, this.loc.y), Color.black);
		return true;
	}
	
	

}
