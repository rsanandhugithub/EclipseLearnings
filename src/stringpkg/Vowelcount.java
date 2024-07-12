package stringpkg;

import java.util.Scanner;

public class Vowelcount {

	public static void main(String[] args) {
		System.out.println("enter a string");
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        
        Vowelcount v=new Vowelcount();
        v.vowelCount(s);

		}

		

		public void vowelCount(String s)

		{

		int count=0;

		for(int i=0;i<s.length();i++)

		{

		if(s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o'||s.charAt(i)=='u')

		{
          count++;
        }
		}

		System.out.println("vowel count="+count);	

	
	}

}
