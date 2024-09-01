import java.util.Scanner;
class calcu{
	
	Double a;
	Double b;
	
	void getdata()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("input first value ");
	a=sc.nextDouble();
	System.out.println("input second value ");
	b=sc.nextDouble();
	}
	
	void adddata()
	{
		System.out.println("sum is "+(a+b)
		);
    }
	
	void subdata()
	{
		System.out.println("difference is "+(a-b));
    }
	
	void multdata()
	{
		System.out.println("product is "+(a*b));
    }
	
	void divdata()
	{
		System.out.println("quotient is "+(a/b));
    }
	
	public static void main (String []args)
	{
		calcu aa=new calcu();
		aa.getdata();
		aa.adddata();
		aa.subdata();
		aa.multdata();
		aa.divdata();
		calcu bb=new calcu();
		bb.getdata();
		bb.adddata();
		bb.subdata();
		bb.multdata();
		bb.divdata();
	}
}