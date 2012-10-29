import java.util.ArrayList;

import geometry.*;
import colors.*;
import idraw.*;
import java.awt.Color;


public class GameWorld2 extends World{
	Color background;
	Padel padel;
	ArrayList<Ball> balls = new ArrayList<Ball>();
	ArrayList<Brick> bricks;
	int score = 0;
	int level = 1;
	int lives = 3;
	int paused = 0;
	int holdBall = 1;
	int selector = 0;
	int ammo = 0;
	int rocket = 0;
	int tickCount = 500;
	int play = 0;
	int switchh = 0;
	Color background2 = Color.MAGENTA;
	Color background3 = Color.magenta;
	ArrayList<Rocket> rockets = new ArrayList<Rocket>();
	String powerUp = "";
	ArrayList<Laser> lasers = new ArrayList<Laser>();
	ArrayList<PowerUp> powerUps = new ArrayList<PowerUp>();
	int laserCount = 0;
	public GameWorld2(Color background, Padel padel, Ball ball,
			ArrayList<Brick> bricks) {
		this.background = background;
		this.padel = padel;
		this.balls.add(ball);
		this.bricks = bricks;
	}
	
	
	public void initLevelOne(){
		this.bricks.add(new Brick(Color.red, new Posn(200, 200), 2));
		this.bricks.add(new Brick(Color.red, new Posn(200 + GameWorld.BRICK_WIDTH, 200), 2));
		this.bricks.add(new Brick(Color.red, new Posn(200 + (GameWorld.BRICK_WIDTH * 2), 200), 2));
		this.bricks.add(new Brick(Color.red, new Posn(200 + (GameWorld.BRICK_WIDTH * 3), 200), 2));
		this.bricks.add(new Brick(Color.red, new Posn(200 + (GameWorld.BRICK_WIDTH * 4), 200), 2));
		this.bricks.add(new Brick(Color.red, new Posn(200 + (GameWorld.BRICK_WIDTH * 5), 200), 2));
		this.bricks.add(new Brick(Color.red, new Posn(200 + (GameWorld.BRICK_WIDTH * 6), 200), 2));
		this.bricks.add(new Brick(Color.red, new Posn(200 + (GameWorld.BRICK_WIDTH * 7), 200), 2));
		this.bricks.add(new Brick(Color.red, new Posn(200 + (GameWorld.BRICK_WIDTH * 8), 200), 2));
		this.bricks.add(new Brick(Color.red, new Posn(200 + (GameWorld.BRICK_WIDTH * 9), 200), 2));
		this.powerUps.add(this.randomPowerUp(this.bricks));
		this.powerUps.add(this.randomPowerUp(this.bricks));
	}
	
	public void initLevelTwo(){
		this.bricks.add(new Brick(Color.red, new Posn(300, 200), 2));
		this.bricks.add(new Brick(Color.red, new Posn(300 + GameWorld.BRICK_WIDTH, 200), 2));
		
		
		this.bricks.add(new Brick(Color.red, new Posn(300, 350), 2));
		this.bricks.add(new Brick(Color.red, new Posn(300 + GameWorld.BRICK_WIDTH, 350), 2));
		
		this.bricks.add(new Brick(Color.red, new Posn(300, 500), 2));
		this.bricks.add(new Brick(Color.red, new Posn(300 + GameWorld.BRICK_WIDTH, 500), 2));
		
		this.bricks.add(new Brick(Color.red, new Posn(750, 200), 2));
		this.bricks.add(new Brick(Color.red, new Posn(750 + GameWorld.BRICK_WIDTH, 200), 2));
		
		
		this.bricks.add(new Brick(Color.red, new Posn(750, 350), 2));
		this.bricks.add(new Brick(Color.red, new Posn(750 + GameWorld.BRICK_WIDTH, 350), 2));
		
		this.bricks.add(new Brick(Color.red, new Posn(750, 500), 2));
		this.bricks.add(new Brick(Color.red, new Posn(750 + GameWorld.BRICK_WIDTH, 500), 2));
		
		this.powerUps.add(this.randomPowerUp(this.bricks));
		this.powerUps.add(this.randomPowerUp(this.bricks));
	}
	
	public void initLevelThree(){
		this.bricks.add(new Brick(Color.red, new Posn(200, 200), 2));
		this.bricks.add(new Brick(Color.red, new Posn(200 + GameWorld.BRICK_WIDTH, 200), 2));
		this.bricks.add(new Brick(Color.red, new Posn(200 + (GameWorld.BRICK_WIDTH * 2), 200), 2));
		this.bricks.add(new Brick(Color.red, new Posn(200 + (GameWorld.BRICK_WIDTH * 3), 200), 2));
		this.bricks.add(new Brick(Color.red, new Posn(200 + (GameWorld.BRICK_WIDTH * 4), 200), 2));
		this.bricks.add(new Brick(Color.red, new Posn(200 + (GameWorld.BRICK_WIDTH * 5), 200), 2));
		this.bricks.add(new Brick(Color.red, new Posn(200 + (GameWorld.BRICK_WIDTH * 6), 200), 2));
		this.bricks.add(new Brick(Color.red, new Posn(200 + (GameWorld.BRICK_WIDTH * 7), 200), 2));
		this.bricks.add(new Brick(Color.red, new Posn(200 + (GameWorld.BRICK_WIDTH * 8), 200), 2));
		this.bricks.add(new Brick(Color.red, new Posn(200 + (GameWorld.BRICK_WIDTH * 9), 200), 2));
		this.bricks.add(new Brick(Color.blue, new Posn(200 + GameWorld.BRICK_WIDTH, 200  + GameWorld.BRICK_HIEGHT), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(200 + (GameWorld.BRICK_WIDTH * 2), 200 + GameWorld.BRICK_HIEGHT), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(200 + (GameWorld.BRICK_WIDTH * 3), 200 + GameWorld.BRICK_HIEGHT), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(200 + (GameWorld.BRICK_WIDTH * 4), 200 + GameWorld.BRICK_HIEGHT), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(200 + (GameWorld.BRICK_WIDTH * 5), 200 + GameWorld.BRICK_HIEGHT), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(200 + (GameWorld.BRICK_WIDTH * 6), 200 + GameWorld.BRICK_HIEGHT), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(200 + (GameWorld.BRICK_WIDTH * 7), 200 + GameWorld.BRICK_HIEGHT), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(200 + (GameWorld.BRICK_WIDTH * 8), 200 + GameWorld.BRICK_HIEGHT), 4));
		this.powerUps.add(this.randomPowerUp(this.bricks));
		this.powerUps.add(this.randomPowerUp(this.bricks));
		this.powerUps.add(this.randomPowerUp(this.bricks));
		this.powerUps.add(this.randomPowerUp(this.bricks));
	}
	
