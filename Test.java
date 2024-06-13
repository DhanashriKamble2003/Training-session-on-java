package dk.com;

public class Test {

	public static void main(String[] args) {
		Car c1= new Car();
		//c1.speed=10;
		//System.out.println(c1.speed);
		c1.setSpeed(10);
		c1.setDoors("closed");
		c1.setDriver("seated");
		c1.setEngine("off");
		
		System.out.println(c1.getSpeed());
		System.out.println(c1.getDoors());
		System.out.println(c1.getDriver());
		System.out.println(c1.getEngine());

	}

}
