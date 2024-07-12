package controlstmts;

public class Nestedif {

	public static void main(String[] args) {
   int age=21,weight=54;
		
		if(age>=18)
		{
			if(weight>55)
			{
		       System.out.println("eligible for blood donation");
			}
			else
			{
				System.out.println("not eligible:minimum weight required is 55");
			}
		}
		 else
		 {
			  System.out.println("not eligible");
		 } 

	}

}
