import java.util.Scanner;
class max{
	public static void main(String[]args){
		int a;
		int b;
		int c;
		//int max=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of a ");
		a=sc.nextInt();
		System.out.println("enter value of b ");
		b=sc.nextInt();
		System.out.println("enter value of c ");
		c=sc.nextInt();
		if(a>b){
		if(a>c){
			System.out.println("a is greatest"+a);
		}
		if(b>c)
		{
			System.out.println("b is greatest "+b);
		}
		else {
			System.out.println("c is greatest "+c);
		}
		}
	}
}