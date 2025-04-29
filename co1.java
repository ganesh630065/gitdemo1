import java.util.ArrayList;
class co1
{
	public static void main(String args[])
	{
		Arraylist a=new Arraylist();
		a.m1();
		a.m2();
		a.m3();
		a.m4();
	}
}
interface Iterable
{
	void m1();
}
interface Collection extends Iterable
{
	void m2();
	void m3();
}
interface List extends Collection
{
	 void m4();
}
class Arraylist implements List
{
	public void m1()
	{
		System.out.println("when");
	}
	public void m2()
	{
		System.out.println("go");
	}
	public void m3()
	{
		System.out.println("treat");
	}
	public void m4()
	{
		System.out.println("ran");
	}
}