//missing elements in an array

class Br7
	{
	public static void main(String args[])
		{
			int a[]=new int[]{1,8,6,3,7};
					//
			for(int x=1;x<=8;x++)
			{//1<=8
				int count=0;
				for(int y=0;y<=a.length-1;y++)
				{//0<3
					if(x==a[y])
					{//1==3
						count++;
						break;
					}
				}
				if(count==0)//
					System.out.println(x);
			}
		}
	}