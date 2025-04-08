class Ar7
 {
   public static void main(String args[])
    {
//finding index varaibles even or odd and print the element statement
    /* int a[]={12,21,23,32,45,54,65}; 
     int n=a.length;
     int e_size=n-(n/2);
       int b[]=new int[e_size];
           for(int x=0,y=0;x<n;x++)
            {
              if(x%2==0)
               {
                   b[y]=a[x];
                   y++;
                }
            }
          for(int y=0;y<e_size;y++)
            {
              System.out.println("b["+y+"]="+b[y]);
            }*/


//finding index and elements or even nor odd in it
          /* int a[]={12,-21,32,23,67,89};
           int b[]=new int[a.length/2];
           int y=0;
           for(int x=0;x<a.length;x++)
            {
             if(x%2==0)
              {
               b[y]=a[x];
                 y++;
              }
            }
           for(int i=0;i<y;i++)
            {
             System.out.println("b["+i+"]="+b[i]);
            }*/


//finding negative elements in an array
         int a[]={-12,-2,23,-32,-34,65,-90,-76,78,87,-07};
         int count=0;
         for(int i=0;i<a.length;i++)
          {
             if(a[i]<0)
              {
                count++;
              }
         }
        System.out.println("count is "+count);
        int b[]=new int [count];
        int x=0;
          for(int i=a.length-1;i>=0;i--)
           {
             if(a[i]<0)
              {
                b[x]=a[i];
		System.out.println("b["+x+"]="+b[x]);
		x++;
              }
            }
           
      }
 }