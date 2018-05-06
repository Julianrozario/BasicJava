package CoreJava;

public class NonStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NonStatic x=new NonStatic(); //instand of an object	
		x.car();
		x.flower();
	}
public void car () { //non static function
	System.out.println("Toyota");
}
	
	
public void flower() {
	System.out.println("I like rose");
}
	
	
}
