//encapuslation oops 
class An
{
	public static void main(String args[])
	{
		Encapus p=new Encapus();
		p.setage(22);//method call
		p.setname("ganesh");
		System.out.println(p.getage()+" "+p.getname());
	}
}

	class Encapus//constructor
	{
		private int age;//private variable
		private String name;
		
	public int getage()
	{
		return age;
	} 
	public void setage(int i)
	{
		age=i;
	}
	public String getname()
	{
		return name;
	}
	public void setname(String s)
	{
		name=s;
	}
	}
