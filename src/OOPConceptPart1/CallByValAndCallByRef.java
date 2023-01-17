package OOPConceptPart1;

public class CallByValAndCallByRef {
int p;
int q;
	public static void main(String[] args) {
		
		CallByValAndCallByRef obj = new CallByValAndCallByRef();
		int x=10;
		int y=20;
		obj.testsum(x, y);//Call by value OR pass b value
		System.out.println(obj.testsum(x, y));
		obj.p=50;
		obj.q=60;
		obj.swap(obj);
		System.out.println(obj.p);
		System.out.println(obj.q);
		
	}

	
	public int testsum(int a,int b) {
		int c=a+b;
		return c;
	}
	//call by ref
	public void swap(CallByValAndCallByRef t){
		int temp;
		temp =t.p;//temp=50
		t.p=t.q;//t.p=60
		t.q=temp;
		
	}
	
}
