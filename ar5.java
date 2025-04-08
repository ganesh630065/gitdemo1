class Ar5{
   public static void main(String[] args){
     int a[]={10,21,12,32,34};
     int b[]=new int[a.length];
      for(int x=0;x<b.length;x++)
       {
          b[x]=a[a.length-1-x];
       }
       for(int x=0;x<b.length;x++)
        {
          System.out.println("b["+x+"]="+b[x]);
        }




   /* int a[]={12,57,10,43,98,67};
    int b[]=new int[a.length];
    int z=0;
     for(int x=0;x<=a.length-1;x++)
     {  
        if(a[x]%2==0)
        {
            b[z]=a[x];
         System.out.println(b[z]);
	    z++;


        }
     }
    for(int x=0;x<=a.length-1;x++)
     {
        if(a[x]%2!=0)
        {
         b[z]=a[x];
        System.out.println(b[z]);
          z++;
        }
     }*/
    
    
   int a[]={10,23,32,43,98};
   int b[]=new int[a.length];
   int max=10;
   int smax=0;
    for(int x=0;x<a.length;x++)
     {
         if(smax<a[x] && max!=a[x])
         smax=a[x];
     }
   // System.out.println(max);
    System.out.println(smax);
   }
}