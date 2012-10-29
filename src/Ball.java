import geometry.*;

import idraw.*;

import java.awt.Color;

public class Ball {
	Color color;
	Posn loc;
	int radius;
	String dir;
	public Ball(Color color, Posn loc, int radius, String dir) {
		this.color = color;
		this.loc = loc;
		this.radius = radius;
		this.dir = dir;
	}
	public void moveLeft(){
		this.loc.x = this.loc.x - 30;
	}
	
	public void moveRight(){
		this.loc.x = this.loc.x + 30;
	}
	
	public boolean draw(Canvas c){
		c.drawDisk(new Posn(this.loc.x, this.loc.y), this.radius, this.color);
		return true;
	}
	
	public void moveUpLeft(){
		this.loc.x = this.loc.x - 5;
		this.loc.y = this.loc.y - 5;
	}
	
	public void moveUpRight(){
		this.loc.x = this.loc.x + 5;
		this.loc.y = this.loc.y - 5;
	}
	
	public void moveDownLeft(){
		this.loc.x = this.loc.x - 5;
		this.loc.y = this.loc.y + 5;
	}
	
	public void moveDownRight(){
		this.loc.x = this.loc.x + 5;
		this.loc.y = this.loc.y + 5;
	}
	
	public void moveUpLeftLeft(){
		this.loc.x = this.loc.x - 10;
		this.loc.y = this.loc.y - 5;
	}
	
	public void moveUpRightRight(){
		this.loc.x = this.loc.x + 10;
		this.loc.y = this.loc.y - 5;
	}
	
	public void moveDownLeftLeft(){
		this.loc.x = this.loc.x - 10;
		this.loc.y = this.loc.y + 5;
	}
	
	public void moveDownRightRight(){
		this.loc.x = this.loc.x + 10;
		this.loc.y = this.loc.y +5;
	}
	public void moveUpUpLeft(){
		this.loc.x = this.loc.x - 5;
		this.loc.y = this.loc.y - 10;
	}
	
	public void moveUpUpRight(){
		this.loc.x = this.loc.x + 5;
		this.loc.y = this.loc.y - 10;
	}
	
	public void moveDownDownLeft(){
		this.loc.x = this.loc.x - 5;
		this.loc.y = this.loc.y + 10;
	}
	
	public void moveDownDownRight(){
		this.loc.x = this.loc.x + 5;
		this.loc.y = this.loc.y + 10;
	}
	

}
