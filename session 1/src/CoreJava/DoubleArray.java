package CoreJava;

public class DoubleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//first array symbol represents row
		//second arry symbol represents coulmn
		
		String flights[][]=new String[4][4];
		
		//first row
	flights [0][0]="dallas";
	flights [0][1]="NYC";
	flights [0][2]="miami";
	flights [0][3]="chicago";
	
	//second row
	flights [1][0]="New Mexico";
	flights [1][1]="San Diego";
	flights [1][2]="DC";
	flights [1][3]="Newark";
	
	//Third row
				
	flights [2][0]="New orleans";
	flights [2][1]="Boton rough";
	flights [2][2]="kansas";
	flights [2][3]="toronto";	
		
	//forth row
	
	flights [3][0]="Denver";
	flights [3][1]="Honolulu";
	flights [3][2]="Harrisburg";
	flights [3][3]="Huston";
		
	//System.out.println(flights[3][1]);
	
	int rows=flights.length;
	
	int cols=flights[0].length;
	
	//argument for rows
	
	for (int rownum=0;rownum<rows;rownum++) {
		//argument for column 
		
		for (int colnum=0;colnum<cols;colnum++) {
			
			System.out.println(flights[rownum][colnum]);
		}
	}
	
	
	
	}

}
