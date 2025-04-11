class Palindromestring
{
 public static boolean checkPal(String s)
 {
 			String rev="";
			for(int x=s.length()-1;x>=0;x--)
			{
				char c=s.charAt(x);
				rev+=c;
			}
   			if(s.equal(rev))
   					return true;
  			else
				   return false;
}
public static void main(String a[])
{
			String s="mom and dad";
			String str[]=s.split(" ");
			for(String t:str)
			{
	                  if(checkPal(t))
                              System.out.println(t);
			}
		}
}