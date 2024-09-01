import java.util.Scanner;
class digit{
	public static void main(String []args){
		int d;
		int i=0;
		int sum=0;
		Scanner sc=new Scanner(System.in) ;
		System.out.println("enetr digit");
		d=sc.nextInt();
		while(i<d)
		{
			sum=sum+d%10;
			d=d/10;
		}
		System.out.println("sum of digits are"+sum);
	}
}