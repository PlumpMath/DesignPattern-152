package vehicle;

public class Car extends Vehicle implements Driveable{
	
	
	public Car(int x , int y ,int price, int speed, int yearOfMade){
		
		super(x, y, price, speed, yearOfMade);
	
	}

	@Override
	int getX() {
		return x;
	}

	@Override
	void setX(int x) {
		this.x = x;
	}

	@Override
	int getY() {
		return y;
	}

	@Override
	void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Car [" + super.toString();
	}


	@Override
	public void Drive() {
		System.out.println("Car move");
	}
}
