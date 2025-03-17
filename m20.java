class M20
 {
  public static void main(String[] args)
   {
//take a number as input and print table using nested loop
    /*  int num=8675;
     while(num!=0)
     {
      int rem=num%10;
      int table=rem,pro=1;
     for(int start=1;start<=10;start++)
     {
       pro=table*start;
       System.out.println(table+"x"+start+"="+pro);
      }
      num=num/10;
    }*/

//sum of digits code

 /*  for(int x=10;x<=200;x++)
   {
    int num=x,rem=0,sum=0,temp=num;
    while(num!=0)
    {
      rem=num%10;
      sum+=rem;
      num/=10;
    }
    System.out.println(temp+" sum is "+sum);
   }*/


//1000 to 2000 find last digits
 
 /*  for(int x=1000;x<=2000;x++)
   {
      int num=x,rem=0;
     System.out.println(" \n "+num+" last digits are");
     while(num!=0)
     {
       rem=num%10;
       System.out.println(rem+" ");
       num=num/10;
     }
   }*/



//armstrong method using nested loop 1 to 10000

 /*  for(int x=1;x<=10000;x++)
    {
      int num=x,rem=0,sum=0,count=0,temp=num;
      while(num!=0)
      {
         rem=num%10;
         count++;
         num=num/10;
      }
       num=temp;
       while(num!=0)
      {
         rem=num%10;
        int power=(int)Math.pow(rem,count);
        sum+=power;
        num=num/10;
      }
      if(sum==temp)
       {
         System.out.println(temp+" Armstrong number");
       }
    }*/



//palindrome range between 1 to 10000

  /*  for(int x=1;x<=150;x++)
    {
      int num=x,rem=0,reverse=0,temp=num;
      while(num!=0)
      {
         rem=num%10;
         reverse=reverse*10+rem;
         num=num/10;
      }
     if(reverse==temp)
      {
        System.out.println(temp+" palindrome");
       }
     }*/



//factorial of every digits

      /* int num=1785;
       while(num!=0)
       {
        int rem=num%10,a=rem,pro=1;
        for(int start=1;start<=a;start++)
        {
          pro=pro*start;
         }
          System.out.println(a+"! of factorial is "+pro);
         num=num/10;
       }*/



//each and every digit check prime or not



     int num=1267,count=0,rem,temp=num;
     while(num!=0)
     {
      rem=num%10;
     for(int start=2;start<=rem/2;start++)
     {
       if(rem%start==0)
        {
          count++;
          break;
        }
     }
    if(count==0 && rem!=1)
    {
    System.out.println(num+" prime ");
     }
    else
     {
    System.out.println(num+" not prime");
     }
    num=num/10;
   }
   }
 }