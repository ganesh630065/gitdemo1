class Interface
{
	public static void main(String args[])
	{
		/*Abc a=new Abc();
		a.add();
		i1.sub();
		//a.sub();
		a.mul();*/
		

		B b=new B();
		b.div();
		b.add();
	}
}
/*interface i1
{
	public void add();
	 void mul();
	static void sub()
	{
		System.out.println("sub1");
	}
}
class Abc implements i1
{
	public void add()
	{
		System.out.println("add");
	}
	public void mul()
	{
		System.out.println("mul");
	}
	public void sub()
	{
		System.out.println("sub2");
	}
}*/





abstract class A
{
	abstract void div();
	void add()
	{
		System.out.println("add");
	}
}
class B extends A
{
	void div()
	{
		System.out.println("div");
	}
}

