class String9
{
	public static void main(String args[])
	{

//In a String check capital & small letters,digits,space and symbols and print it


		/*String s="he1l&lo2 3Al4L * Eve7RyOne";
		int capital=0,small=0,digit=0,space=0,symbol=0;
		for(int x=0;x<=s.length()-1;x++)
		{
			char c=s.charAt(x);
			if(Character.isUpperCase(c))
				capital++;
			else if(Character.isLowerCase(c))
				small++;
			else if(Character.isDigit(c))
				digit++;
			else if(c==' ')
				space++;
			else
				symbol++;
		}
		System.out.println("capital "+capital+" small "+small+" digits "+digit+" space "+space+" symbol "+symbol);*/






//checking the object where did the objects will be creating in it like scp nor heap memory

		/*String s1="hii";                       //it have in scp  object        1
		String s2=new String("hii");           //it have scp object and create in the heap memory      1	=>1+1=2
		System.out.println("before hashcode");
		System.out.println("s1 "+s1+" "+System.identityHashCode(s1));
		System.out.println("s2 "+s2+" "+System.identityHashCode(s2));
		s2=s1.intern();
		System.out.println("after hashcode");
		System.out.println("s1 "+s1+" "+System.identityHashCode(s1));
		System.out.println("s1 "+s1+" "+System.identityHashCode(s1));

//checking the object where did the objects will be creating in it like scp nor heap memory


		String s3="hii";            //it have creates in scp object		1scp
		String s4=new String("Hii");  //first scp creates object and also heap will create object 		1scp   +   1heap    =1scp+1scp+1heap=3objects have create in it
		System.out.println("before hashcode");
		System.out.println("s3 "+s3+" "+System.identityHashCode(s3));
		System.out.println("s4 "+s4+" "+System.identityHashCode(s4));
		//s4=s3.intern();
		System.out.println("after hashcode");
		System.out.println("s3 "+s3+" "+System.identityHashCode(s3));
		System.out.println("s4 "+s4+" "+System.identityHashCode(s4));*/












//unicode of every code will be sum in these process

		/*String s1="hello 123 all 986 everyone";
		int sum=0;
		for(int x=0;x<=s1.length()-1;x++)
		{
			char c=s1.charAt(x);
			sum=sum+c;
		}
		System.out.println("sum is "+sum);




//sum of the digits add in the string

		String s2="hello 123 all 986 everyone";
		int sum1=0;
		for(int x=0;x<=s2.length()-1;x++)
		{
			char c=s2.charAt(x);
			if(Character.isDigit(c))
			{
				int n1=Character.getNumericValue(c);
				System.out.println(n1);
				sum1=sum1+n1;
			}
		}
		System.out.println("sum1 is "+sum1);*/
		




//print small letter to capital letter,capital letter to small letter

			/*String s1="HeLLO 85 al564L EveryONE";
			String s2="";
			for(int x=0;x<=s1.length()-1;x++)
			{
				char c=s1.charAt(x);
				if(Character.isUpperCase(c))
					s2+=Character.toLowerCase(c);
				else if(Character.isLowerCase(c))
					s2+=Character.toUpperCase(c);
				else
					s2+=c;
			}
			System.out.println(s2);*/





//check alphabets and print

			String s1="121ganesh 8 RAVulA 11";
			String s2="";
			for(int x=0;x<=s1.length()-1;x++)
			{
				char c=s1.charAt(x);
				if(Character.isAlphabetic(c))
					s2+=c;
			}
			System.out.println(s2);
	}
}