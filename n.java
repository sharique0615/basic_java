import java.util.Scanner;
class n{
public static void main(String[]args){
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number required");
	n=sc.nextInt();
	System.out.println("the number required is ");
	for(int i=1;i<n;i++)
	{
		System.out.print(" "+i);
	}
}
}