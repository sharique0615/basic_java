import java.util.Scanner;
class two{	
public static void main(String[]args)
{
	int a;
	int b;
	Scanner sc= new Scanner(System.in);
	System.out.println("enter val of a ");
	a= sc.nextInt();
	System.out.println("enter val of b ");
	b= sc.nextInt();
	//Scanner sc=new Scanner(System.in);
	  //int sum=a+b;
	//int prod=a*b;
	int mod=a%b;
	//int quo=a/b;
	System.out.println("remainder is "+mod);
}}


