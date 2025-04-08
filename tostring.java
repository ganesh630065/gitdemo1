//toString
class Employee1
	{
		 int id;
		 String name;
		String department;
		double salary;
		Employee1(int i, String n,String d,double s)
			{
				this.id=i;
				this.name= n;
				this.department=d;
				this.salary=s;
			}
		public String toString()
			{
				return id+" "+name+"  "+department+" "+salary;
			}
		public static void main(String args[])
			{
				Employee1 e=new Employee1(101,"ganesh","it",5600);
				System.out.println(e.toString());
			}
	}