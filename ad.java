import java.util.Scanner;
class ad{
	int a;
	int b;
	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of 1st ");
		a=sc.nextInt();
		System.out.println("enter second value");
		b=sc.nextInt();
	}
	void putdata()
	{
		System.out.println("sum is "+(a+b));
	}
	public static void main (String []args)
	{
		ad aa=new ad();
		aa.getdata();
		aa.putdata();
	}
}