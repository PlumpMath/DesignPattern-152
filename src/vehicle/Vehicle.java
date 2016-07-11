package vehicle;

import java.util.Date;



public abstract class Vehicle {
	
	int x;
	int y;
	int price;
	int speed;
	Date date;
	
	public Vehicle(int x, int y, int price, int speed, Date date){
		super();
		this.x = x ;
		this.y = y;
		this.speed = speed;
		this.price = price;
		this.date = date;
	}
	
	
	
	
	
	
	abstract int getX();
	abstract void setX(int x);
	abstract int getY();
	abstract void setY(int y);
	@Override
	public String toString() {
		return "x=" + x + ", y=" + y + ", price=" + price + ", speed="
				+ speed + ", date=" + date + "]";
	} 
	


}
