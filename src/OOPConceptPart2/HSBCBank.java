package OOPConceptPart2;

public class HSBCBank implements UsBank,BrazilBank{
	
	//Is-a relationship
	//we are achieving multiple inheritance
	// if class is implementing any interface, then its mandatory to define all overidden method of interface
// overrding  from UsBank
	public void credit() {
	System.out.println("credit HSBC");
}
public void debit() {
	System.out.println("Debit HSBC");
}
	public void transerMoney() {
		System.out.println("HSBC transfer money");
	}
	//separte class method
	public void  educationLoan() {
		System.out.println("hsbc edu loan");
	}
public void carLoan() {
	System.out.println("hsbc carloan");}

//overrding from brazilBank

	public void mutulFund() {
		System.out.println("brazil bank mutul fund");
	}
}

