class Md3
	{
	public static void main(String args[])
	{
			Child p=new Child();
			System.out.println(p.add()+" "+p.sub()+" "+p.mul()+" "+p.div()+" "+p.mod());
	}
	}
abstract class Parent
	{
		int a,b;
		 Parent()
		{	
			 a=9;b=8;
		}
			public int  add()
			{
				return a+b;
			}
			abstract public int sub();
			public int  mul()
			{
				return a*b;
			}
	}
class Child extends Parent
	{
		int x,y;
		Child()
		{
			 x=7;y=6;
		}
			@Override
			public int sub()
			{
				return x-y;
			}
			public int  div()
			{
				return x/y;
			}
			 public int mod()
			{
				return x%y;
			}
		
	}