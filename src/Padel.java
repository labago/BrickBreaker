import geometry.*;

import idraw.*;

import java.awt.Color;

public class Padel {
	Color color;
	Posn loc;
	
	Padel(Color color, Posn loc){
		this.color = color;
		this.loc = loc;
	 } 

	
	
	public boolean draw(Canvas c){
		c.drawRect(new Posn(this.loc.x, this.loc.y), (int)(GameWorld.PADEL_WIDTH * (1.0/3.0)), (int)GameWorld.PADEL_HIEGHT, Color.green);
		c.drawRect(new Posn(this.loc.x + (int)(GameWorld.PADEL_WIDTH * (1.0/3.0)), this.loc.y), (int)(GameWorld.PADEL_WIDTH * (1.0/3.0)), (int)GameWorld.PADEL_HIEGHT, Color.white);
		c.drawRect(new Posn(this.loc.x + (int)(GameWorld.PADEL_WIDTH * (2.0/3.0)), this.loc.y), (int)(GameWorld.PADEL_WIDTH * (1.0/3.0)), (int)GameWorld.PADEL_HIEGHT, Color.red);
		c.drawLine(new Posn(this.loc.x, this.loc.y), new Posn(this.loc.x + (int)GameWorld.PADEL_WIDTH, this.loc.y), Color.black);
		c.drawLine(new Posn(this.loc.x + (int)GameWorld.PADEL_WIDTH, this.loc.y), new Posn(this.loc.x + (int)GameWorld.PADEL_WIDTH, this.loc.y + GameWorld.BRICK_HIEGHT), Color.black);
		c.drawLine(new Posn(this.loc.x + (int)GameWorld.PADEL_WIDTH, this.loc.y + GameWorld.PADEL_HIEGHT), new Posn(this.loc.x, this.loc.y + GameWorld.BRICK_HIEGHT), Color.black);
		c.drawLine(new Posn(this.loc.x, this.loc.y + GameWorld.PADEL_HIEGHT), new Posn(this.loc.x, this.loc.y), Color.black);
		return true;
	}
	
	
	public void moveLeft(){
		this.loc.x = this.loc.x - 30;
	}
	
	public void moveRight(){
		this.loc.x = this.loc.x + 30;
	}

}
