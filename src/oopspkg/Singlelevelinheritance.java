package oopspkg;

class parent
{
	public void parentmethod()
	{
		System.out.println("parent method");
		}
}

class child extends parent
{
	public void childmethod()
	{
		System.out.println("child method");
	}	
}

public class Singlelevelinheritance {

	public static void main(String[] args) {
	
		child ob=new child();
		ob.parentmethod();
		ob.childmethod();
		
		
	}

}
