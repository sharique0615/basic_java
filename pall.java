/* import java.util.Scanner;
class pall{
 public static void main(String []args){
	 int d;
	 int rev=0;
	 int i=0;
	 
	 Scanner sc= new Scanner(System.in);
	 System.out.println("enter number");
	 d=sc.nextInt();
      int temp=d;	 
	  while(i<d)
	  {
		 rev=rev*10+d%10;
         d=d/10;		 
	  }
	  
	  if(rev==temp)
	  {
		System.out.println("pallindrome number "+rev);  
	  }
	  else
	  {
	   System.out.println("not pallindrome number"+temp);
      }
 }
}
*/
import java.util.Scanner;
class pall{
 public static void main(String []args){
	 int d;
	 int rev=0;
	 int i=0;
	 
	 Scanner sc= new Scanner(System.in);
	 System.out.println("enter number");
	 d=sc.nextInt();
      int temp=d;	 
	  while(i<d)
	  {
		 rev=rev*10+d%10;
         d=d/10;		 
	  }
	  //System.out.println("pallindrome number "+rev);
	  if(rev==temp)
	  {
		System.out.println("pallindrome number "+rev);  
	  }
	  else
	  {
	   System.out.println("not pallindrome number"+temp);
  } 
 }
}
