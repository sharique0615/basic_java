import java.util.Scanner;
class rev2
{
	int a;
	void getdata(int i)
	{
		a=i;
	}
	void putdata()
	{
		int rev=0;
		while(a>0)
		{
			rev = rev*10 + a%10;
			a=a/10;
		}
		System.out.println("rev is "+rev);		
	}
	public static void main(String []args)
	{
		int m;
		rev2 aa=new rev2();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no for rev");
		m=sc.nextInt();
		aa.getdata(m);
		aa.putdata();
	}
}