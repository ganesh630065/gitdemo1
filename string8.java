class String8
{
	public static void main(String a[])
	{
		/*String s="ganesh";
		String s2="";
		String s3="";
		for(int x=0;x<=s.length()-1;x++)
		{
			if(x%2==0)
			{
				char c=s.charAt(x);
				s3+=c;
			}
			else
			{
				char c=s.charAt(x);
				s2+=c;
			}
		}
				System.out.println(s2.toUpperCase());
				System.out.println(s3.toLowerCase());*/
			
		



//it will remove the space on the word;
		/*String s="  hello,world   ";
		String trimed=s.trim();
		System.out.println(trimed);*/
//replace of name
		/*String str="i am ganesh";
		String s2=str.replace("ganesh","durgaprasad");
		System.out.println(s2);*/
//replace of all 
		/*String str="cont123acts";
		String r=str.replaceAll("\\d","@");
		System.out.println(r);*/

//joins ()
		//String s=String.join("/","java","python","html");
		//System.out.println(s);
//starts with()
		/*String s="hello world";
		boolean r=s.startsWith("world",6);
		System.out.println(r);*/
//ends with()
		/*String s="ganesh@gmail.com";
		boolean r=s.endsWith(".com");
		System.out.println(r);*/
//isblank()
		/*String s="";
		String s2="   ";
		String s3="ganesh";
		System.out.println(s.isBlank());
		System.out.println(s2.isBlank());
		System.out.println(s3.isBlank());*/
//isEmpty()
		/*String s="";
		String s2="   ";
		String s3="ganesh";
		System.out.println(s.isEmpty());
		System.out.println(s2.isEmpty());
		System.out.println(s3.isEmpty());*/

//compareto()

		/*String s="ganesh";
		String s1="apple";
		String s3="ban";
		String s4="ban";
		System.out.println(s.compareTo(s1));
		System.out.println(s1.compareTo(s3));
		System.out.println(s3.compareTo(s4));*/
//comparetoignorecase()
			/*String s="ganesh";
			String s1="GANESH";
			System.out.println(s.compareToIgnoreCase(s1));*/
//repeat()
			/*String s="ganesh ";
			String r=s.repeat(4);
			System.out.println(r);*/
//deletecharat()
			/*StringBuilder sb=new StringBuilder("ganesh");
			sb.deleteCharAt(1);
			System.out.println(sb);*/
//setcharat()
			/*StringBuilder sb=new StringBuilder("ganesh");
			sb.setCharAt(1,'n');
			System.out.println(sb);*/
//replacefirst()
			String s="i am ganesh";
			String sb=s.replaceFirst("ganesh","student");
			System.out.println(sb);
	}
}