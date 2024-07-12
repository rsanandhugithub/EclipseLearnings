package arraypkg;

public class Methodpgm {

	public static void main(String[] args) {
		
		Methodpgm ob=new Methodpgm();
		ob.add();
		int value=ob.sub();
        System.out.println("subtraction="+value);
        ob.mul(20,30);
        double v=ob.div(30, 2);
        System.out.println("division="+v);
        
       }

		//1.method without parameter and without returntype

		public void add()
		{
			int a=34,b=40,c;
			c=a+b;
			System.out.println(c);

		}

		//2.method with returntype and without parameter

		public int sub()
		
		{
			
        int a=34,b=40,c;
        c=a+b;
        return c;
        
		}
		
		//3.method without returntype and with parameter
		
		
		public void mul(int a,int b)
		{
			int c=a*b;
			System.out.println("multiplication="+c);
		}
		
		
		//4.method with returntype and with parameter
		public double div(int a,int b)
		{
			double c=a/b;
			return c;
			
			
			
		}
		
}
			
		
		
		
		
		
		
		
		
		
		
	


