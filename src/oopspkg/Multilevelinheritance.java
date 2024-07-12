package oopspkg;

class father
{
	public void fathermethod()
	
	{
	System.out.println("father");
}
}

class son extends father
{
	public void sonmethod()
	
	{
		System.out.println("son");
	}
}

class Grandson extends son
{
	public void grandsonmethod()
	{
		System.out.println("grandson");
	}
}

public class Multilevelinheritance {

	public static void main(String[] args) {
		Grandson ob=new Grandson();
		ob.fathermethod();
		ob.sonmethod();
		ob.grandsonmethod();
	}

}
