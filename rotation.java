//rotation in array
class Br9
	{
		public static void main(String args[])
		{
				int a[]={67,76,34,434,54};
				int temp=a[0];
					for(int g=0;g<=a.lengths;g++)
					{
						a[g]=a[g+1];
					}
					a[a.length-1]=temp;
					for(int t:a)
					System.out.println(t);
		}
	}