package controlstmts;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int r,s=0;
		
		while(n>0)   //153
		{
			r=n%10;    //153%10=3
			s=s+r*r*r;   //0+27
			n=n/10;      //153/10=15
			
			
			
			
		}
			if(temp==s)
			{
				System.out.println("armstrong");
			}
			else
			{
				System.out.println("not armstrong");
			}
	}

}
