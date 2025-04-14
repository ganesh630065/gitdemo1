//encapuslation oops 
class An
{
	public static void main(String args[])
	{
		Encapus p=new Encapus();
		p.setAge(22);//method call
		p.setName("ganesh");
		System.out.println(p.getAge()+" "+p.getName());
	}
}

	class Encapus//constructor
	{
		private int age;//private variable
		private String name;
		
	public int getAge()
	{
		return age;
	} 
	public void setAge(int age)
	{
		this.age=age;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	}
