import java.util.Scanner;
class area
{
	int s;
	int l;
	int b;
	int h;
	int r;
	
	void square()
{
	Scanner sc= new Scanner(System.in);
	System.out.println("enter side of square ");
	s=sc.nextInt();
	double ar;
	ar=s*s;
	System.out.println("area of square = "+ar);
	
}
   void rect()
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter lenth of rect ");
	l=sc.nextInt();
	 System.out.println("enter breadth of rect ");
	b=sc.nextInt();
	
	double ar;
	ar=l*b;
	System.out.println("area of rectangle = "+ar);
   }
    void circle()
	{
   Scanner sc= new Scanner(System.in);
	System.out.println("enter raius of circle  ");
	r=sc.nextInt();
	double ar;
	ar=3.142*r*r;
	System.out.println("area of circle = "+ar);
	}
	
	void triangle()
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("enter base of triangle ");
	b=sc.nextInt();
	
	System.out.println("enter height of triangle ");
	h=sc.nextInt();
	
	double ar;
	ar=0.5*b*h;
	System.out.println("area of triangle = "+ar);
    }
	
	public static void main(String []args)
	{
	area aa=new area();
	aa.square();
	aa.rect();
	aa.triangle();
	aa.circle();

	area bb=new area();
	bb.circle();
	bb.triangle();
	bb.rect();
	bb.square();

	
	}
}