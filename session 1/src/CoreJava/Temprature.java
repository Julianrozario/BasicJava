package CoreJava;

public class Temprature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i[]=new int [7];
		i[0]=50;
		i[1]=34;
		i[2]=70;
		i[3]=58;
		i[4]=64;
		i[5]=44;
		i[6]=55;
		
		String[] day= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		
		int a=0;
				for (int x=0;x<i.length;x++)
		{

			if (a<i.length)
			{
		System.out.println(day[a]+"temprature is "+i[x]);
		a++;

			

		
		}

	}

		
		
		
	}

}
