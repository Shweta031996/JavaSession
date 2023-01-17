package OOPConceptPart2;

public class Bmw extends Car{//has-a-relationship
//method overriding --when same method is present in the parent class as well as in child class with the same name and number of arg 
	public void start () {
		System.out.println("bmw start");// overidden method
	}
	public void startsafety() {
		System.out.println("bmw startsefty");
	}
}

