package controlstmts;

public class Greatestof3numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a=20,b=50,c=28;
    if(a>b && b>c)
    {
        System.out.println("a is greater");
    
    }
    else if(b>a && b>c)
    {
    	System.out.println("b is greater");
    }
    else
    {
    	System.out.println("c is greater");
	}

}
}
