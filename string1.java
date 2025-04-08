class String1
	{
	public static void main(String args[])
	{
//finding length of a string
		/*String s="I am ganesh";
			//123456789 
		System.out.println(s.length());*/

//finding the index and its element
		/*String s="%he$llo 3@wor-ld";
			//012345678910
		char c=s.charAt(9);
		System.out.println(c);*/

//reverse element 

		/*String s="Apple";
		int h=s.length();
		for(int p=h-1;p>=0;p--)
		{
			char c=s.charAt(p);
		
		System.out.println(c);
		}*/






//finding element count  type in an array
	/*	String s="ravi is handsome 572 @ AnDrApRaDeSh $";
		int small_lettercount=0;
		int capital_lettercount=0;
		int numberscount=0;
		int symbolcount=0;
		int r=s.length();
		System.out.println(r);
		for(int x=0;x<=r-1;x++)
		{
			char c=s.charAt(x);
			if(c>='a' && c<='z')
			{
				small_lettercount++;
			}
			else if(c>='A' && c<='Z')
			{
				capital_lettercount++;
			}
			else if(c>='0' && c<='9')
			{
				numberscount++;
			}
			else
			{
				symbolcount++;
			}
		}
		System.out.println("numberscount "+numberscount);
		System.out.println("small letter "+small_lettercount);
		System.out.println("numbers "+numberscount);
		System.out.println("symbol "+symbolcount);*/



//finding a element and check wheather its a palidrome or not
		/*String s="Mam";
		String s2="";
		for(int x=s.length()-1;x>=0;x--)
		{
			char c=s.charAt(x);
			s2+=c;
		}
		System.out.println(s2.equals(s)? s2+" palindrome":s2+" not palindrome");
		
		System.out.println(s2.equalsIgnoreCase(s)? s2+" palindrome":s2+" not palindrome");*/


//converting string into uppercase nor lowercase
		/*String s="poPcOrN";
		String s2="";
		for(int x=0;x<=s.length()-1;x++)
		{
			char c=s.charAt(x);
			s2+=c;
		}
		System.out.println(s2.toLowerCase());
		System.out.println(s2.toUpperCase());*/


//finding the index and print the element in it 
		/*String s="woami";
			//01234
		String even="";
		String odd="";
		for(int x=0;x<=s.length()-1;x++)
		{
			char c=s.charAt(x);
			if(x%2==0)
			even+=s.charAt(x);
			else
			odd+=s.charAt(x);	
		}
		System.out.println("even "+even);
		System.out.println("odd "+odd);*/



//finding the vowels in a string and print in it
		/*String s="capital";
		String vowels="";
		String consonent="";
		for(int x=0;x<=s.length()-1;x++)
		{
			char c=s.charAt(x);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			vowels+=c;
			else
			consonent+=c;
		}
		System.out.println("vowels "+vowels);
		System.out.println("consonent "+consonent);*/
		
	}
	}