import java.util.ArrayList;
class Co2 
{
	public static void main(String args[])
	{
		/*ArrayList al=new ArrayList();
		al.add(10);
		al.add(10.23);
		al.add("gani");
		al.add('c');
		al.add(true);
		System.out.println(al);
		ArrayList a=new ArrayList();
		a.add(12);
		a.add(34);
		al.addAll(a);
		System.out.println(al);
		ArrayList a1=new ArrayList();
		a1.add(8);
		al.add(a1);
		System.out.println(al);
		al.remove(a1);
		System.out.println(al);
		System.out.println(al.contains('c'));
		System.out.println(al.contains('l'));
		System.out.println(al.size());
		System.out.println(al.isempty());*/
		ArrayList al=new ArrayList();
		al.isEmpty();
		al.add(67);
		al.add("pop");
		ArrayList a=new ArrayList();
		a.add("treat");
		a.add("pop");
		a.add(67);
		System.out.println(a);
		System.out.println(al.removeAll(a));
		System.out.println(al);
		ArrayList a2=new ArrayList();
		a2.add(67);
		System.out.println(a2);
	}
}
