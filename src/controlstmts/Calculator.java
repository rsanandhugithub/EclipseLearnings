package controlstmts;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a=20,b=40;
		char ch='+';
		
		switch(ch)
		{
		case '+':System.out.println("sum="+(a+b));
		break;
		case '-':System.out.println("sub="+(a-b));
		break;
		case '*':System.out.println("mul="+(a*b));
		break;
		case '/':System.out.println("div="+(a/b));
        break;
        default:System.out.println("invalid choice");
		}

	}

}
