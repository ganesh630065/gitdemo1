class Me3
 {
      private void m5()
 	{
		System.out.println("who am i ?");
	}
   public static void main(String args[])
	{
		Parent p=new Child();//reference type=>p && object type child
		p.m1();
		p.m3();
		p.m4();
		Me3 m3=new Me3();
		m3.m5();
	}
 }
class Parent
 {
	  void m1()
	 {
	 	System.out.println("hii");
	 }
	protected void m3()
	 {
		System.out.println("do");
	 }
	 void m4()
	 {
		System.out.println("v");
	 }
 }
class Child extends Parent
	{
		@Override
		  void m1()
		 {
			System.out.println("ravula");
		 }
		 public void m3()
		 {
			System.out.println("ganesh");
		 }
		 public void m4()
		 {
			System.out.println("goud");
		 }
	}