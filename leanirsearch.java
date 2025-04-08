//linear search
class Ar6
 {
   public static void main(String args[])
    {
      int a[]={10,23,43,12,87,14};
             // 0  1  2 3  4  5
      int search=12,count=0;
      for(int x=0;x<=a.length-1;x++)
       {
          if(a[x]==search)
          {
            System.out.println("search element is "+x);
            count++;
            break;
          }
      }
      if(count==0)
        System.out.println("search element is not found "+search);
       
    }
 }