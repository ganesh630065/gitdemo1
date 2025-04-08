class Ar3{
   public static void main(String args[]){
     int a[]={10,20,30,40,77};
            //0  1  2  3  4




    /* for(int x=0;x<=a.length-1;x++)
     {
       System.out.println("arr["+x+"]="+a[x]);
     }*/



     /*for(int x=a.length-1;x>=0;x--)
      {
         System.out.println("a["+x+"]="+a[x]);
      }*/


   /*  int sum=0;
      for(int x=0;x<a.length;x++)
      {
        sum=sum+a[x];
      System.out.println("a["+x+"]="+a[x]);
      }
     System.out.println("sum of array elements"+sum);*/


 //index value print where its even
   /*   for(int x=0;x<a.length;x++)
       {
         if(x%2==0)
         System.out.println(x);
       }*/

     /* for(int x=0;x<a.length;x++)
      {
        if(a[x]%2==0)
       System.out.println(a[x]);
      }*/



     int b[]={34,45,65};
            //0  1  2
     int c[]=new int[a.length+b.length];
      System.out.println("a.array elements are");
     for(int x=0;x<a.length;x++)
     {
      System.out.println("a["+x+"]="+a[x]);
      }






     System.out.println("b.array elements are");
      for(int x=0;x<=b.length-1;x++)
      {
         b[x]=a[x];
      System.out.println("b["+x+"]="+b[x]);
      }


   /*  System.out.println("b.array elements are");
       for(int x=0;x<=b.length-1;x++)
        {
          System.out.println("b["+x+"]="+b[x]);
        }
     System.out.println("c.array elements are");
        int y=0;
	for(int x=0;x<a.length;x++)
         {
            c[y]=a[x];
             y++;
         }
         System.out.println(c[y]);
         for(int x=0;x<b.length;x++)
          {
            c[y]=b[x];
             y++;
          }
      System.out.println("c["+y+"]="+c[y]);*/
       

      
   }
}