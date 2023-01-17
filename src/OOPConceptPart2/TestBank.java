package OOPConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		System.out.println(UsBank.minibal);
	HSBCBank hs =new HSBCBank();
	hs.credit();
	hs.debit();
	hs.educationLoan();
	hs.carLoan();
	hs.transerMoney();
	
	//dynamic polymorphism
	//child class object can be referred by parent class reference variable
	UsBank b= new HSBCBank();
	b.credit();
	b.debit();
	b.transerMoney();
	
	//b.carloan --not allowed

	}

	
}
