//bobble sort
class Bobblesort
	{
	public static void main(String agrs[])
	{
		/*int a[]=new int[]{12,2,23,6,8,32,34,4};
		System.out.println("before sorting");
		for(int t1:a)
		{
			System.out.println(t1);
		}
		for(int x=0;x<=a.length-2;x++)
		{
			for(int y=x+1;y<=a.length-2-x;y++)
			{
				if(a[x]>a[y+1])
				{
					int t=a[x];
					a[x]=a[y+1];
					a[y+1]=t;
				}
			}
		}
		System.out.println("after sorting");
		for(int t:a)
		{
			System.out.println(t);
		}*/





		int a[]={16,24,34,43,3,1};
		int b[]=new int[a.length];
		for(int x=0;x<=a.length-2;x++)
		{
			int min=x;
			for(int y=min+x;y<=a.length-1;y++)
			{
				if(a[y]>a[min])
				{
					min=y;
				}
				int t=a[y];
				a[y]=a[min];
				a[min]=t;
			}
		}
			for(int t1:a)
				System.out.println(t1);







		/*int a[]={1,7,87,3,56,23,32};
		int size=a.length;
		System.out.println("befor sorting");
		for(int t:a)
			System.out.print(t+" ");
			for(int k=0;k<size;k++)
			{
			for(int  y=0;y<size-1;y++)
			{
				if(a[y]>a[y+1])
				{
					int t=a[y];
					a[y]=a[y+1];
					a[y+1]=t;
				}
			}
			}
		System.out.println("after sorting");
		for(int t1:a)
			System.out.print(t1+" ");*/

	}
	}