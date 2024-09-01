import java.util.Scanner;
class even {
	public static void main(String[] args){
		int a=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num to check");
		a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println("even");
		}
		else
			System.out.println("odd");
   }
}		
