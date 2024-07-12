package pkg;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("-----airthmetic operator----");
	
	int a=20,b=10;
	System.out.println("a+b= "+(a+b));
	System.out.println("a-b= "+(a-b));
	System.out.println("a*b="+(a*b));//quotient
	System.out.println("a%b="+(a%b));//reminder
	
	System.out.println("----assignment operators----");
	int c=b;
	System.out.println(a+=b); //a=a+b 30
	System.out.println(a-=b); //a=a-b 20
	
	
	System.out.println("------relational operator-----");
	int v1=20,v2=10;
	
	System.out.println(v1==v2);//false
	System.out.println(v1>v2);
	System.out.println(v1<v2);
	
	
	System.out.println("-----logical operators----");
	
	String username="abc";
	String pswd="Abc123";
	
	System.out.println(username=="abc" && pswd=="Abc123");
	System.out.println(username=="abc" || pswd=="Abc12");
	System.out.println(!(username=="abc"));
	
	
	System.out.println("-----unary operators-----");
	
	//++ increment by 1
	//-- decrement by 1
	
	int v3=5;
	
	System.out.println(v3++);//5
	System.out.println(v3);//6
	System.out.println(++v3);//7
	System.out.println(v3--);//7
	System.out.println(--v3);//5
	System.out.println(v3--);
	
	System.out.println("------ternary operator------");
	//variable =condition?exp1:exp2;
	
	String ans=v1>v2?"v1 is greater":"v2 is greater";
	System.out.println(ans);
	
	
	
	}

}