	public void initLevelFour(){
		this.bricks.add(new Brick(Color.red, new Posn(970, 400), 2));
		this.bricks.add(new Brick(Color.red, new Posn(970 - (GameWorld.BRICK_WIDTH * 1), 400 + (GameWorld.BRICK_HIEGHT * 1)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(970 - (GameWorld.BRICK_WIDTH * 2), 400 + (GameWorld.BRICK_HIEGHT * 2)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(970 - (GameWorld.BRICK_WIDTH * 3), 400 + (GameWorld.BRICK_HIEGHT * 3)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(970 - (GameWorld.BRICK_WIDTH * 4), 400 + (GameWorld.BRICK_HIEGHT * 4)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(970 - (GameWorld.BRICK_WIDTH * 5), 400 + (GameWorld.BRICK_HIEGHT * 5)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(970 - (GameWorld.BRICK_WIDTH * 6), 400 + (GameWorld.BRICK_HIEGHT * 6)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(970 - (GameWorld.BRICK_WIDTH * 7), 400 + (GameWorld.BRICK_HIEGHT * 7)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(970 - (GameWorld.BRICK_WIDTH * 0), 250 + (GameWorld.BRICK_HIEGHT * 0)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(970 - (GameWorld.BRICK_WIDTH * 1), 250 + (GameWorld.BRICK_HIEGHT * 1)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(970 - (GameWorld.BRICK_WIDTH * 2), 250 + (GameWorld.BRICK_HIEGHT * 2)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(970 - (GameWorld.BRICK_WIDTH * 3), 250 + (GameWorld.BRICK_HIEGHT * 3)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(970 - (GameWorld.BRICK_WIDTH * 4), 250 + (GameWorld.BRICK_HIEGHT * 4)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(970 - (GameWorld.BRICK_WIDTH * 5), 250 + (GameWorld.BRICK_HIEGHT * 5)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(970 - (GameWorld.BRICK_WIDTH * 6), 250 + (GameWorld.BRICK_HIEGHT * 6)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(970 - (GameWorld.BRICK_WIDTH * 7), 250 + (GameWorld.BRICK_HIEGHT * 7)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(970 - (GameWorld.BRICK_WIDTH * 8), 250 + (GameWorld.BRICK_HIEGHT * 8)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(970 - (GameWorld.BRICK_WIDTH * 9), 250 + (GameWorld.BRICK_HIEGHT * 9)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(970 - (GameWorld.BRICK_WIDTH * 10), 250 + (GameWorld.BRICK_HIEGHT * 10)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(970 - (GameWorld.BRICK_WIDTH * 0), 100 + (GameWorld.BRICK_HIEGHT * 0)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(970 - (GameWorld.BRICK_WIDTH * 1), 100 + (GameWorld.BRICK_HIEGHT * 1)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(970 - (GameWorld.BRICK_WIDTH * 2), 100 + (GameWorld.BRICK_HIEGHT * 2)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(970 - (GameWorld.BRICK_WIDTH * 3), 100 + (GameWorld.BRICK_HIEGHT * 3)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(970 - (GameWorld.BRICK_WIDTH * 4), 100 + (GameWorld.BRICK_HIEGHT * 4)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(970 - (GameWorld.BRICK_WIDTH * 5), 100 + (GameWorld.BRICK_HIEGHT * 5)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(970 - (GameWorld.BRICK_WIDTH * 6), 100 + (GameWorld.BRICK_HIEGHT * 6)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(970 - (GameWorld.BRICK_WIDTH * 7), 100 + (GameWorld.BRICK_HIEGHT * 7)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(970 - (GameWorld.BRICK_WIDTH * 8), 100 + (GameWorld.BRICK_HIEGHT * 8)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(970 - (GameWorld.BRICK_WIDTH * 9), 100 + (GameWorld.BRICK_HIEGHT * 9)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(970 - (GameWorld.BRICK_WIDTH * 10), 100 + (GameWorld.BRICK_HIEGHT * 10)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(810 - (GameWorld.BRICK_WIDTH * 0), 0 + (GameWorld.BRICK_HIEGHT * 0)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(810 - (GameWorld.BRICK_WIDTH * 1), 0 + (GameWorld.BRICK_HIEGHT * 1)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(810 - (GameWorld.BRICK_WIDTH * 2), 0 + (GameWorld.BRICK_HIEGHT * 2)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(810 - (GameWorld.BRICK_WIDTH * 3), 0 + (GameWorld.BRICK_HIEGHT * 3)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(810 - (GameWorld.BRICK_WIDTH * 4), 0 + (GameWorld.BRICK_HIEGHT * 4)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(810 - (GameWorld.BRICK_WIDTH * 5), 0 + (GameWorld.BRICK_HIEGHT * 5)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(810 - (GameWorld.BRICK_WIDTH * 6), 0 + (GameWorld.BRICK_HIEGHT * 6)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(810 - (GameWorld.BRICK_WIDTH * 7), 0 + (GameWorld.BRICK_HIEGHT * 7)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(810 - (GameWorld.BRICK_WIDTH * 8), 0 + (GameWorld.BRICK_HIEGHT * 8)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(500 - (GameWorld.BRICK_WIDTH * 0), 0 + (GameWorld.BRICK_HIEGHT * 0)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(500 - (GameWorld.BRICK_WIDTH * 1), 0 + (GameWorld.BRICK_HIEGHT * 1)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(500 - (GameWorld.BRICK_WIDTH * 2), 0 + (GameWorld.BRICK_HIEGHT * 2)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(500 - (GameWorld.BRICK_WIDTH * 3), 0 + (GameWorld.BRICK_HIEGHT * 3)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(500 - (GameWorld.BRICK_WIDTH * 4), 0 + (GameWorld.BRICK_HIEGHT * 4)), 2));
		this.powerUps.add(this.randomPowerUp(this.bricks));
		this.powerUps.add(this.randomPowerUp(this.bricks));
		this.powerUps.add(this.randomPowerUp(this.bricks));
		this.powerUps.add(this.randomPowerUp(this.bricks));
	}
	
	public void initLevelFive(){
		this.bricks.add(new Brick(Color.red, new Posn(200, 200), 2));
		this.bricks.add(new Brick(Color.red, new Posn(200 + GameWorld.BRICK_WIDTH, 200), 2));
		this.bricks.add(new Brick(Color.red, new Posn(200 + (GameWorld.BRICK_WIDTH * 2), 200), 2));
		this.bricks.add(new Brick(Color.red, new Posn(200 + (GameWorld.BRICK_WIDTH * 3), 200), 2));
		this.bricks.add(new Brick(Color.red, new Posn(200 + (GameWorld.BRICK_WIDTH * 4), 200), 2));
		this.bricks.add(new Brick(Color.red, new Posn(200 + (GameWorld.BRICK_WIDTH * 5), 200), 2));
		this.bricks.add(new Brick(Color.red, new Posn(200 + (GameWorld.BRICK_WIDTH * 6), 200), 2));
		this.bricks.add(new Brick(Color.red, new Posn(200 + (GameWorld.BRICK_WIDTH * 7), 200), 2));
		this.bricks.add(new Brick(Color.red, new Posn(200 + (GameWorld.BRICK_WIDTH * 8), 200), 2));
		this.bricks.add(new Brick(Color.red, new Posn(200 + (GameWorld.BRICK_WIDTH * 9), 200), 2));
		this.bricks.add(new Brick(Color.blue, new Posn(200 + GameWorld.BRICK_WIDTH, 200 + GameWorld.BRICK_HIEGHT), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(200 + (GameWorld.BRICK_WIDTH * 2), 200 + GameWorld.BRICK_HIEGHT), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(200 + (GameWorld.BRICK_WIDTH * 3), 200 + GameWorld.BRICK_HIEGHT), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(200 + (GameWorld.BRICK_WIDTH * 4), 200 + GameWorld.BRICK_HIEGHT), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(200 + (GameWorld.BRICK_WIDTH * 5), 200 + GameWorld.BRICK_HIEGHT), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(200 + (GameWorld.BRICK_WIDTH * 6), 200 + GameWorld.BRICK_HIEGHT), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(200 + (GameWorld.BRICK_WIDTH * 7), 200 + GameWorld.BRICK_HIEGHT), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(200 + (GameWorld.BRICK_WIDTH * 8), 200 + GameWorld.BRICK_HIEGHT), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(200 + GameWorld.BRICK_WIDTH, 200  + (GameWorld.BRICK_HIEGHT * 2)), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(200 + (GameWorld.BRICK_WIDTH * 2), 200 + (GameWorld.BRICK_HIEGHT * 2)), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(200 + (GameWorld.BRICK_WIDTH * 3), 200 + (GameWorld.BRICK_HIEGHT * 2)), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(200 + (GameWorld.BRICK_WIDTH * 4), 200 + (GameWorld.BRICK_HIEGHT * 2)), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(200 + (GameWorld.BRICK_WIDTH * 5), 200 + (GameWorld.BRICK_HIEGHT * 2)), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(200 + (GameWorld.BRICK_WIDTH * 6), 200 + (GameWorld.BRICK_HIEGHT * 2)), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(200 + (GameWorld.BRICK_WIDTH * 7), 200 + (GameWorld.BRICK_HIEGHT * 2)), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(200 + (GameWorld.BRICK_WIDTH * 8), 200 + (GameWorld.BRICK_HIEGHT * 2)), 4));
		this.bricks.add(new Brick(Color.red, new Posn(200, 200 + (GameWorld.BRICK_HIEGHT * 3)), 1));
		this.bricks.add(new Brick(Color.red, new Posn(200 + GameWorld.BRICK_WIDTH, 200 + (GameWorld.BRICK_HIEGHT * 3)), 1));
		this.bricks.add(new Brick(Color.red, new Posn(200 + (GameWorld.BRICK_WIDTH * 2), 200 + (GameWorld.BRICK_HIEGHT * 3)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(200 + (GameWorld.BRICK_WIDTH * 3), 200 + (GameWorld.BRICK_HIEGHT * 3)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(200 + (GameWorld.BRICK_WIDTH * 4), 200 + (GameWorld.BRICK_HIEGHT * 3)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(200 + (GameWorld.BRICK_WIDTH * 5), 200 + (GameWorld.BRICK_HIEGHT * 3)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(200 + (GameWorld.BRICK_WIDTH * 6), 200 + (GameWorld.BRICK_HIEGHT * 3)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(200 + (GameWorld.BRICK_WIDTH * 7), 200 + (GameWorld.BRICK_HIEGHT * 3)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(200 + (GameWorld.BRICK_WIDTH * 8), 200 + (GameWorld.BRICK_HIEGHT * 3)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(200 + (GameWorld.BRICK_WIDTH * 9), 200 + (GameWorld.BRICK_HIEGHT * 3)), 2));
		this.powerUps.add(this.randomPowerUp(this.bricks));
		this.powerUps.add(this.randomPowerUp(this.bricks));
		this.powerUps.add(this.randomPowerUp(this.bricks));
		this.powerUps.add(this.randomPowerUp(this.bricks));
		this.powerUps.add(this.randomPowerUp(this.bricks));
	}
	
	public void initLevelSix(){
		this.bricks.add(new Brick(Color.blue, new Posn(280, 400), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(320, 320), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(360, 240), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(400, 160), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(440, 80), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(490, 160), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(530, 240), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(570, 320), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(620, 240), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(660, 160), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(700, 80), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(750, 160), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(790, 240), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(830, 320), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(870, 400), 4));
		this.powerUps.add(this.randomPowerUp(this.bricks));
		this.powerUps.add(this.randomPowerUp(this.bricks));
	}

	// M
	public void initLevelSeven(){
		this.bricks.add(new Brick(Color.red, new Posn(200, 200), 2));
		this.bricks.add(new Brick(Color.red, new Posn(200 + GameWorld.BRICK_WIDTH, 200), 2));
		this.bricks.add(new Brick(Color.red, new Posn(200 + (GameWorld.BRICK_WIDTH * 2), 200), 2));
		this.bricks.add(new Brick(Color.red, new Posn(200 + (GameWorld.BRICK_WIDTH * 3), 200), 2));
		this.bricks.add(new Brick(Color.red, new Posn(200 + (GameWorld.BRICK_WIDTH * 4), 200), 2));
		this.bricks.add(new Brick(Color.red, new Posn(200 + (GameWorld.BRICK_WIDTH * 5), 200), 2));
		this.bricks.add(new Brick(Color.red, new Posn(200 + (GameWorld.BRICK_WIDTH * 6), 200), 2));
		this.bricks.add(new Brick(Color.red, new Posn(200 + (GameWorld.BRICK_WIDTH * 7), 200), 2));
		this.bricks.add(new Brick(Color.red, new Posn(200 + (GameWorld.BRICK_WIDTH * 8), 200), 2));
		this.bricks.add(new Brick(Color.red, new Posn(200 + (GameWorld.BRICK_WIDTH * 9), 200), 2));
		this.bricks.add(new Brick(Color.blue, new Posn(200, 200  + GameWorld.BRICK_HIEGHT), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(200 + GameWorld.BRICK_WIDTH, 200  + GameWorld.BRICK_HIEGHT), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(200 + (GameWorld.BRICK_WIDTH * 2), 200 + GameWorld.BRICK_HIEGHT), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(200 + (GameWorld.BRICK_WIDTH * 3), 200 + GameWorld.BRICK_HIEGHT), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(200 + (GameWorld.BRICK_WIDTH * 4), 200 + GameWorld.BRICK_HIEGHT), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(200 + (GameWorld.BRICK_WIDTH * 5), 200 + GameWorld.BRICK_HIEGHT), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(200 + (GameWorld.BRICK_WIDTH * 6), 200 + GameWorld.BRICK_HIEGHT), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(200 + (GameWorld.BRICK_WIDTH * 7), 200 + GameWorld.BRICK_HIEGHT), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(200 + (GameWorld.BRICK_WIDTH * 8), 200 + GameWorld.BRICK_HIEGHT), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(200 + (GameWorld.BRICK_WIDTH * 9), 200 + GameWorld.BRICK_HIEGHT), 4));
		this.bricks.add(new Brick(Color.red, new Posn(200, 200 + (GameWorld.BRICK_HIEGHT * 2)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(200 + GameWorld.BRICK_WIDTH, 200 + (GameWorld.BRICK_HIEGHT * 2)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(200 + (GameWorld.BRICK_WIDTH * 2), 200 + (GameWorld.BRICK_HIEGHT * 2)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(200 + (GameWorld.BRICK_WIDTH * 3), 200 + (GameWorld.BRICK_HIEGHT * 2)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(200 + (GameWorld.BRICK_WIDTH * 4), 200 + (GameWorld.BRICK_HIEGHT * 2)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(200 + (GameWorld.BRICK_WIDTH * 5), 200 + (GameWorld.BRICK_HIEGHT * 2)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(200 + (GameWorld.BRICK_WIDTH * 6), 200 + (GameWorld.BRICK_HIEGHT * 2)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(200 + (GameWorld.BRICK_WIDTH * 7), 200 + (GameWorld.BRICK_HIEGHT * 2)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(200 + (GameWorld.BRICK_WIDTH * 8), 200 + (GameWorld.BRICK_HIEGHT * 2)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(200 + (GameWorld.BRICK_WIDTH * 9), 200 + (GameWorld.BRICK_HIEGHT * 2)), 2));
		this.bricks.add(new Brick(Color.blue, new Posn(200, 200  + (GameWorld.BRICK_HIEGHT * 3)), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(200 + GameWorld.BRICK_WIDTH, 200 + (GameWorld.BRICK_HIEGHT * 3)), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(200 + (GameWorld.BRICK_WIDTH * 2), 200 + (GameWorld.BRICK_HIEGHT * 3)), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(200 + (GameWorld.BRICK_WIDTH * 3), 200 + (GameWorld.BRICK_HIEGHT * 3)), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(200 + (GameWorld.BRICK_WIDTH * 4), 200 + (GameWorld.BRICK_HIEGHT * 3)), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(200 + (GameWorld.BRICK_WIDTH * 5), 200 + (GameWorld.BRICK_HIEGHT * 3)), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(200 + (GameWorld.BRICK_WIDTH * 6), 200 + (GameWorld.BRICK_HIEGHT * 3)), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(200 + (GameWorld.BRICK_WIDTH * 7), 200 + (GameWorld.BRICK_HIEGHT * 3)), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(200 + (GameWorld.BRICK_WIDTH * 8), 200 + (GameWorld.BRICK_HIEGHT * 3)), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(200 + (GameWorld.BRICK_WIDTH * 9), 200 + (GameWorld.BRICK_HIEGHT * 3)), 4));
		this.powerUps.add(this.randomPowerUp(this.bricks));
		this.powerUps.add(this.randomPowerUp(this.bricks));
		this.powerUps.add(this.randomPowerUp(this.bricks));
		this.powerUps.add(this.randomPowerUp(this.bricks));
	}
	public void initLevelEight(){
		this.bricks.add(new Brick(Color.gray, new Posn(280, 600), 40000));
		this.bricks.add(new Brick(Color.gray, new Posn(280, 600 - (GameWorld.BRICK_HIEGHT * 1)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(280, 600 - (GameWorld.BRICK_HIEGHT * 2)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(280, 600 - (GameWorld.BRICK_HIEGHT * 3)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(280, 600 - (GameWorld.BRICK_HIEGHT * 4)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(280, 600 - (GameWorld.BRICK_HIEGHT * 5)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(280, 600 - (GameWorld.BRICK_HIEGHT * 6)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(280, 600 - (GameWorld.BRICK_HIEGHT * 7)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(280, 600 - (GameWorld.BRICK_HIEGHT * 8)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(280, 600 - (GameWorld.BRICK_HIEGHT * 9)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(280, 600 - (GameWorld.BRICK_HIEGHT * 10)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(280, 600 - (GameWorld.BRICK_HIEGHT * 11)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(280, 600 - (GameWorld.BRICK_HIEGHT * 12)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(280, 600 - (GameWorld.BRICK_HIEGHT * 13)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(280 + (GameWorld.BRICK_WIDTH * 1), 600), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(280 + (GameWorld.BRICK_WIDTH * 2), 600), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(280 + (GameWorld.BRICK_WIDTH * 3), 600), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(280 + (GameWorld.BRICK_WIDTH * 4), 600), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(280 + (GameWorld.BRICK_WIDTH * 5), 600), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(280 + (GameWorld.BRICK_WIDTH * 6), 600), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(280 + (GameWorld.BRICK_WIDTH * 7), 600), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(280 + (GameWorld.BRICK_WIDTH * 7), 600 - (GameWorld.BRICK_HIEGHT * 1)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(280 + (GameWorld.BRICK_WIDTH * 7), 600 - (GameWorld.BRICK_HIEGHT * 2)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(280 + (GameWorld.BRICK_WIDTH * 7), 600 - (GameWorld.BRICK_HIEGHT * 3)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(280 + (GameWorld.BRICK_WIDTH * 7), 600 - (GameWorld.BRICK_HIEGHT * 4)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(280 + (GameWorld.BRICK_WIDTH * 7), 600 - (GameWorld.BRICK_HIEGHT * 5)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(280 + (GameWorld.BRICK_WIDTH * 7), 600 - (GameWorld.BRICK_HIEGHT * 6)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(280 + (GameWorld.BRICK_WIDTH * 7), 600 - (GameWorld.BRICK_HIEGHT * 7)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(280 + (GameWorld.BRICK_WIDTH * 7), 600 - (GameWorld.BRICK_HIEGHT * 8)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(280 + (GameWorld.BRICK_WIDTH * 7), 600 - (GameWorld.BRICK_HIEGHT * 9)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(280 + (GameWorld.BRICK_WIDTH * 7), 600 - (GameWorld.BRICK_HIEGHT * 10)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(280 + (GameWorld.BRICK_WIDTH * 7), 600 - (GameWorld.BRICK_HIEGHT * 11)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(280 + (GameWorld.BRICK_WIDTH * 7), 600 - (GameWorld.BRICK_HIEGHT * 12)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(280 + (GameWorld.BRICK_WIDTH * 7), 600 - (GameWorld.BRICK_HIEGHT * 13)), 999999999));
		this.bricks.add(new Brick(Color.green, new Posn(280 + (GameWorld.BRICK_WIDTH * 1), 600 - (GameWorld.BRICK_HIEGHT * 1)), 6));
		this.bricks.add(new Brick(Color.green, new Posn(280 + (GameWorld.BRICK_WIDTH * 2), 600 - (GameWorld.BRICK_HIEGHT * 1)), 6));
		this.bricks.add(new Brick(Color.green, new Posn(280 + (GameWorld.BRICK_WIDTH * 3), 600 - (GameWorld.BRICK_HIEGHT * 1)), 6));
		this.bricks.add(new Brick(Color.green, new Posn(280 + (GameWorld.BRICK_WIDTH * 4), 600 - (GameWorld.BRICK_HIEGHT * 1)), 6));
		this.bricks.add(new Brick(Color.green, new Posn(280 + (GameWorld.BRICK_WIDTH * 5), 600 - (GameWorld.BRICK_HIEGHT * 1)), 6));
		this.bricks.add(new Brick(Color.green, new Posn(280 + (GameWorld.BRICK_WIDTH * 6), 600 - (GameWorld.BRICK_HIEGHT * 1)), 6));
		this.bricks.add(new Brick(Color.blue, new Posn(280 + (GameWorld.BRICK_WIDTH * 1), 600 - (GameWorld.BRICK_HIEGHT * 2)), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(280 + (GameWorld.BRICK_WIDTH * 2), 600 - (GameWorld.BRICK_HIEGHT * 2)), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(280 + (GameWorld.BRICK_WIDTH * 3), 600 - (GameWorld.BRICK_HIEGHT * 2)), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(280 + (GameWorld.BRICK_WIDTH * 4), 600 - (GameWorld.BRICK_HIEGHT * 2)), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(280 + (GameWorld.BRICK_WIDTH * 5), 600 - (GameWorld.BRICK_HIEGHT * 2)), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(280 + (GameWorld.BRICK_WIDTH * 6), 600 - (GameWorld.BRICK_HIEGHT * 2)), 4));
		this.bricks.add(new Brick(Color.red, new Posn(280 + (GameWorld.BRICK_WIDTH * 1), 600 - (GameWorld.BRICK_HIEGHT * 3)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(280 + (GameWorld.BRICK_WIDTH * 2), 600 - (GameWorld.BRICK_HIEGHT * 3)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(280 + (GameWorld.BRICK_WIDTH * 3), 600 - (GameWorld.BRICK_HIEGHT * 3)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(280 + (GameWorld.BRICK_WIDTH * 4), 600 - (GameWorld.BRICK_HIEGHT * 3)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(280 + (GameWorld.BRICK_WIDTH * 5), 600 - (GameWorld.BRICK_HIEGHT * 3)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(280 + (GameWorld.BRICK_WIDTH * 6), 600 - (GameWorld.BRICK_HIEGHT * 3)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(280 + (GameWorld.BRICK_WIDTH * 1), 600 - (GameWorld.BRICK_HIEGHT * 4)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(280 + (GameWorld.BRICK_WIDTH * 2), 600 - (GameWorld.BRICK_HIEGHT * 4)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(280 + (GameWorld.BRICK_WIDTH * 3), 600 - (GameWorld.BRICK_HIEGHT * 4)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(280 + (GameWorld.BRICK_WIDTH * 4), 600 - (GameWorld.BRICK_HIEGHT * 4)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(280 + (GameWorld.BRICK_WIDTH * 5), 600 - (GameWorld.BRICK_HIEGHT * 4)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(280 + (GameWorld.BRICK_WIDTH * 6), 600 - (GameWorld.BRICK_HIEGHT * 4)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(280 + (GameWorld.BRICK_WIDTH * 1), 600 - (GameWorld.BRICK_HIEGHT * 5)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(280 + (GameWorld.BRICK_WIDTH * 1), 600 - (GameWorld.BRICK_HIEGHT * 6)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(280 + (GameWorld.BRICK_WIDTH * 1), 600 - (GameWorld.BRICK_HIEGHT * 7)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(280 + (GameWorld.BRICK_WIDTH * 1), 600 - (GameWorld.BRICK_HIEGHT * 8)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(280 + (GameWorld.BRICK_WIDTH * 1), 600 - (GameWorld.BRICK_HIEGHT * 9)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(280 + (GameWorld.BRICK_WIDTH * 1), 600 - (GameWorld.BRICK_HIEGHT * 10)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(280 + (GameWorld.BRICK_WIDTH * 1), 600 - (GameWorld.BRICK_HIEGHT * 11)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(280 + (GameWorld.BRICK_WIDTH * 1), 600 - (GameWorld.BRICK_HIEGHT * 12)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(280 + (GameWorld.BRICK_WIDTH * 1), 600 - (GameWorld.BRICK_HIEGHT * 13)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(280 + (GameWorld.BRICK_WIDTH * 6), 600 - (GameWorld.BRICK_HIEGHT * 5)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(280 + (GameWorld.BRICK_WIDTH * 6), 600 - (GameWorld.BRICK_HIEGHT * 6)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(280 + (GameWorld.BRICK_WIDTH * 6), 600 - (GameWorld.BRICK_HIEGHT * 7)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(280 + (GameWorld.BRICK_WIDTH * 6), 600 - (GameWorld.BRICK_HIEGHT * 8)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(280 + (GameWorld.BRICK_WIDTH * 6), 600 - (GameWorld.BRICK_HIEGHT * 9)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(280 + (GameWorld.BRICK_WIDTH * 6), 600 - (GameWorld.BRICK_HIEGHT * 10)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(280 + (GameWorld.BRICK_WIDTH * 6), 600 - (GameWorld.BRICK_HIEGHT * 11)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(280 + (GameWorld.BRICK_WIDTH * 6), 600 - (GameWorld.BRICK_HIEGHT * 12)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(280 + (GameWorld.BRICK_WIDTH * 6), 600 - (GameWorld.BRICK_HIEGHT * 13)), 2));
		this.powerUps.add(this.randomPowerUp(this.bricks));
		this.powerUps.add(this.randomPowerUp(this.bricks));
		this.powerUps.add(this.randomPowerUp(this.bricks));
		this.powerUps.add(this.randomPowerUp(this.bricks));
		this.powerUps.add(this.randomPowerUp(this.bricks));
	}
	
	public void initLevelNine(){
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 0), 620 - (GameWorld.BRICK_HIEGHT * 0)), 999999999));
		
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 0), 620 - (GameWorld.BRICK_HIEGHT * 1)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 0), 620 - (GameWorld.BRICK_HIEGHT * 2)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 0), 620 - (GameWorld.BRICK_HIEGHT * 3)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 0), 620 - (GameWorld.BRICK_HIEGHT * 4)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 0), 620 - (GameWorld.BRICK_HIEGHT * 5)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 0), 620 - (GameWorld.BRICK_HIEGHT * 6)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 0), 620 - (GameWorld.BRICK_HIEGHT * 7)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 0), 620 - (GameWorld.BRICK_HIEGHT * 8)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 0), 620 - (GameWorld.BRICK_HIEGHT * 9)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 0), 620 - (GameWorld.BRICK_HIEGHT * 10)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 0), 620 - (GameWorld.BRICK_HIEGHT * 11)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 0), 620 - (GameWorld.BRICK_HIEGHT * 12)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 0), 620 - (GameWorld.BRICK_HIEGHT * 13)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 0), 620 - (GameWorld.BRICK_HIEGHT * 14)), 999999999));
		
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 0), 620 - (GameWorld.BRICK_HIEGHT * 0)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 1), 620 - (GameWorld.BRICK_HIEGHT * 0)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 2), 620 - (GameWorld.BRICK_HIEGHT * 0)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 3), 620 - (GameWorld.BRICK_HIEGHT * 0)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 4), 620 - (GameWorld.BRICK_HIEGHT * 0)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 5), 620 - (GameWorld.BRICK_HIEGHT * 0)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 6), 620 - (GameWorld.BRICK_HIEGHT * 0)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 7), 620 - (GameWorld.BRICK_HIEGHT * 0)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 8), 620 - (GameWorld.BRICK_HIEGHT * 0)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 9), 620 - (GameWorld.BRICK_HIEGHT * 0)), 999999999));
		
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 2), 600 - (GameWorld.BRICK_HIEGHT * 6)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 3), 600 - (GameWorld.BRICK_HIEGHT * 5)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 4), 600 - (GameWorld.BRICK_HIEGHT * 4)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 5), 600 - (GameWorld.BRICK_HIEGHT * 3)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 3), 600 - (GameWorld.BRICK_HIEGHT * 7)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 4), 600 - (GameWorld.BRICK_HIEGHT * 8)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 5), 600 - (GameWorld.BRICK_HIEGHT * 9)), 2));
		
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 6), 600 - (GameWorld.BRICK_HIEGHT * 8)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 7), 600 - (GameWorld.BRICK_HIEGHT * 7)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 8), 600 - (GameWorld.BRICK_HIEGHT * 6)), 2));
		
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 6), 600 - (GameWorld.BRICK_HIEGHT * 4)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 7), 600 - (GameWorld.BRICK_HIEGHT * 5)), 2));
		
		this.bricks.add(new Brick(Color.blue, new Posn(250 + (GameWorld.BRICK_WIDTH * 3), 600 - (GameWorld.BRICK_HIEGHT * 6)), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(250 + (GameWorld.BRICK_WIDTH * 4), 600 - (GameWorld.BRICK_HIEGHT * 5)), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(250 + (GameWorld.BRICK_WIDTH * 5), 600 - (GameWorld.BRICK_HIEGHT * 4)), 4));
		
		this.bricks.add(new Brick(Color.blue, new Posn(250 + (GameWorld.BRICK_WIDTH * 4), 600 - (GameWorld.BRICK_HIEGHT * 7)), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(250 + (GameWorld.BRICK_WIDTH * 5), 600 - (GameWorld.BRICK_HIEGHT * 8)), 4));
		
		this.bricks.add(new Brick(Color.blue, new Posn(250 + (GameWorld.BRICK_WIDTH * 6), 600 - (GameWorld.BRICK_HIEGHT * 7)), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(250 + (GameWorld.BRICK_WIDTH * 7), 600 - (GameWorld.BRICK_HIEGHT * 6)), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(250 + (GameWorld.BRICK_WIDTH * 6), 600 - (GameWorld.BRICK_HIEGHT * 5)), 4));
		
		this.bricks.add(new Brick(Color.green, new Posn(250 + (GameWorld.BRICK_WIDTH * 5), 600 - (GameWorld.BRICK_HIEGHT * 7)), 6));
		this.bricks.add(new Brick(Color.green, new Posn(250 + (GameWorld.BRICK_WIDTH * 6), 600 - (GameWorld.BRICK_HIEGHT * 6)), 6));
		this.bricks.add(new Brick(Color.green, new Posn(250 + (GameWorld.BRICK_WIDTH * 4), 600 - (GameWorld.BRICK_HIEGHT * 6)), 6));
		this.bricks.add(new Brick(Color.green, new Posn(250 + (GameWorld.BRICK_WIDTH * 5), 600 - (GameWorld.BRICK_HIEGHT * 5)), 6));
		
		this.bricks.add(new Brick(Color.orange, new Posn(250 + (GameWorld.BRICK_WIDTH * 5), 600 - (GameWorld.BRICK_HIEGHT * 6)), 8));
		this.powerUps.add(this.randomPowerUp(this.bricks));
		this.powerUps.add(this.randomPowerUp(this.bricks));
		this.powerUps.add(this.randomPowerUp(this.bricks));
		this.powerUps.add(this.randomPowerUp(this.bricks));
		this.powerUps.add(this.randomPowerUp(this.bricks));
	}
	
	public void initLevelTen(){
		 
		
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 4), 630 - (GameWorld.BRICK_HIEGHT * 1)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 4), 630 - (GameWorld.BRICK_HIEGHT * 2)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 4), 630 - (GameWorld.BRICK_HIEGHT * 3)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 4), 630 - (GameWorld.BRICK_HIEGHT * 4)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 4), 630 - (GameWorld.BRICK_HIEGHT * 5)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 4), 630 - (GameWorld.BRICK_HIEGHT * 6)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 4), 630 - (GameWorld.BRICK_HIEGHT * 7)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 4), 630 - (GameWorld.BRICK_HIEGHT * 8)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 4), 630 - (GameWorld.BRICK_HIEGHT * 10)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 4), 630 - (GameWorld.BRICK_HIEGHT * 11)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 4), 630 - (GameWorld.BRICK_HIEGHT * 12)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 4), 630 - (GameWorld.BRICK_HIEGHT * 13)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 4), 630 - (GameWorld.BRICK_HIEGHT * 14)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 4), 630 - (GameWorld.BRICK_HIEGHT * 15)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 4), 630 - (GameWorld.BRICK_HIEGHT * 16)), 999999999));
		
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 0), 630 - (GameWorld.BRICK_HIEGHT * 0)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 1), 630 - (GameWorld.BRICK_HIEGHT * 0)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 2), 630 - (GameWorld.BRICK_HIEGHT * 0)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 3), 630 - (GameWorld.BRICK_HIEGHT * 0)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 4), 630 - (GameWorld.BRICK_HIEGHT * 0)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 5), 630 - (GameWorld.BRICK_HIEGHT * 0)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 6), 630 - (GameWorld.BRICK_HIEGHT * 0)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 7), 630 - (GameWorld.BRICK_HIEGHT * 0)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 8), 630 - (GameWorld.BRICK_HIEGHT * 0)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 9), 630 - (GameWorld.BRICK_HIEGHT * 0)), 999999999));
		
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 7), 610 - (GameWorld.BRICK_HIEGHT * 8)), 2));
	}
	
	public void initLevelEleven(){
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 0), 630 - (GameWorld.BRICK_HIEGHT * 10)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 1), 630 - (GameWorld.BRICK_HIEGHT * 10)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 2), 630 - (GameWorld.BRICK_HIEGHT * 10)), 2));
		this.bricks.add(new Brick(Color.orange, new Posn(250 + (GameWorld.BRICK_WIDTH * 3), 630 - (GameWorld.BRICK_HIEGHT * 10)), 8));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 4), 630 - (GameWorld.BRICK_HIEGHT * 10)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 5), 630 - (GameWorld.BRICK_HIEGHT * 10)), 2));
		this.bricks.add(new Brick(Color.orange, new Posn(250 + (GameWorld.BRICK_WIDTH * 6), 630 - (GameWorld.BRICK_HIEGHT * 10)), 8));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 7), 630 - (GameWorld.BRICK_HIEGHT * 10)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 8), 630 - (GameWorld.BRICK_HIEGHT * 10)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 0), 630 - (GameWorld.BRICK_HIEGHT * 11)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 1), 630 - (GameWorld.BRICK_HIEGHT * 11)), 2));
		this.bricks.add(new Brick(Color.green, new Posn(250 + (GameWorld.BRICK_WIDTH * 2), 630 - (GameWorld.BRICK_HIEGHT * 11)), 6));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 3), 630 - (GameWorld.BRICK_HIEGHT * 11)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 4), 630 - (GameWorld.BRICK_HIEGHT * 11)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 5), 630 - (GameWorld.BRICK_HIEGHT * 11)), 2));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 6), 630 - (GameWorld.BRICK_HIEGHT * 11)), 999999999));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 7), 630 - (GameWorld.BRICK_HIEGHT * 11)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 8), 630 - (GameWorld.BRICK_HIEGHT * 11)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 0), 630 - (GameWorld.BRICK_HIEGHT * 12)), 2));
		this.bricks.add(new Brick(Color.blue, new Posn(250 + (GameWorld.BRICK_WIDTH * 1), 630 - (GameWorld.BRICK_HIEGHT * 12)), 4));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 2), 630 - (GameWorld.BRICK_HIEGHT * 12)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 3), 630 - (GameWorld.BRICK_HIEGHT * 12)), 2));
		this.bricks.add(new Brick(Color.blue, new Posn(250 + (GameWorld.BRICK_WIDTH * 4), 630 - (GameWorld.BRICK_HIEGHT * 12)), 4));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 5), 630 - (GameWorld.BRICK_HIEGHT * 12)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 6), 630 - (GameWorld.BRICK_HIEGHT * 12)), 2));
		this.bricks.add(new Brick(Color.blue, new Posn(250 + (GameWorld.BRICK_WIDTH * 7), 630 - (GameWorld.BRICK_HIEGHT * 12)), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(250 + (GameWorld.BRICK_WIDTH * 8), 630 - (GameWorld.BRICK_HIEGHT * 12)), 4));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 0), 630 - (GameWorld.BRICK_HIEGHT * 13)), 2));
		this.bricks.add(new Brick(Color.green, new Posn(250 + (GameWorld.BRICK_WIDTH * 1), 630 - (GameWorld.BRICK_HIEGHT * 13)), 6));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 2), 630 - (GameWorld.BRICK_HIEGHT * 13)), 2));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 3), 630 - (GameWorld.BRICK_HIEGHT * 13)), 999999999));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 4), 630 - (GameWorld.BRICK_HIEGHT * 13)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 5), 630 - (GameWorld.BRICK_HIEGHT * 13)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 6), 630 - (GameWorld.BRICK_HIEGHT * 13)), 2));
		this.bricks.add(new Brick(Color.orange, new Posn(250 + (GameWorld.BRICK_WIDTH * 7), 630 - (GameWorld.BRICK_HIEGHT * 13)), 8));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 8), 630 - (GameWorld.BRICK_HIEGHT * 13)), 2));
		this.bricks.add(new Brick(Color.green, new Posn(250 + (GameWorld.BRICK_WIDTH * 0), 630 - (GameWorld.BRICK_HIEGHT * 14)), 6));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 1), 630 - (GameWorld.BRICK_HIEGHT * 14)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 2), 630 - (GameWorld.BRICK_HIEGHT * 14)), 2));
		this.bricks.add(new Brick(Color.blue, new Posn(250 + (GameWorld.BRICK_WIDTH * 3), 630 - (GameWorld.BRICK_HIEGHT * 14)), 4));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 4), 630 - (GameWorld.BRICK_HIEGHT * 14)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 5), 630 - (GameWorld.BRICK_HIEGHT * 14)), 2));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 6), 630 - (GameWorld.BRICK_HIEGHT * 14)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 7), 630 - (GameWorld.BRICK_HIEGHT * 14)), 999999999));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 8), 630 - (GameWorld.BRICK_HIEGHT * 14)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 0), 630 - (GameWorld.BRICK_HIEGHT * 9)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 1), 630 - (GameWorld.BRICK_HIEGHT * 9)), 2));
		this.bricks.add(new Brick(Color.orange, new Posn(250 + (GameWorld.BRICK_WIDTH * 2), 630 - (GameWorld.BRICK_HIEGHT * 9)), 8));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 3), 630 - (GameWorld.BRICK_HIEGHT * 9)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 4), 630 - (GameWorld.BRICK_HIEGHT * 9)), 2));
		this.bricks.add(new Brick(Color.blue, new Posn(250 + (GameWorld.BRICK_WIDTH * 5), 630 - (GameWorld.BRICK_HIEGHT * 9)), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(250 + (GameWorld.BRICK_WIDTH * 6), 630 - (GameWorld.BRICK_HIEGHT * 9)), 4));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 7), 630 - (GameWorld.BRICK_HIEGHT * 9)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 8), 630 - (GameWorld.BRICK_HIEGHT * 9)), 2));
		this.bricks.add(new Brick(Color.green, new Posn(250 + (GameWorld.BRICK_WIDTH * 0), 630 - (GameWorld.BRICK_HIEGHT * 8)), 6));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 1), 630 - (GameWorld.BRICK_HIEGHT * 8)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 2), 630 - (GameWorld.BRICK_HIEGHT * 8)), 2));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 3), 630 - (GameWorld.BRICK_HIEGHT * 8)), 999999999));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 4), 630 - (GameWorld.BRICK_HIEGHT * 8)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 5), 630 - (GameWorld.BRICK_HIEGHT * 8)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 6), 630 - (GameWorld.BRICK_HIEGHT * 8)), 2));
		this.bricks.add(new Brick(Color.orange, new Posn(250 + (GameWorld.BRICK_WIDTH * 7), 630 - (GameWorld.BRICK_HIEGHT * 8)), 8));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 8), 630 - (GameWorld.BRICK_HIEGHT * 8)), 2));
		this.bricks.add(new Brick(Color.green, new Posn(250 + (GameWorld.BRICK_WIDTH * 0), 630 - (GameWorld.BRICK_HIEGHT * 7)), 6));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 1), 630 - (GameWorld.BRICK_HIEGHT * 7)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 2), 630 - (GameWorld.BRICK_HIEGHT * 7)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 3), 630 - (GameWorld.BRICK_HIEGHT * 7)), 2));
		this.bricks.add(new Brick(Color.blue, new Posn(250 + (GameWorld.BRICK_WIDTH * 4), 630 - (GameWorld.BRICK_HIEGHT * 7)), 4));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 5), 630 - (GameWorld.BRICK_HIEGHT * 7)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 6), 630 - (GameWorld.BRICK_HIEGHT * 7)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 7), 630 - (GameWorld.BRICK_HIEGHT * 7)), 2));
		this.bricks.add(new Brick(Color.green, new Posn(250 + (GameWorld.BRICK_WIDTH * 8), 630 - (GameWorld.BRICK_HIEGHT * 7)), 6));
		this.bricks.add(new Brick(Color.green, new Posn(250 + (GameWorld.BRICK_WIDTH * 0), 630 - (GameWorld.BRICK_HIEGHT * 6)), 6));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 1), 630 - (GameWorld.BRICK_HIEGHT * 6)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 2), 630 - (GameWorld.BRICK_HIEGHT * 6)), 2));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 3), 630 - (GameWorld.BRICK_HIEGHT * 6)), 999999999));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 4), 630 - (GameWorld.BRICK_HIEGHT * 6)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 5), 630 - (GameWorld.BRICK_HIEGHT * 6)), 2));
		this.bricks.add(new Brick(Color.orange, new Posn(250 + (GameWorld.BRICK_WIDTH * 6), 630 - (GameWorld.BRICK_HIEGHT * 6)), 8));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 7), 630 - (GameWorld.BRICK_HIEGHT * 6)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 8), 630 - (GameWorld.BRICK_HIEGHT * 6)), 2));
		this.bricks.add(new Brick(Color.blue, new Posn(250 + (GameWorld.BRICK_WIDTH * 0), 630 - (GameWorld.BRICK_HIEGHT * 5)), 4));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 1), 630 - (GameWorld.BRICK_HIEGHT * 5)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 2), 630 - (GameWorld.BRICK_HIEGHT * 5)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 3), 630 - (GameWorld.BRICK_HIEGHT * 5)), 2));
		this.bricks.add(new Brick(Color.green, new Posn(250 + (GameWorld.BRICK_WIDTH * 4), 630 - (GameWorld.BRICK_HIEGHT * 5)), 6));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 5), 630 - (GameWorld.BRICK_HIEGHT * 5)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 6), 630 - (GameWorld.BRICK_HIEGHT * 5)), 2));
		this.bricks.add(new Brick(Color.orange, new Posn(250 + (GameWorld.BRICK_WIDTH * 7), 630 - (GameWorld.BRICK_HIEGHT * 5)), 8));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 8), 630 - (GameWorld.BRICK_HIEGHT * 5)), 2));
		this.bricks.add(new Brick(Color.blue, new Posn(250 + (GameWorld.BRICK_WIDTH * 0), 630 - (GameWorld.BRICK_HIEGHT * 4)), 4));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 1), 630 - (GameWorld.BRICK_HIEGHT * 4)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 2), 630 - (GameWorld.BRICK_HIEGHT * 4)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 3), 630 - (GameWorld.BRICK_HIEGHT * 4)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 4), 630 - (GameWorld.BRICK_HIEGHT * 4)), 2));
		this.bricks.add(new Brick(Color.green, new Posn(250 + (GameWorld.BRICK_WIDTH * 5), 630 - (GameWorld.BRICK_HIEGHT * 4)), 6));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 6), 630 - (GameWorld.BRICK_HIEGHT * 4)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 7), 630 - (GameWorld.BRICK_HIEGHT * 4)), 2));
		this.bricks.add(new Brick(Color.green, new Posn(250 + (GameWorld.BRICK_WIDTH * 8), 630 - (GameWorld.BRICK_HIEGHT * 4)), 6));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 0), 630 - (GameWorld.BRICK_HIEGHT * 3)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 1), 630 - (GameWorld.BRICK_HIEGHT * 3)), 2));
		this.bricks.add(new Brick(Color.blue, new Posn(250 + (GameWorld.BRICK_WIDTH * 2), 630 - (GameWorld.BRICK_HIEGHT * 3)), 4));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 3), 630 - (GameWorld.BRICK_HIEGHT * 3)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 4), 630 - (GameWorld.BRICK_HIEGHT * 3)), 2));
		this.bricks.add(new Brick(Color.orange, new Posn(250 + (GameWorld.BRICK_WIDTH * 5), 630 - (GameWorld.BRICK_HIEGHT * 3)), 8));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 6), 630 - (GameWorld.BRICK_HIEGHT * 3)), 2));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 7), 630 - (GameWorld.BRICK_HIEGHT * 3)), 999999999)); 
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 8), 630 - (GameWorld.BRICK_HIEGHT * 3)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 0), 630 - (GameWorld.BRICK_HIEGHT * 2)), 2));
		this.bricks.add(new Brick(Color.green, new Posn(250 + (GameWorld.BRICK_WIDTH * 1), 630 - (GameWorld.BRICK_HIEGHT * 2)), 6));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 2), 630 - (GameWorld.BRICK_HIEGHT * 2)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 3), 630 - (GameWorld.BRICK_HIEGHT * 2)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 4), 630 - (GameWorld.BRICK_HIEGHT * 2)), 2));
		this.bricks.add(new Brick(Color.blue, new Posn(250 + (GameWorld.BRICK_WIDTH * 5), 630 - (GameWorld.BRICK_HIEGHT * 2)), 4));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 6), 630 - (GameWorld.BRICK_HIEGHT * 2)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 7), 630 - (GameWorld.BRICK_HIEGHT * 2)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 8), 630 - (GameWorld.BRICK_HIEGHT * 2)), 2));
		this.powerUps.add(this.randomPowerUp(this.bricks));
		this.powerUps.add(this.randomPowerUp(this.bricks));
		this.powerUps.add(this.randomPowerUp(this.bricks));
		this.powerUps.add(this.randomPowerUp(this.bricks));
		this.powerUps.add(this.randomPowerUp(this.bricks));
		this.powerUps.add(this.randomPowerUp(this.bricks));
		this.powerUps.add(this.randomPowerUp(this.bricks));
		this.powerUps.add(this.randomPowerUp(this.bricks));
		this.powerUps.add(this.randomPowerUp(this.bricks));
	}
	
	public void initLevelTwelve(){
		this.bricks.add(new Brick(Color.gray, new Posn(240 + (GameWorld.BRICK_WIDTH * 0), 630 - (GameWorld.BRICK_HIEGHT * 3)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(240 + (GameWorld.BRICK_WIDTH * 1), 630 - (GameWorld.BRICK_HIEGHT * 3)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(240 + (GameWorld.BRICK_WIDTH * 2), 630 - (GameWorld.BRICK_HIEGHT * 3)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(240 + (GameWorld.BRICK_WIDTH * 3), 630 - (GameWorld.BRICK_HIEGHT * 3)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(240 + (GameWorld.BRICK_WIDTH * 4), 630 - (GameWorld.BRICK_HIEGHT * 3)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(240 + (GameWorld.BRICK_WIDTH * 5), 630 - (GameWorld.BRICK_HIEGHT * 3)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(240 + (GameWorld.BRICK_WIDTH * 6), 630 - (GameWorld.BRICK_HIEGHT * 3)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(240 + (GameWorld.BRICK_WIDTH * 7), 630 - (GameWorld.BRICK_HIEGHT * 3)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(240 + (GameWorld.BRICK_WIDTH * 8), 630 - (GameWorld.BRICK_HIEGHT * 3)), 999999999));
		
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 9), 630 - (GameWorld.BRICK_HIEGHT * 13)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 8), 630 - (GameWorld.BRICK_HIEGHT * 13)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 7), 630 - (GameWorld.BRICK_HIEGHT * 13)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 6), 630 - (GameWorld.BRICK_HIEGHT * 13)), 999999999));
		
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * -1), 630 - (GameWorld.BRICK_HIEGHT * 13)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 0), 630 - (GameWorld.BRICK_HIEGHT * 13)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 1), 630 - (GameWorld.BRICK_HIEGHT * 13)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 2), 630 - (GameWorld.BRICK_HIEGHT * 13)), 999999999));
		
		this.bricks.add(new Brick(Color.red, new Posn(230 + (GameWorld.BRICK_WIDTH * -1), 630 - (GameWorld.BRICK_HIEGHT * 14)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(230 + (GameWorld.BRICK_WIDTH * 0), 630 - (GameWorld.BRICK_HIEGHT * 14)), 2));
		
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 9), 630 - (GameWorld.BRICK_HIEGHT * 14)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 8), 630 - (GameWorld.BRICK_HIEGHT * 14)), 2));

		this.bricks.add(new Brick(Color.red, new Posn(240 + (GameWorld.BRICK_WIDTH * 4), 630 - (GameWorld.BRICK_HIEGHT * 4)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(240 + (GameWorld.BRICK_WIDTH * 4), 630 - (GameWorld.BRICK_HIEGHT * 5)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(240 + (GameWorld.BRICK_WIDTH * 4), 630 - (GameWorld.BRICK_HIEGHT * 6)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(240 + (GameWorld.BRICK_WIDTH * 4), 630 - (GameWorld.BRICK_HIEGHT * 7)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(240 + (GameWorld.BRICK_WIDTH * 4), 630 - (GameWorld.BRICK_HIEGHT * 8)), 2));
		this.powerUps.add(this.randomPowerUp(this.bricks));
		this.powerUps.add(this.randomPowerUp(this.bricks));
	}
	
	public void initLevelThirteen(){
		this.bricks.add(new Brick(Color.gray, new Posn(240 + (GameWorld.BRICK_WIDTH * 1), 630 - (GameWorld.BRICK_HIEGHT * 3)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(240 + (GameWorld.BRICK_WIDTH * 1), 630 - (GameWorld.BRICK_HIEGHT * 4)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(240 + (GameWorld.BRICK_WIDTH * 1), 630 - (GameWorld.BRICK_HIEGHT * 5)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(240 + (GameWorld.BRICK_WIDTH * 1), 630 - (GameWorld.BRICK_HIEGHT * 6)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(240 + (GameWorld.BRICK_WIDTH * 1), 630 - (GameWorld.BRICK_HIEGHT * 7)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(240 + (GameWorld.BRICK_WIDTH * 1), 630 - (GameWorld.BRICK_HIEGHT * 8)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(240 + (GameWorld.BRICK_WIDTH * 1), 630 - (GameWorld.BRICK_HIEGHT * 9)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(240 + (GameWorld.BRICK_WIDTH * 2), 630 - (GameWorld.BRICK_HIEGHT * 3)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(240 + (GameWorld.BRICK_WIDTH * 3), 630 - (GameWorld.BRICK_HIEGHT * 3)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(240 + (GameWorld.BRICK_WIDTH * 4), 630 - (GameWorld.BRICK_HIEGHT * 3)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(240 + (GameWorld.BRICK_WIDTH * 5), 630 - (GameWorld.BRICK_HIEGHT * 3)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(240 + (GameWorld.BRICK_WIDTH * 6), 630 - (GameWorld.BRICK_HIEGHT * 3)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(240 + (GameWorld.BRICK_WIDTH * 7), 630 - (GameWorld.BRICK_HIEGHT * 3)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(240 + (GameWorld.BRICK_WIDTH * 7), 630 - (GameWorld.BRICK_HIEGHT * 4)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(240 + (GameWorld.BRICK_WIDTH * 7), 630 - (GameWorld.BRICK_HIEGHT * 5)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(240 + (GameWorld.BRICK_WIDTH * 7), 630 - (GameWorld.BRICK_HIEGHT * 6)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(240 + (GameWorld.BRICK_WIDTH * 7), 630 - (GameWorld.BRICK_HIEGHT * 7)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(240 + (GameWorld.BRICK_WIDTH * 7), 630 - (GameWorld.BRICK_HIEGHT * 8)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(240 + (GameWorld.BRICK_WIDTH * 7), 630 - (GameWorld.BRICK_HIEGHT * 9)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(240 + (GameWorld.BRICK_WIDTH * 6), 630 - (GameWorld.BRICK_HIEGHT * 9)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(240 + (GameWorld.BRICK_WIDTH * 5), 630 - (GameWorld.BRICK_HIEGHT * 9)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(240 + (GameWorld.BRICK_WIDTH * 3), 630 - (GameWorld.BRICK_HIEGHT * 9)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(240 + (GameWorld.BRICK_WIDTH * 2), 630 - (GameWorld.BRICK_HIEGHT * 9)), 999999999));
		
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 9), 630 - (GameWorld.BRICK_HIEGHT * 13)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 8), 630 - (GameWorld.BRICK_HIEGHT * 13)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 7), 630 - (GameWorld.BRICK_HIEGHT * 13)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(250 + (GameWorld.BRICK_WIDTH * 6), 630 - (GameWorld.BRICK_HIEGHT * 13)), 999999999));
		
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * -1), 630 - (GameWorld.BRICK_HIEGHT * 13)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 0), 630 - (GameWorld.BRICK_HIEGHT * 13)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 1), 630 - (GameWorld.BRICK_HIEGHT * 13)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 2), 630 - (GameWorld.BRICK_HIEGHT * 13)), 999999999));

		this.bricks.add(new Brick(Color.red, new Posn(230 + (GameWorld.BRICK_WIDTH * -1), 630 - (GameWorld.BRICK_HIEGHT * 14)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(230 + (GameWorld.BRICK_WIDTH * 0), 630 - (GameWorld.BRICK_HIEGHT * 14)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(230 + (GameWorld.BRICK_WIDTH * 1), 630 - (GameWorld.BRICK_HIEGHT * 14)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(230 + (GameWorld.BRICK_WIDTH * 2), 630 - (GameWorld.BRICK_HIEGHT * 14)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(230 + (GameWorld.BRICK_WIDTH * -1), 630 - (GameWorld.BRICK_HIEGHT * 15)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(230 + (GameWorld.BRICK_WIDTH * 0), 630 - (GameWorld.BRICK_HIEGHT * 15)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(230 + (GameWorld.BRICK_WIDTH * 1), 630 - (GameWorld.BRICK_HIEGHT * 15)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(230 + (GameWorld.BRICK_WIDTH * 2), 630 - (GameWorld.BRICK_HIEGHT * 15)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(230 + (GameWorld.BRICK_WIDTH * -1), 630 - (GameWorld.BRICK_HIEGHT * 16)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(230 + (GameWorld.BRICK_WIDTH * 0), 630 - (GameWorld.BRICK_HIEGHT * 16)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(230 + (GameWorld.BRICK_WIDTH * 1), 630 - (GameWorld.BRICK_HIEGHT * 16)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(230 + (GameWorld.BRICK_WIDTH * 2), 630 - (GameWorld.BRICK_HIEGHT * 16)), 2));
		
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 9), 630 - (GameWorld.BRICK_HIEGHT * 14)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 8), 630 - (GameWorld.BRICK_HIEGHT * 14)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 7), 630 - (GameWorld.BRICK_HIEGHT * 14)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 6), 630 - (GameWorld.BRICK_HIEGHT * 14)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 9), 630 - (GameWorld.BRICK_HIEGHT * 15)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 8), 630 - (GameWorld.BRICK_HIEGHT * 15)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 7), 630 - (GameWorld.BRICK_HIEGHT * 15)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 6), 630 - (GameWorld.BRICK_HIEGHT * 15)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 9), 630 - (GameWorld.BRICK_HIEGHT * 16)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 8), 630 - (GameWorld.BRICK_HIEGHT * 16)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 7), 630 - (GameWorld.BRICK_HIEGHT * 16)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(250 + (GameWorld.BRICK_WIDTH * 6), 630 - (GameWorld.BRICK_HIEGHT * 16)), 2));
		
		this.bricks.add(new Brick(Color.red, new Posn(240 + (GameWorld.BRICK_WIDTH * 4), 630 - (GameWorld.BRICK_HIEGHT * 5)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(240 + (GameWorld.BRICK_WIDTH * 5), 630 - (GameWorld.BRICK_HIEGHT * 5)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(240 + (GameWorld.BRICK_WIDTH * 6), 630 - (GameWorld.BRICK_HIEGHT * 5)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(240 + (GameWorld.BRICK_WIDTH * 3), 630 - (GameWorld.BRICK_HIEGHT * 5)), 2));
		this.bricks.add(new Brick(Color.red, new Posn(240 + (GameWorld.BRICK_WIDTH * 2), 630 - (GameWorld.BRICK_HIEGHT * 5)), 2));
		this.bricks.add(new Brick(Color.blue, new Posn(240 + (GameWorld.BRICK_WIDTH * 4), 630 - (GameWorld.BRICK_HIEGHT * 4)), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(240 + (GameWorld.BRICK_WIDTH * 5), 630 - (GameWorld.BRICK_HIEGHT * 4)), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(240 + (GameWorld.BRICK_WIDTH * 6), 630 - (GameWorld.BRICK_HIEGHT * 4)), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(240 + (GameWorld.BRICK_WIDTH * 3), 630 - (GameWorld.BRICK_HIEGHT * 4)), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(240 + (GameWorld.BRICK_WIDTH * 2), 630 - (GameWorld.BRICK_HIEGHT * 4)), 4));
		this.powerUps.add(this.randomPowerUp(this.bricks));
		this.powerUps.add(this.randomPowerUp(this.bricks));
		this.powerUps.add(this.randomPowerUp(this.bricks));
		this.powerUps.add(this.randomPowerUp(this.bricks));
		this.powerUps.add(this.randomPowerUp(this.bricks));
		this.powerUps.add(this.randomPowerUp(this.bricks));
	}
	
	public void initLevelFourteen(){
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 8), 640 - (GameWorld.BRICK_HIEGHT * 1)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 8), 640 - (GameWorld.BRICK_HIEGHT * 2)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 8), 640 - (GameWorld.BRICK_HIEGHT * 3)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 8), 640 - (GameWorld.BRICK_HIEGHT * 4)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 8), 640 - (GameWorld.BRICK_HIEGHT * 5)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 8), 640 - (GameWorld.BRICK_HIEGHT * 6)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 8), 640 - (GameWorld.BRICK_HIEGHT * 7)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 8), 640 - (GameWorld.BRICK_HIEGHT * 8)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 8), 640 - (GameWorld.BRICK_HIEGHT * 9)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 8), 640 - (GameWorld.BRICK_HIEGHT * 10)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 8), 640 - (GameWorld.BRICK_HIEGHT * 11)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 8), 640 - (GameWorld.BRICK_HIEGHT * 12)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 8), 640 - (GameWorld.BRICK_HIEGHT * 13)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 8), 640 - (GameWorld.BRICK_HIEGHT * 14)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(190 + (GameWorld.BRICK_WIDTH * 6), 640 - (GameWorld.BRICK_HIEGHT * 16)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(190 + (GameWorld.BRICK_WIDTH * 6), 640 - (GameWorld.BRICK_HIEGHT * 15)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(190 + (GameWorld.BRICK_WIDTH * 6), 640 - (GameWorld.BRICK_HIEGHT * 14)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(190 + (GameWorld.BRICK_WIDTH * 6), 640 - (GameWorld.BRICK_HIEGHT * 13)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(190 + (GameWorld.BRICK_WIDTH * 6), 640 - (GameWorld.BRICK_HIEGHT * 12)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(190 + (GameWorld.BRICK_WIDTH * 6), 640 - (GameWorld.BRICK_HIEGHT * 11)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(190 + (GameWorld.BRICK_WIDTH * 6), 640 - (GameWorld.BRICK_HIEGHT * 10)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(190 + (GameWorld.BRICK_WIDTH * 6), 640 - (GameWorld.BRICK_HIEGHT * 9)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(190 + (GameWorld.BRICK_WIDTH * 6), 640 - (GameWorld.BRICK_HIEGHT * 8)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(190 + (GameWorld.BRICK_WIDTH * 6), 640 - (GameWorld.BRICK_HIEGHT * 7)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(190 + (GameWorld.BRICK_WIDTH * 6), 640 - (GameWorld.BRICK_HIEGHT * 6)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(190 + (GameWorld.BRICK_WIDTH * 6), 640 - (GameWorld.BRICK_HIEGHT * 5)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(190 + (GameWorld.BRICK_WIDTH * 6), 640 - (GameWorld.BRICK_HIEGHT * 4)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 6), 640 - (GameWorld.BRICK_HIEGHT * 1)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 7), 640 - (GameWorld.BRICK_HIEGHT * 1)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 5), 640 - (GameWorld.BRICK_HIEGHT * 1)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 4), 640 - (GameWorld.BRICK_HIEGHT * 1)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 3), 640 - (GameWorld.BRICK_HIEGHT * 1)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 3), 640 - (GameWorld.BRICK_HIEGHT * 2)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 3), 640 - (GameWorld.BRICK_HIEGHT * 3)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 3), 640 - (GameWorld.BRICK_HIEGHT * 4)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 3), 640 - (GameWorld.BRICK_HIEGHT * 5)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 3), 640 - (GameWorld.BRICK_HIEGHT * 6)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 3), 640 - (GameWorld.BRICK_HIEGHT * 7)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 3), 640 - (GameWorld.BRICK_HIEGHT * 8)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 3), 640 - (GameWorld.BRICK_HIEGHT * 9)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 3), 640 - (GameWorld.BRICK_HIEGHT * 10)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 3), 640 - (GameWorld.BRICK_HIEGHT * 11)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 3), 640 - (GameWorld.BRICK_HIEGHT * 12)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 3), 640 - (GameWorld.BRICK_HIEGHT * 13)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 3), 640 - (GameWorld.BRICK_HIEGHT * 14)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 2), 640 - (GameWorld.BRICK_HIEGHT * 1)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 2), 640 - (GameWorld.BRICK_HIEGHT * 2)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 2), 640 - (GameWorld.BRICK_HIEGHT * 3)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 2), 640 - (GameWorld.BRICK_HIEGHT * 4)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 2), 640 - (GameWorld.BRICK_HIEGHT * 5)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 2), 640 - (GameWorld.BRICK_HIEGHT * 6)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 2), 640 - (GameWorld.BRICK_HIEGHT * 7)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 2), 640 - (GameWorld.BRICK_HIEGHT * 8)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 2), 640 - (GameWorld.BRICK_HIEGHT * 9)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 2), 640 - (GameWorld.BRICK_HIEGHT * 10)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 2), 640 - (GameWorld.BRICK_HIEGHT * 11)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 2), 640 - (GameWorld.BRICK_HIEGHT * 12)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 2), 640 - (GameWorld.BRICK_HIEGHT * 13)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 2), 640 - (GameWorld.BRICK_HIEGHT * 14)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 1), 640 - (GameWorld.BRICK_HIEGHT * 1)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * 0), 640 - (GameWorld.BRICK_HIEGHT * 1)), 999999999));
		this.bricks.add(new Brick(Color.gray, new Posn(230 + (GameWorld.BRICK_WIDTH * -1), 640 - (GameWorld.BRICK_HIEGHT * 1)), 999999999));
		this.bricks.add(new Brick(Color.blue, new Posn(230 + (GameWorld.BRICK_WIDTH * 0), 630 - (GameWorld.BRICK_HIEGHT * 4)), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(230 + (GameWorld.BRICK_WIDTH * 0), 630 - (GameWorld.BRICK_HIEGHT * 5)), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(230 + (GameWorld.BRICK_WIDTH * 0), 630 - (GameWorld.BRICK_HIEGHT * 6)), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(230 + (GameWorld.BRICK_WIDTH * 0), 630 - (GameWorld.BRICK_HIEGHT * 7)), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(230 + (GameWorld.BRICK_WIDTH * 0), 630 - (GameWorld.BRICK_HIEGHT * 8)), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(230 + (GameWorld.BRICK_WIDTH * 0), 630 - (GameWorld.BRICK_HIEGHT * 9)), 4));
		this.bricks.add(new Brick(Color.blue, new Posn(230 + (GameWorld.BRICK_WIDTH * 0), 630 - (GameWorld.BRICK_HIEGHT * 10)), 4));
		
	}
	
	
	
	public static double PADEL_WIDTH = 120;
	public static int PADEL_HIEGHT = 30;
	public static int BALL_RADIUS_START = 10;
	
	public static int BRICK_WIDTH = 80;
	public static int BRICK_HIEGHT = 40;
	public static int LASER_HIEGHT = 40;
	public static int LASER_WIDTH = 5;
	public static int POWER_WIDTH = 60;
	public static int POWER_HIEGHT = 30;
	
	public PowerUp randomPowerUp(ArrayList<Brick> bricks){
		int pick = (int)(Math.random() * (this.bricks.size()));
		
		for(int i = 0; i < this.powerUps.size(); i++){
			if(this.bricks.get(pick).loc.x == this.powerUps.get(i).loc.x){
				return this.randomPowerUp(bricks);
			}
		}
		if(bricks.get(pick).color.equals(Color.gray)){
			return this.randomPowerUp(bricks);
		}
		else return new PowerUp(Color.gray, this.randomPowerUpHelper(), new Posn(this.bricks.get(pick).loc.x, this.bricks.get(pick).loc.y));
	}
	
	public String randomPowerUpHelper(){
		int pick = (int)(Math.random() * 11);
		
		if(pick == 0){
			return "Laser";
		}
		if(pick == 1){
			return "BigBall";
		}
		if(pick == 2){
			return "LongPad";
		}
		if(pick == 3){
			return "Catch";
		}
		if(pick == 4){
			return "Life";
		}
		if(pick == 5){
			return "SmlPad";
		}
		if(pick == 6){
			return "Multi";
		}
		if(pick == 7){
			return "Rocket";
		}
		if(pick == 8){
			return "Wrap";
		}
		if(pick == 9){
			return "Switch";
		}
		if(pick == 10){
			return "FireBall";
		}
		else return "SmlPad";
	}
	
	public void onKeyEvent(String ke) {
		if(ke.equals("right") && !this.testLeftWallPadel() && this.holdBall == 0 && this.paused == 0 && this.powerUp.equals("Switch")){
			this.padel.moveLeft();
		}
		if(ke.equals("left") && !this.testRightWallPadel() && this.holdBall == 0 && this.paused == 0 && this.powerUp.equals("Switch")){
			this.padel.moveRight();
		}
		if(ke.equals("left") && this.holdBall == 0 && this.paused == 0 && this.powerUp.equals("Wrap")){
			if(!this.testLeftWallPadelForWrap()){
				this.padel.moveLeft();
				}
				else this.WarpToRight();
		}
		if(ke.equals("right") && this.holdBall == 0 && this.paused == 0 && this.powerUp.equals("Wrap")){
			if(!this.testRightWallPadelForWrap()){
			this.padel.moveRight();
			}
			else this.WarpToLeft();
		}
		if(ke.equals("left") && !this.testLeftWallPadel() && this.holdBall == 0 && this.paused == 0  && !this.powerUp.equals("Wrap")
				&& !this.powerUp.equals("Switch")){
			this.padel.moveLeft();
		}
		if(ke.equals("left") && this.holdBall == 1 && !(this.selector == 0) && this.paused == 0){
			this.selector = this.selector - 1;	
			changeDirBallInitial(this.balls.get(0));
		}
		if(ke.equals("right") && !this.testRightWallPadel() && this.holdBall == 0 && this.paused == 0  && !this.powerUp.equals("Wrap")
				&& !this.powerUp.equals("Switch")){
			this.padel.moveRight();
		}
		if(ke.equals("right") && this.holdBall == 1 && !(this.selector == 5) && this.paused == 0){
				this.selector = this.selector + 1;
				changeDirBallInitial(this.balls.get(0));
		}
		if(ke.equals(" ") && this.holdBall == 0 && this.powerUp.equals("Laser") && this.paused == 0){
			this.addLasers();
			GameWorld.BALL_RADIUS_START = 10;
			this.balls.get(0).radius = 10;
		}
		if(ke.equals(" ") && this.holdBall == 0 && this.ammo > 0 && this.rocket == 0 && this.paused == 0){
			this.addRocket();
			this.rocket = 1;
			this.ammo = this.ammo - 1;
			GameWorld.BALL_RADIUS_START = 10;
			this.balls.get(0).radius = 10;
		}
		if(ke.equals(" ") && this.holdBall == 1 && this.paused == 0){
			this.holdBall = 0;
			this.moveBall(this.balls.get(0));
			this.moveBall(this.balls.get(0));
		}
		if(ke.equals("p")){
			if(this.paused == 0)
			this.paused = 1;
			else this.paused = 0;
		}
		if(ke.equals("r")){
			resetGame();
		}
	}
	
	public void WarpToRight(){
		this.padel.loc.x = (1050 - (int)GameWorld.PADEL_WIDTH);
	}
	
	public void WarpToLeft(){
		this.padel.loc.x =  150;
	}
	
	public void resetGame(){
		this.background = Color.cyan; 
		this.padel = new Padel(Color.black, new Posn(510, 750 - GameWorld.PADEL_HIEGHT));
		this.balls.clear();
		this.balls.add(new Ball(Color.black, new Posn(570,710), GameWorld.BALL_RADIUS_START, "upLeftLeft"));
		this.score = 0;
		this.level = 1;
		this.lives = 3;
		this.paused = 0;
		this.holdBall = 1;
		this.selector = 0;
		this.powerUp = "";
		this.lasers.clear();
		this.powerUps.clear();
		this.bricks.clear();
		this.laserCount= 0;
		this.initLevelOne();
	}
	
	public void addRocket(){
		this.rockets.add(new Rocket(new Posn((int)(this.padel.loc.x + (GameWorld.PADEL_WIDTH *   .5) - 15), this.padel.loc.y - 30)));
		this.rocket = 1;
	}
	
	public void addLasers(){
		if(this.laserCount < 3){
		this.lasers.add(new Laser(new Posn((int)(this.padel.loc.x + (GameWorld.PADEL_WIDTH * (1.0/3.0)) - 5), this.padel.loc.y - 10)));
		this.lasers.add(new Laser(new Posn((int)(this.padel.loc.x + (GameWorld.PADEL_WIDTH * (2.0/3.0)) + 5), this.padel.loc.y - 10)));
		this.laserCount = this.laserCount + 2;
		}
	}
	
	public void moveLasers(){
		for(int i = 0; i < this.lasers.size(); i++){
			this.lasers.get(i).moveUp();
		}
	}
	
	public void moveRocket(){
		for(int i = 0; i < this.rockets.size(); i++){
			this.rockets.get(i).moveUp();
		}
	}
	
	public void changeDirBallInitial(Ball ball){
		if(this.selector == 0){
			ball.dir = "upLeftLeft";
		}
		if(this.selector == 1){
			ball.dir = "upLeft";
		}
		if(this.selector == 2){
			ball.dir = "upUpLeft";
		}
		if(this.selector == 3){
			ball.dir = "upUpRight";
		}
		if(this.selector == 4){
			ball.dir = "upRight";
		}
		if(this.selector == 5){
			ball.dir = "upRightRight";
		}

	}
	
	
	public boolean testRightWallPadelForWrap(){
		if(this.padel.loc.x + (GameWorld.PADEL_WIDTH / 2.0) >= 1050){
			return true;
		}
		else return false;
	}
	
	public boolean testLeftWallPadelForWrap(){
		if(this.padel.loc.x + (GameWorld.PADEL_WIDTH / 2.0) <= 150){
			return true;
		}
		else return false;
	}
	
	public boolean testLeftWallPadel(){
		if(this.padel.loc.x <= 150){
			return true;
		}
		else return false;
	}
	
	public boolean testRightWallPadel(){
		if(this.padel.loc.x + GameWorld.PADEL_WIDTH >= 1050){
			return true;
		}
		else return false;
	}
	
	public boolean testRightWallBall(Ball ball){
		if(ball.loc.x + GameWorld.BALL_RADIUS_START >= 1050){
			return true;
		}
		else return false;
	}
	
	public boolean testLeftWallBall(Ball ball){
		if(ball.loc.x - GameWorld.BALL_RADIUS_START <= 150){
			return true;
		}
		else return false;
	}
	
	public void moveBall(Ball ball){
		if(ball.dir.equals("upLeft")){
			ball.moveUpLeft();
		}
		if(ball.dir.equals("upRight")){
			ball.moveUpRight();
		}
		if(ball.dir.equals("downLeft")){
			ball.moveDownLeft();
		}
		if(ball.dir.equals("downRight")){
			ball.moveDownRight();
		}
		if(ball.dir.equals("upLeftLeft")){
			ball.moveUpLeftLeft();
		}
		if(ball.dir.equals("upRightRight")){
			ball.moveUpRightRight();
		}
		if(ball.dir.equals("downLeftLeft")){
			ball.moveDownLeftLeft();
		}
		if(ball.dir.equals("downRightRight")){
			ball.moveDownRightRight();
		}
		if(ball.dir.equals("upUpLeft")){
			ball.moveUpUpLeft();
		}
		if(ball.dir.equals("upUpRight")){
			ball.moveUpUpRight();
		}
		if(ball.dir.equals("downDownLeft")){
			ball.moveDownDownLeft();
		}
		if(ball.dir.equals("downDownRight")){
			ball.moveDownDownRight();
		}
	}
	
	public void changeDirTopWall(Ball ball){
		if(ball.dir.equals("upLeft")){
			ball.dir = "downLeft";
		}
		if(ball.dir.equals("upRight")){
			ball.dir = "downRight";
		}
		if(ball.dir.equals("upLeftLeft")){
			ball.dir = "downLeftLeft";
		}
		if(ball.dir.equals("upRightRight")){
			ball.dir = "downRightRight";
		}
		if(ball.dir.equals("upUpRight")){
			ball.dir = "downDownRight";
		}
		if(ball.dir.equals("upUpLeft")){
			ball.dir = "downDownLeft";
		}
	}
	
	public void changeDirLeftWall(Ball ball){
		if(ball.dir.equals("upLeft")){
			ball.dir = "upRight";
		}
		if(ball.dir.equals("downLeft")){
			ball.dir = "downRight";
		}
		if(ball.dir.equals("upLeftLeft")){
			ball.dir = "upRightRight";
		}
		if(ball.dir.equals("downLeftLeft")){
			ball.dir = "downRightRight";
		}
		if(ball.dir.equals("upUpLeft")){
			ball.dir = "upUpRight";
		}
		if(ball.dir.equals("downDownLeft")){
			ball.dir = "downDownRight";
		}
	}
	
	public void changeDirRightWall(Ball ball){
		if(ball.dir.equals("upRight")){
			ball.dir = "upLeft";
		}
		if(ball.dir.equals("downRight")){
			ball.dir = "downLeft";
		}
		if(ball.dir.equals("upRightRight")){
			ball.dir = "upLeftLeft";
		}
		if(ball.dir.equals("downRightRight")){
			ball.dir = "downLeftLeft";
		}
		if(ball.dir.equals("upUpRight")){
			ball.dir = "upUpLeft";
		}
		if(ball.dir.equals("downDownRight")){
			ball.dir = "downDownLeft";
		}
	}
	
	public void changeDirMiddlePadel(Ball ball){
		if(ball.dir.equals("downRight")){
			ball.dir = "upRight";
		}
		if(ball.dir.equals("downRightRight")){
			ball.dir = "upRightRight";
		}
		if(ball.dir.equals("downLeft")){
			ball.dir = "upLeft";
		}
		if(ball.dir.equals("downLeftLeft")){
			ball.dir = "upLeftLeft";
		}
		if(ball.dir.equals("downDownLeft")){
			ball.dir = "upUpLeft";
		}
		if(ball.dir.equals("downDownRight")){
			ball.dir = "upUpRight";
		}
	}
	
	public void changeDirRightPadel(Ball ball){
		if(ball.dir.equals("downRight")){
			ball.dir = "upRightRight";
		}
		if(ball.dir.equals("downRightRight")){
			ball.dir = "upRightRight";
		}
		if(ball.dir.equals("downLeft")){
			ball.dir = "upUpLeft";
		}
		if(ball.dir.equals("downLeftLeft")){
			ball.dir = "upLeft";
		}
		if(ball.dir.equals("downDownLeft")){
			ball.dir = "upUpLeft";
		}
		if(ball.dir.equals("downDownRight")){
			ball.dir = "upLeft";
		}
	}
	
	public void changeDirLeftPadel(Ball ball){
		if(ball.dir.equals("downRight")){
			ball.dir = "upUpRight";
		}
		if(ball.dir.equals("downRightRight")){
			ball.dir = "upRight";
		}
		if(ball.dir.equals("downLeft")){
			ball.dir = "upLeftLeft";
		}
		if(ball.dir.equals("downLeftLeft")){
			ball.dir = "upRightRight";
		}
		if(ball.dir.equals("downDownLeft")){
			ball.dir = "upRight";
		}
		if(ball.dir.equals("downDownRight")){
			ball.dir = "upRight";
		}
	}
	
	public boolean testTopBall(Ball ball){
		if(ball.loc.y - GameWorld.BALL_RADIUS_START <= 0){
			return true;
		}
		else return false;
	}
	
	public boolean testBallTopLeftPadel(Ball ball){
		if((ball.loc.y + GameWorld.BALL_RADIUS_START > padel.loc.y - 2)){
			if((ball.loc.x >= padel.loc.x) && 
			(ball.loc.x <= padel.loc.x + (GameWorld.PADEL_WIDTH / 4.0))){
				return true;
		}
		else return false;
		}
		else return false;
	}
	
	public boolean testBallTopRightPadel(Ball ball){
		if((ball.loc.y + GameWorld.BALL_RADIUS_START > padel.loc.y - 2)){
			if((ball.loc.x >= padel.loc.x + (GameWorld.PADEL_WIDTH / 1.5)) && 
			(ball.loc.x <= padel.loc.x + (GameWorld.PADEL_WIDTH))){
			return true;
		}
		else return false;
		}
		else return false;
	}
	
	public boolean testBallTopMidlePadel(Ball ball){
		if(ball.loc.y + GameWorld.BALL_RADIUS_START > padel.loc.y - 2){
			if((ball.loc.x >= padel.loc.x + (GameWorld.PADEL_WIDTH / 4.0)) && 
			(ball.loc.x <= padel.loc.x + (GameWorld.PADEL_WIDTH / 1.5))){
				return true;
		}
		else return false;
		}
		else return false;
	}
	
	public boolean testBallLeftPadel(Ball ball){
		if((ball.loc.x + GameWorld.BALL_RADIUS_START >= padel.loc.x) &&
		   (ball.loc.x + GameWorld.BALL_RADIUS_START <= (padel.loc.x + (GameWorld.PADEL_WIDTH / 2)))){
			if(ball.loc.y > padel.loc.y){
				return true;
			}
			else return false;
		}
		else return false;
	}

	public boolean testBallRightPadel(Ball ball){
		if((ball.loc.x - GameWorld.BALL_RADIUS_START <= padel.loc.x + GameWorld.PADEL_WIDTH) &&
		   (ball.loc.x - GameWorld.BALL_RADIUS_START >= (padel.loc.x + (GameWorld.PADEL_WIDTH / 2.0)))){
			if(ball.loc.y > padel.loc.y){
				return true;
			}
			else return false;
		}
		else return false;
	}
	
	public boolean testBrickBottom(Brick brick, Ball ball){
		if ((ball.loc.y - GameWorld.BALL_RADIUS_START <= brick.loc.y + GameWorld.BRICK_HIEGHT + 2) && 
			(ball.loc.y - GameWorld.BALL_RADIUS_START >= brick.loc.y + (GameWorld.BRICK_HIEGHT / 2))){
			if ((ball.loc.x >= brick.loc.x) &&
				(ball.loc.x <= brick.loc.x + GameWorld.BRICK_WIDTH)){
				return true;
			}
			else return false;
		}
		else return false;
	}
	
	public boolean testLaserHit(Brick brick){
		for(int i = 0; i < this.lasers.size();i++){
		if ((this.lasers.get(i).loc.y <= brick.loc.y + GameWorld.BRICK_HIEGHT + 2) && 
			(this.lasers.get(i).loc.y >= brick.loc.y + (GameWorld.BRICK_HIEGHT / 2))){
			if ((this.lasers.get(i).loc.x >= brick.loc.x) &&
				(this.lasers.get(i).loc.x <= brick.loc.x + GameWorld.BRICK_WIDTH)){
				this.laserCount = this.laserCount - 1;
				this.lasers.remove(i);
				return true;
			}
		}
		}
		return false;
	}
	
	public boolean testRocketHit(Brick brick){
		if(this.rockets.size() == 1){
		if ((this.rockets.get(0).loc.y <= brick.loc.y + GameWorld.BRICK_HIEGHT + 2) && 
			(this.rockets.get(0).loc.y >= brick.loc.y + (GameWorld.BRICK_HIEGHT / 2))){
			if ((this.rockets.get(0).loc.x >= brick.loc.x) &&
				(this.rockets.get(0).loc.x <= brick.loc.x + GameWorld.BRICK_WIDTH)){
				this.rocket = 0;
				this.rockets.remove(0);
				return true;
			}
		}
		}
		return false;
		
	}
	
	public boolean testBrickTop(Brick brick, Ball ball){
		if ((ball.loc.y + GameWorld.BALL_RADIUS_START >= brick.loc.y - 2.0) && 
			(ball.loc.y <= brick.loc.y + (GameWorld.BRICK_HIEGHT / 2.0))){
			if ((ball.loc.x >= brick.loc.x) &&
				(ball.loc.x <= brick.loc.x + GameWorld.BRICK_WIDTH)){
				return true;
			}
			else return false;
		}
		else return false;
	}
	
	public boolean testBrickLeft(Brick brick, Ball ball){
		if ((ball.loc.x + GameWorld.BALL_RADIUS_START >= brick.loc.x - 2.0) &&
			(ball.loc.x + GameWorld.BALL_RADIUS_START <= brick.loc.x + (GameWorld.BRICK_WIDTH / 2.0))){
			if((ball.loc.y >= brick.loc.y) &&
			   (ball.loc.y <= brick.loc.y + GameWorld.BRICK_HIEGHT)){
				return true;
			}
			else return false;
		}
		else return false;	
	}
	
	public boolean testBrickRight(Brick brick, Ball ball){
		if ((ball.loc.x - GameWorld.BALL_RADIUS_START <= brick.loc.x + GameWorld.BRICK_WIDTH + 2.0) &&
			(ball.loc.x - GameWorld.BALL_RADIUS_START >= brick.loc.x + (GameWorld.BRICK_WIDTH / 2.0))){
			if((ball.loc.y >= brick.loc.y) &&
			   (ball.loc.y <= brick.loc.y + GameWorld.BRICK_HIEGHT)){
				return true;
			}
			else return false;
		}
		else return false;	
	}
	
	public void subtractHitCount(int index){
		this.bricks.get(index).hits = this.bricks.get(index).hits - 2; 
	}
	
	public void subtractHitCountOne(int index){
		this.bricks.get(index).hits = this.bricks.get(index).hits - 1; 
	}
	
	public void checkAndReleasePowerUps(Posn p){
		for(int i = 0; i < this.powerUps.size();i++){
			if(this.powerUps.get(i).loc.x == p.x && this.powerUps.get(i).loc.y == p.y){
				this.powerUps.get(i).release = 1;
			}
		}
	}
	
	public void checkHits(){
		for(int i = 0; i < this.bricks.size(); i++){
			if (this.bricks.get(i).hits <= 0){
				this.checkAndReleasePowerUps(new Posn(this.bricks.get(i).loc.x, this.bricks.get(i).loc.y));
				this.bricks.remove(i);
				this.score = this.score + 10;
				break;
			}
			if (this.bricks.get(i).hits == 2){
				this.bricks.get(i).color = Color.red;
			}
			if (this.bricks.get(i).hits == 4){
				this.bricks.get(i).color = Color.blue;
			}
			if (this.bricks.get(i).hits == 6){
				this.bricks.get(i).color = Color.green;
			}
		}
	}
	
	public boolean checkBallOutOfBounds(Ball ball){
		if(ball.loc.y > 930){
			return true;
		}
		else return false;
	}
	
	public boolean noMoreValidBricks(){
		for(int i = 0; i < this.bricks.size(); i++){
			if(!this.bricks.get(i).color.equals(Color.gray)){
				return false;
			}
		}
		this.bricks.clear();
		return true;
	}
	
	public void checkLaserLimit(){
		for(int i = 0; i < this.lasers.size(); i ++){
			if(this.lasers.get(i).loc.y <= 0){
				this.lasers.remove(i);
				this.laserCount = this.laserCount - 1;
			}
		}
	}
	
	public void checkRocketLimit(){
		if(this.rockets.size() == 1){
		if(this.rockets.get(0).loc.y <= 0){
			this.rockets.remove(0);
			this.rocket = 0;
		}
		}
	}
	
	public boolean testPowerUpHitLeft(PowerUp p){
		if(p.loc.x >= this.padel.loc.x && p.loc.x <= this.padel.loc.x + GameWorld.PADEL_WIDTH){
			if(p.loc.y >= this.padel.loc.y - 2 && p.loc.y <= this.padel.loc.y + (GameWorld.PADEL_HIEGHT / 2.0)){
				return true;
			}
			else return false;
		}
		else return false;	
	}
	
	public boolean testPowerUpHitRight(PowerUp p){
		if(p.loc.x + (GameWorld.POWER_WIDTH) >= this.padel.loc.x && p.loc.x  + (GameWorld.POWER_WIDTH) <= this.padel.loc.x + GameWorld.PADEL_WIDTH){
			if(p.loc.y >= this.padel.loc.y - 2 && p.loc.y <= this.padel.loc.y + (GameWorld.PADEL_HIEGHT / 2.0)){
				return true;
			}
			else return false;
		}
		else return false;	
	}
	
	public void reset(){
		this.powerUps.clear();
		this.level = this.level + 1;
		this.lives = this.lives + 1;
		this.balls.clear();
		this.balls.add(new Ball(Color.black, new Posn(570,710), GameWorld.BALL_RADIUS_START, "upLeftLeft"));
		this.padel = new Padel(Color.black, new Posn(510, 750 - GameWorld.PADEL_HIEGHT));
		this.holdBall = 1;
		this.selector = 0;
		this.powerUp = "";
		this.lasers.clear();
		GameWorld.PADEL_WIDTH = 120;;
		GameWorld.BALL_RADIUS_START = 10;
		this.balls.get(0).radius = 10;
		this.laserCount = 0;
		this.rockets.clear();
		this.rocket = 0;
		this.ammo = 0;
	}
	
	public void playAnimation(){
		if(this.play == 1 && this.tickCount < 40){
			if(this.switchh == 0){
				this.background2 = Color.magenta;
				this.background3 = Color.orange;
			}
			if(this.switchh == 8){
				this.background2 = Color.orange;
				this.background3 = Color.magenta;
			}
			if(this.switchh >= 0 && this.switchh <= 8){
				this.switchh = this.switchh + 1;
			}
			else
				this.switchh = 0;
		}
	}

	
	
	public void onTick() {
		if(this.powerUp.equals("Rocket")){
			this.ammo = this.ammo + 3;
			this.powerUp = "";
		}
		if(this.powerUp.equals("Life")){
			this.lives = this.lives + 1;
			this.powerUp = "";
		}
		if(this.paused == 0){
		for(int i = 0; i < this.powerUps.size();i++){
			if(this.powerUps.get(i).release == 1){
				this.powerUps.get(i).moveDown();
			}
		}
		
		if(this.powerUp.equals("BigBall")){
			GameWorld.BALL_RADIUS_START = 30;
			for(int i = 0; i < this.balls.size(); i++){
			this.balls.get(i).radius = GameWorld.BALL_RADIUS_START;
			}
		}
		
		if(this.powerUp.equals("LongPad")){
			GameWorld.PADEL_WIDTH = 240;
		}
		if(this.powerUp.equals("SmlPad")){
			GameWorld.PADEL_WIDTH = 60;
		}
		
		for(int t = 0; t < this.powerUps.size();t++){
			if(this.testPowerUpHitLeft(this.powerUps.get(t)) || this.testPowerUpHitRight(this.powerUps.get(t))){
				this.powerUp = this.powerUps.get(t).name;
				this.play = 1;
				this.tickCount = 0;
				this.powerUps.remove(t);
			}
		}
		if(this.tickCount < 40){
			this.tickCount = this.tickCount + 1;
		}
		else { this.background2 = Color.magenta;
			   this.background3 = Color.magenta;
			}	
		this.moveLasers();
		this.moveRocket();
		playAnimation();
		checkLaserLimit();
		checkRocketLimit();
		if(this.holdBall == 0){
		if(this.lives == 0){
			this.endOfTime("GAME OVER");
		} 
		for(int i = 0; i < this.balls.size(); i++){
			if(this.checkBallOutOfBounds(this.balls.get(i))){
				if(this.balls.size() == 1){
					this.lives = this.lives - 1;
					this.balls.clear();
					this.balls.add(new Ball(Color.black, new Posn(570,860), GameWorld.BALL_RADIUS_START, "upLeftLeft"));
					this.padel = new Padel(Color.black, new Posn(510, 900 - GameWorld.PADEL_HIEGHT));
					this.holdBall = 1;
					this.selector = 0;
					this.powerUp = "";
					this.lasers.clear();
					GameWorld.PADEL_WIDTH = 120;;
					GameWorld.BALL_RADIUS_START = 10;
					this.balls.get(0).radius = 10;
					this.rockets.clear();
					this.rocket = 0;
					this.ammo = 0;
				}
				else this.balls.remove(i);
			}
		}
		if(this.noMoreValidBricks() && this.level == 1){
			this.reset();
			this.initLevelTwo();
		}
		else if(this.noMoreValidBricks() && this.level == 2){
			this.reset();
			this.initLevelThree();
		}
		else if(this.noMoreValidBricks() && this.level == 3){
			this.reset();
			this.initLevelFour();
		}
		else if(this.noMoreValidBricks() && this.level == 4){
			this.reset();
			this.initLevelFive();
		}
		else if(this.noMoreValidBricks() && this.level == 5){
			this.reset();
			this.initLevelSix();
		}
		else if(this.noMoreValidBricks() && this.level == 6){
			this.reset();
			this.initLevelSeven();
		}
		else if(this.noMoreValidBricks() && this.level == 7){
			this.reset();
			this.initLevelEight();
		}
		else if(this.noMoreValidBricks() && this.level == 8){
			this.reset();
			this.initLevelNine();
		}
		else if(this.noMoreValidBricks() && this.level == 9){
			this.reset();
			this.initLevelTen();
		}
		else if(this.noMoreValidBricks() && this.level == 10){
			this.reset();
			this.initLevelEleven();
		}
		else if(this.noMoreValidBricks() && this.level == 11){
			this.reset();
			this.initLevelTwelve();
		}
		else if(this.noMoreValidBricks() && this.level == 12){
			this.reset();
			this.initLevelThirteen();
		}
		else if(this.noMoreValidBricks() && this.level == 13){
			this.reset();
			this.initLevelFourteen();
		}
		else if(this.noMoreValidBricks() && this.level == 14){
			this.reset();
			this.level = 1;
			this.initLevelOne();
		}
		
		for(int i = 0; i < this.balls.size(); i++){
		if(this.testTopBall(this.balls.get(i))){
				this.changeDirTopWall(this.balls.get(i));
				this.moveBall(this.balls.get(i));
		}
		else if(this.testLeftWallBall(this.balls.get(i))){
				this.changeDirLeftWall(this.balls.get(i));
				this.moveBall(this.balls.get(i));
		}
		else if(this.testRightWallBall(this.balls.get(i))){
				this.changeDirRightWall(this.balls.get(i));
				this.moveBall(this.balls.get(i));
		}
		else if(this.testBallTopLeftPadel(this.balls.get(i))){
			if(this.powerUp.equals("Catch")){
				this.holdBall = 1;
				this.selector = 0;
			}
			if(this.holdBall == 0){
				this.changeDirLeftPadel(this.balls.get(i));
				this.moveBall(this.balls.get(i));
			}
		}
		else if(this.testBallTopRightPadel(this.balls.get(i))){
			if(this.powerUp.equals("Catch")){
				this.holdBall = 1;
				this.selector = 0;
			}
			if(this.holdBall == 0){
				this.changeDirRightPadel(this.balls.get(i));
				this.moveBall(this.balls.get(i));
			}
		}
		else if(this.testBallTopMidlePadel(this.balls.get(i))){
			if(this.powerUp.equals("Catch")){
				this.holdBall = 1;
				this.selector = 0;
			}
			if(this.holdBall == 0){
				this.changeDirMiddlePadel(this.balls.get(i));
				this.moveBall(this.balls.get(i));
			}
		}
		else if(this.testBallLeftPadel(this.balls.get(i))){
				this.balls.get(i).dir = "upLeft";
				this.changeDirTopWall(this.balls.get(i));
				this.moveBall(this.balls.get(i));
		}
		else if(this.testBallRightPadel(this.balls.get(i))){
				this.balls.get(i).dir = "upLeft";
				this.changeDirTopWall(this.balls.get(i));
				this.moveBall(this.balls.get(i));
		}
		for(int j = 0; j < this.bricks.size(); j++){
			if (this.testBrickBottom(this.bricks.get(j), this.balls.get(i))){
				if(this.powerUp.equals("FireBall")){
					this.bricks.remove(j);
					this.score = this.score + 50;
					break;
				}
				else {
				this.changeDirTopWall(this.balls.get(i));
				this.moveBall(this.balls.get(i));
				this.subtractHitCount(j);
				this.checkHits();
				this.score = this.score + 10;
				break;
				}
			}
			if (this.testBrickTop(this.bricks.get(j),this.balls.get(i))){
				if(this.powerUp.equals("FireBall")){
					this.bricks.remove(j);
					this.score = this.score + 50;
					break;
				}
				else {
				this.changeDirMiddlePadel(this.balls.get(i));
				this.moveBall(this.balls.get(i));
				this.subtractHitCount(j);
				this.checkHits();
				this.score = this.score + 10;
				break;
				}
			}
			if (this.testBrickRight(this.bricks.get(j), this.balls.get(i))){
				if(this.powerUp.equals("FireBall")){
					this.bricks.remove(j);
					this.score = this.score + 50;
					break;
				}
				else {
				this.changeDirLeftWall(this.balls.get(i));
				this.moveBall(this.balls.get(i));
				this.subtractHitCount(j);
				this.checkHits();
				this.score = this.score + 10;
				break;
				}
			}
			if (this.testBrickLeft(this.bricks.get(j),this.balls.get(i))){
				if(this.powerUp.equals("FireBall")){
					this.bricks.remove(j);
					this.score = this.score + 50;
					break;
				}
				else {
				this.changeDirRightWall(this.balls.get(i));
				this.moveBall(this.balls.get(i));
				this.subtractHitCount(j);
				this.checkHits();
				this.score = this.score + 10;
				break;
				}
			}
			if (this.testLaserHit(this.bricks.get(j))){
				this.subtractHitCountOne(j);
				this.checkHits();
				break;
			}
			if (this.testRocketHit(this.bricks.get(j))){
				this.bricks.remove(j);
				this.score = this.score + 50;
				break;
			}
		}}
		if(this.holdBall == 0){
		for(int p = 0; p < this.balls.size(); p++){
			this.moveBall(this.balls.get(p));
			
		}}}}
		if(this.powerUp.equals("Multi")){
			this.balls.get(0).dir = "upLeft";
			this.balls.add(new Ball(this.balls.get(0).color, new Posn(this.balls.get(0).loc.x - 10, this.balls.get(0).loc.y), this.balls.get(0).radius, "upUpLeft"));
			this.balls.add(new Ball(this.balls.get(0).color, new Posn(this.balls.get(0).loc.x + 10, this.balls.get(0).loc.y), this.balls.get(0).radius, "upUpRight"));
			this.balls.add(new Ball(this.balls.get(0).color, new Posn(this.balls.get(0).loc.x + 20, this.balls.get(0).loc.y), this.balls.get(0).radius, "upRight"));
			this.powerUp = "";
		}
	}
	
	public void draw() {
		
		// backround game
		this.theCanvas.drawRect(new Posn(150, 0), 900, 900, this.background);
		
		// padel
		this.padel.draw(theCanvas);
		
		// background sides
		this.theCanvas.drawRect(new Posn(0, 0), 150, 900, this.background2);
		this.theCanvas.drawRect(new Posn(1050, 0), 150, 900, this.background3);
		
		// boundarys
		this.theCanvas.drawLine(new Posn(150, 0), new Posn(150, 900), new Black());
		this.theCanvas.drawLine(new Posn(1050, 0), new Posn(1050, 900), new Black());
		this.theCanvas.drawLine(new Posn(151, 0), new Posn(151, 900), new Black());
		this.theCanvas.drawLine(new Posn(1051, 0), new Posn(1051, 900), new Black());
		this.theCanvas.drawLine(new Posn(150, 0), new Posn(1050, 0), new Black());
		
		// balls
		for(int i = 0; i < this.balls.size(); i ++){
			if(this.powerUp.equals("FireBall")){
				this.balls.get(i).color = Color.red;
			}
			this.balls.get(i).draw(theCanvas);
		}
		
		// bricks
		for(int i = 0; i < this.bricks.size(); i++){
			this.bricks.get(i).draw(theCanvas);
		}
		
		
		// direction lines
		if(this.balls.get(0).dir.equals("upLeftLeft") && this.holdBall == 1){
			this.theCanvas.drawLine(new Posn(this.padel.loc.x + 60, this.padel.loc.y), new Posn(this.padel.loc.x -130, this.padel.loc.y - GameWorld.PADEL_HIEGHT - 90), Color.black);
			this.theCanvas.drawLine(new Posn(this.padel.loc.x + 60, this.padel.loc.y), new Posn(this.padel.loc.x -130, this.padel.loc.y - GameWorld.PADEL_HIEGHT - 90), Color.black);
		}
		if(this.balls.get(0).dir.equals("upLeft") && this.holdBall == 1){
			this.theCanvas.drawLine(new Posn(this.padel.loc.x + 60, this.padel.loc.y), new Posn(this.padel.loc.x - 90, this.padel.loc.y - GameWorld.PADEL_HIEGHT - 140), Color.black);
			this.theCanvas.drawLine(new Posn(this.padel.loc.x + 60, this.padel.loc.y), new Posn(this.padel.loc.x - 90, this.padel.loc.y - GameWorld.PADEL_HIEGHT - 140), Color.black);
		}
		if(this.balls.get(0).dir.equals("upUpLeft") && this.holdBall == 1){
			this.theCanvas.drawLine(new Posn(this.padel.loc.x + 60, this.padel.loc.y), new Posn(this.padel.loc.x - 20, this.padel.loc.y - GameWorld.PADEL_HIEGHT - 180), Color.black);
			this.theCanvas.drawLine(new Posn(this.padel.loc.x + 60, this.padel.loc.y), new Posn(this.padel.loc.x - 20, this.padel.loc.y - GameWorld.PADEL_HIEGHT - 180), Color.black);
		}
		if(this.balls.get(0).dir.equals("upUpRight") && this.holdBall == 1){
			this.theCanvas.drawLine(new Posn(this.padel.loc.x + 60, this.padel.loc.y), new Posn(this.padel.loc.x + 140, this.padel.loc.y - GameWorld.PADEL_HIEGHT - 180), Color.black);
			this.theCanvas.drawLine(new Posn(this.padel.loc.x + 60, this.padel.loc.y), new Posn(this.padel.loc.x + 140, this.padel.loc.y - GameWorld.PADEL_HIEGHT - 180), Color.black);
		}
		if(this.balls.get(0).dir.equals("upRight") && this.holdBall == 1){
			this.theCanvas.drawLine(new Posn(this.padel.loc.x + 60, this.padel.loc.y), new Posn(this.padel.loc.x + 200, this.padel.loc.y - GameWorld.PADEL_HIEGHT - 150), Color.black);
			this.theCanvas.drawLine(new Posn(this.padel.loc.x + 60, this.padel.loc.y), new Posn(this.padel.loc.x + 200, this.padel.loc.y - GameWorld.PADEL_HIEGHT - 150), Color.black);
		}
		if(this.balls.get(0).dir.equals("upRightRight") && this.holdBall == 1){
			this.theCanvas.drawLine(new Posn(this.padel.loc.x + 60, this.padel.loc.y), new Posn(this.padel.loc.x + 250, this.padel.loc.y - GameWorld.PADEL_HIEGHT - 90), Color.black);
			this.theCanvas.drawLine(new Posn(this.padel.loc.x + 60, this.padel.loc.y), new Posn(this.padel.loc.x + 250, this.padel.loc.y - GameWorld.PADEL_HIEGHT - 90), Color.black);
		}
		
		
		//LASERS
		for(int j = 0; j < this.lasers.size(); j++){
			this.lasers.get(j).draw(theCanvas);
		}
		
		//ROCKETS
		for(int j = 0; j < this.rockets.size(); j++){
			this.rockets.get(j).draw(theCanvas);
		}
		
		// POWERUPS
		/*
		for(int h = 0; h < this.powerUps.size(); h++){
				this.powerUps.get(h).draw(theCanvas);
		}
		*/
		
		
		
		// POWERUPS
		for(int h = 0; h < this.powerUps.size(); h++){
			if(this.powerUps.get(h).release == 1){
				this.powerUps.get(h).draw(theCanvas);
			}
		}
		
	    //stats
		this.theCanvas.drawString(new Posn(1060, 20), "Score: ");
		this.theCanvas.drawString(new Posn(1100, 20), new Integer(this.score).toString());
		this.theCanvas.drawString(new Posn(1060, 40), "Level: ");
		this.theCanvas.drawString(new Posn(1100, 40), new Integer(this.level).toString());
		this.theCanvas.drawString(new Posn(1060, 60), "Lives: ");
		this.theCanvas.drawString(new Posn(1100, 60), new Integer(this.lives).toString());
		this.theCanvas.drawString(new Posn(1060, 80), "Ammo: ");
		this.theCanvas.drawString(new Posn(1100, 80), new Integer(this.ammo).toString());
	
		
	}
	
	public static void main(String args[]){
		 
		
		
		GameWorld2 world = new GameWorld2(Color.cyan, new Padel(Color.black, new Posn(510, 750 - GameWorld.PADEL_HIEGHT)), 
				new Ball(Color.black, new Posn(570,710), GameWorld.BALL_RADIUS_START, "upLeftLeft"), new ArrayList<Brick>());
		
		world.initLevelOne();
		
		world.bigBang(1200, 750, .015);
		
	}
}


