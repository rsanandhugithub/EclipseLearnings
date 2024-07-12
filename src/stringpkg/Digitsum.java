package stringpkg;

import java.util.Scanner;

public class Digitsum {

	public static void main(String[] args) {
		
		System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r, sum = 0 ;
        while(n>0)
        {

		r = n%10;
		sum=sum+r;
		n=n/10;
        }

		System.out.println("sum="+sum);

		}
}


