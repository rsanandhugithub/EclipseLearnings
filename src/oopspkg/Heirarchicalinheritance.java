package oopspkg;

class Animal
{
	public void animalmethod()
	{
		System.out.println("animal");
	}

}

class Lion extends Animal
{
	public void lionmethod()
	{
		System.out.println("lion");
	}
}

class Tiger extends Animal
{
	public void Tigermethod()
	{
		System.out.println("Tiger");
	}
}

public class Heirarchicalinheritance {

	public static void main(String[] args) {
		
	Tiger ob=new Tiger();
	ob.Tigermethod();
	ob.animalmethod();
	
   Lion ob1=new Lion();
   ob1.lionmethod();
   ob1.animalmethod();
   
	
	
		
		
		

	}

}
