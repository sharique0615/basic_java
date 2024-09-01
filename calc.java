import java.util.Scanner;
class calc{
	public static void main(String []args ){
		char operation;
		Double a;
		Double b;
		Double res;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter first number");
		a=sc.nextDouble();
		
		System.out.println("enter second number");
		b=sc.nextDouble();
		
		System.out.println("enter your choice");
		operation=sc.nextChar.charAt(0);
		
		switch(operation){
		case '+':
		res=a+b;
		System.out.println("sum is "+res);
		break;
		
		case '-':
		res=a-b;
		System.out.println("difference is "+res);
		break;
		
		case '*':
		res=a*b;
		System.out.println("product is "+res);
		break;
		
		case '/':
		res=a/b;
		System.out.println("division is "+res);
		break;
		
		case '%':
		res=a%b;
		System.out.println("remainder is "+res);
		break;
		
		default:
		System.out.println("invalid");
		break;
		}
         
	}
	
}
		
		