package controlstmts;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int temp=n;
	    int rev=0,rem;
	    while(n>0) //256>0       //25>0      //2>0
	    	{
	    	rem=n%10;   //256%10=6    //25%10=5    //2%10=2
	    	rev=rev*10+rem;  //0*10+6=6  //6*10+5=65   //65*10+2=652
	    	n=n/10;  //256/10=25   //25/10=2    //2/10=0
	    	
	    	
	    	
	    	
	    	}
		System.out.println(rev);
        if(rev==temp)
        {
        	System.out.println("paliandrome");
        }
        else
        {
        	System.out.println("not paliandrome");
        }
        
	}

}
