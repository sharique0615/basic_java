import java.util.Scanner;
class aaa
{
	int a;
	int b;
	
	
	aaa(int x,int y){
	x=a;
	y=b;
	}
	
	void inputdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		a=sc.nextInt();
		System.out.println("enter second number");
		b=sc.nextInt();
		
	}
	
	//void displaydata()
	//{
	//	System.out.println("a="+a+" b="+b);
	//}
	
	void outputdata()
	{
		int c;
		c=a+b;
		System.out.println("addition = "+c);
		
	}
	public static void main(String []args)
	{
		aaa aa=new aaa(100,30);
		//aa.displaydata();
		aa.inputdata();
		aa.outputdata();
	}
}