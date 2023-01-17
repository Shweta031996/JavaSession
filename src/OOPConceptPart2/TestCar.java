package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		
		// static polyphorphism--compile time polyporphsm
		Bmw b=new Bmw();
		b.start();
		b.stop();
		b.refuel();
		b.startsafety();
		b.engine();
		
		// parent class cannot inherit the property from child class
		Car c=new Car();
		c.start();
		c.stop();
		c.refuel();
		
		//c.startsafety-- not allowed
	// top casting	
	Car c1 =new Bmw();//--child class object can be referred by parent class reference varible -dynamic poly-run time poly 
	c1.start();
	c1.stop();
	c1.refuel();
	//c1.startsafety(); not allowed 
	
	//down casting
	Bmw b1=(Bmw) new Car();//ClassCastException
	
}
}

