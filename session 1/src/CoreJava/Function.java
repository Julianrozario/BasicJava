package CoreJava;

public class Function {

	static int t =4; //global variable
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		country();
	    state();
	    age();
	    addition(4,5,t);
	    massaddition(66,87,67,6);
	    System.out.println(t);  //how to call global variable
	    
	}
	
	
	public static void country () {
		
		System.out.println("I am from mars");
		
		
		
	}
	
	public static void state() {
		System.out.println("I am from texas");
	}

public static void age() {	
	
	int x=9+t; //local varible
	System.out.println(x);
	

}
public static void addition(int a, int b, int t) {
	 int add =a+b+t;
	 System.out.println(add);
}

public static void massaddition(int a, int b, int c, int d){

int add = a+b+c+d;
System.out.println(add);


}

}

