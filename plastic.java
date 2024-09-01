import java.util.Scanner;
class shape2
{
	double l;
	double b;
	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of shape ");
		l=sc.nextDouble();
		System.out.println("enter breath of shape" );
		b=sc.nextDouble();
	}
	
	double cost()
	{
		double c;
		c=l*b*40;   //as price is mentioned as 40/unit area
		return c;
	}
}

class shape3 extends shape2
{
double h;
 void getdata()
 {
	 super.getdata();
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter height of shape");
	 h=sc.nextDouble();
 } 
 double cost()
 {
	return super.cost()+l*b*h*60;    // as we need to claculate price of both 2d and 3d
 } 
}

class plastic
{
	public static void main(String []args)
	{
		shape3 aa= new shape3();
		aa.getdata();
		double tcost=aa.cost();
		System.out.println("Toatla cost = "+tcost);
	}
	
}
