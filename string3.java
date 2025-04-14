//import java.util.Arrays;
class String3
	{
	public static void main(String args[])
	{
		/*String s="a quIck brown fox jumps over the lazy";
		for(char x='a';x<='z';x++)
		{
			int count=0;
			for(int y=0;y<=s.length()-1;y++)
			{//
				char c=s.charAt(y);
				if(c==x)
				count++;
			}
			if(count==0)
				System.out.println(x);
		}*/



		/*for(char c='A';c<='Z';c++)
		{
			int count=0;
			for(int y=0;y<=s.length()-1;y++)
			{
				char a=s.charAt(y);
				if(a==c)
				count++;
			}
			if(count==0)
				System.out.println(c);
		}*/



		//System.out.println(s.indexOf('a'));
		//System.out.println(s.lastIndexOf('a'));




//unique letters in an array
		/*String s="i am ganesh here";
		for(int x=0;x<=s.length()-1;x++)
		{
			char p=s.charAt(x);
			if(s.indexOf(p)==s.lastIndexOf(p))
			System.out.println("unique letter "+p);
		}*/


//dupicate letters in an array
		/*String s="keep",s2="";
		for(int x=0;x<=s.length()-1;x++)
		{
			char y=s.charAt(x);
			if(s.indexOf(y)!=s.lastIndexOf(y))
			{
				if(s2.indexOf(y)==-1)
				s2+=y;
			}
		}	
		System.out.println(s2);	*/


//split the words in string
		/*String s="hello all good morning";
		String str[]=s.split("");
		for(String t:str)
			System.out.println(t);*/


//print zeroth index of character in array
		/*String s="vital information resources under sieze";
		String str[]=s.split(" ");
		for(String t:str)
		{
			//System.out.print(t+" ");
			System.out.print(t.charAt(0));
		}*/


//checking a string and length and elements are equal or not if equal print anagram
	/*String s1="listen";			
			String s2="silent";
			if(s1.length()==s2.length())
			{
				char c[]=s1.toCharArray();//{'l','i','s','t','e','n'}
				Arrays.sort(c);
				char c1[]=s2.toCharArray();
				Arrays.sort(c1);
				if(Arrays.equals(c,c1))
					System.out.println("anagram");
				else
					System.out.println("not anagram");
			}*/



//checking a string and length and elements are equal or not if equal print anagram
	/*String s1="client";
			String s2="silent";
			if(s1.length()==s2.length())
			{
				char c[]=s1.toCharArray();
				Arrays.sort(c);
				char c1[]=s2.toCharArray();
				Arrays.sort(c1);
				if(Arrays.equals(c,c1))
					System.out.println("anagram");
				else
					System.out.println("not anagram");
			}*/

			


				/*String s="hello mornings all good morning";
				       //12345 123 1234 1234567
				String max_word="";
				int max_length=0;
				String str[]=s.split(" ");
				for(String t:str)
				{
					 String s2=t;
					System.out.println(s2+" "+s2.length());//5 3 4 7
					if(max_length<=s2.length())
					{//0<=5
						max_length=s2.length();
						max_word=s2;
					}
					else
					{
						max_word=max_word;
					}
				}
				System.out.println("max_word "+max_word);*/
				
			
	



	
				/*String s="hello all good morning";
				for(int x=0;x<=s.length()-1;x++)
				{
					char c=s.charAt(x);	
					System.out.println(s.toUpperCase()+" "+x);
				}*/

	}
	}