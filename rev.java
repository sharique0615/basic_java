 import java.util.Scanner;
 class rev
 {
	 int n;
	 int r=0;
	 int i=0;
	 
void getdata()
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter your choice ");
	 n=sc.nextInt();
	 while(i<n)
	 {
		 r=r*10 + n%10;
		 n=n/10;
	 }
 }
 void revdata()
{
	System.out.println("rev is "+r);
} 
 public static void main(String []args)
 {
	 rev r=new rev();
	 r.getdata();
	 r.revdata();
 }
 }