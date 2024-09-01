import java.util.Scanner;
class stud{
	int wt;
	int java;
	int dsa;
	int oop;
	int dbms;
	int os;
	int m;
	float n;
	int total;
	int cgpa;
	int id;
	
	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter student id ");
		  id=sc.nextInt();
		System.out.print("enter marks in wt ");
		  wt=sc.nextInt();
		System.out.print("enter marks in java ");
		  java=sc.nextInt();
		System.out.print("enter marks in dsa ");
		  dsa=sc.nextInt();
		System.out.print("enter marks in oop ");
		  oop=sc.nextInt();
		System.out.print("enter marks in dbms ");
		  dbms=sc.nextInt();
		System.out.print("enter marks in os ");
		  os=sc.nextInt();
		  System.out.println("");
		m=wt+java+dsa+oop+os+dbms;
	      n=m/6;
		 if(m>=540)
		 {
			 cgpa=10;
		 }
		 else if(m>=480)
		 {
			 cgpa=9;
		 }
		 else if(m>=420)
		 {
			 cgpa=8;
		 }
		 else if(m>=360)
		 {
			 cgpa=7;
		 }
		 else if(m>=300)
		 {
			 cgpa=6;
		 }
		 else if(m>=240)
		 {
			 cgpa=5;
		 }
		 else{
			 cgpa=4;
		 }
	}
	 void marksdata()
	 {
		 System.out.print("total marks is "+m);
		  System.out.println("");
	 }
	 void percentdata()
	 {
		 System.out.print("total percentage is "+n);
		  System.out.println("");
	 }
	 void cgpadata()
	 {
		 System.out.print("cgpa is "+cgpa);
		 System.out.println("\n");
		  System.out.println("");
	 }
	 
	 public static void main(String[]args)
	 {
		 stud sharique=new stud();
		 sharique.getdata();
		 sharique.marksdata();
		 sharique.percentdata();
		 sharique.cgpadata();
		 
		 stud soeb=new stud();
		 soeb.getdata();
		 soeb.marksdata();
		 soeb.percentdata();
		 soeb.cgpadata();
		 
		 stud venu=new stud();
		 venu.getdata();
		 venu.marksdata();
		 venu.percentdata();
		 venu.cgpadata();
		 
		 stud riya=new stud();
		 riya.getdata();
		 riya.marksdata();
		 riya.percentdata();
		 riya.cgpadata();
		 
	 	}
}