package vehicle;

public abstract class Vehicle {
	
	int x;
	int y;
	int price;
	int speed;
	int yearOfMade;

	
	public Vehicle(int x, int y, int price, int speed, int yearOfMade){
		super();
		this.x = x ;
		this.y = y;
		this.speed = speed;
		this.price = price;
		this.yearOfMade = yearOfMade;
	}
	
	abstract int getX();
	abstract void setX(int x);
	abstract int getY();
	abstract void setY(int y);
	@Override
	public String toString() {
		return "x=" + x + ", y=" + y + ", price=" + price + ", speed="
				+ speed + ", year of made=" + yearOfMade + "]";
	} 
	


}
