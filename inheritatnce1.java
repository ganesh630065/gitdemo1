class F1
	{
	
	 public static void main(String args[])
	{
		A f1=new B();
		 f1.sub();
	}
	}
 class A
  {
	 
     	  static void sub()
		{
			static int x=10;
			System.out.println(x);
		}
  }
class B extends A
  {
	 void sub()
	{
		System.out.println(x+y);
	}
  }