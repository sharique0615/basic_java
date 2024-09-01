class demo
{
	int id;
	String name;
	static String cname="kiit";
	float cgpa;
	demo(int x,String y,float z)
	id=x;
	name=y;
	cgpa=z;
	void display()
	{
		System.out.println("ID - "+id+"NAME - "+name+"collage name - "+cname+"CGPA - "+cgpa);
		
	}
}

class student
{
	public static void main(String[] args)
	{
	demo aa=new demo(21052790,"Sharique",9.8);
	demo bb=new demo(21052888,"asdfgh",9.9);
	demo cc=new demo(21052313,"fdytgf",9.6);
	demo dd=new demo(21052654,"ytrfeds",9.2);
	demo ee=new demo(21052987,"bfdffs",9.5);
    }
}