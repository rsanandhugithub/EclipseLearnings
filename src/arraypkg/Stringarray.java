package arraypkg;

import java.util.Scanner;

public class Stringarray {

	public static void main(String[] args) {
		String[] st=new String[4];
		System.out.println("enter names");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			st[i]=sc.next();
		}
		System.out.println("entered name:");
		//for(int i=0;i<4;i++)
		//{
	    //System.out.println(st[i]);
	    //}
		
		for(String v:st)
			{
			System.out.println(v);	
			}
				
				
		}
	}


