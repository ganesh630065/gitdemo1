class Factors
{
  public static void main(String[] args)
  {
     /* for(int x=1;x<=10;x++)
      {
	int num=x,sum=0,pro=1;
        int start=1,end=num;
        for( ;start<=end;start++)
        {
	     if(num%start==0)
	     {
		if(start%2==0)
			sum+=start;
		else
			pro*=start;
             }
	}
	System.out.println(num +" sum : "+sum+" product : "+pro);
     }*/


      /* int num=234,rem=0;
       while(num!=0)
       {
         rem=num%10;
         System.out.println(rem);
         num=num/10;
       }*/



   /* int num=234,rem=0;
    do
    {
      rem=num%10;
     System.out.println(rem);
      num/=10;
    }
     while(num!=0);*/



/*int num=2345,rem=0,reverse=0;
 do
  {
    rem=num%10;
    reverse=reverse*10+rem;
    num/=10;
   System.out.println(reverse);
  }
  while(num!=0);*/


       /*  int num=7654,min=num%10,rem=0,reverse=0,temp=num;
       do
         {
           rem=num%10;
           if(rem<min)
           min=rem;
           num=num/10;
          System.out.println(min+temp);
         }
         while(num!=0);*/

    /*int num=2,end=num,count=0;
    for(int start=1;start<=end/2;start++)
    {
      if(num%start==0)
       {
         count++;
       }
    if(count==0 && num==2)
       System.out.println(end+" prime number");
     else
       System.out.println(end+" not a prime number");
      System.out.println(start);
    }*/
      

          /* for(int x=1;x<=10;x++)
           {
              int count=0;
            for(int y=1;y<=10;y++)
             {
               if(y==5)
                 count++;
                 break;
             // System.out.println(y);
              }
              System.out.println(y);
            }  */  


  
  /*  int num=7256383,count=0,rem=0,sum=0,factorial=1,temp=num;
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
       num/=10;
     }
    System.out.println(sum);
    System.out.println(sum==temp?" armstong number ":" not armstrong number");*/
    

      /* int num=98474,rem=0,pro=1,count=0,sum=0,temp=num;
       while(num!=0)
       {
         rem=num%10;
         count++;
         int power=(int)Math.pow(rem,count);
         sum+=power;
         num/=10;
       }
      System.out.println(sum==temp?" armstrong":" not armstrong")*/  


     /*  int num=2343,pro=1,rem=0,start=1,temp=num;
       while(start<=num)
       {
         rem=num%100;
         pro=pro*rem;
         num/=100;
       }
       System.out.println(pro==rem? " armstrong":" not armstrong");*/


      /*  int num=4568,count=0,temp=num;
        while(num!=0)
        {
          count++;
          num=num/10;
         }
          if(count%2==0)
           {
             num=temp;
             int rem=0,sum=0;
             while(num!=0)
             {
                rem=num%100;
                int n1=rem;
                while(n1!=0)
                {
                   rem=n1%10;
                   int pro=1;
                     for(int x=1;x<=rem;x++)
                       {
                         pro=pro*x;
                       }
                          sum+=pro;
                       n1=n1/10;
                    }
                 }
                }
                  if(rem==sum)
                   {
                     System.out.println("strong number");
                   }
                   else
                     {
                       System.out.println("not strong number");
                     }
                    num=num/100;
             }*/


          /* for(int x=1;x<=10;x++)
           {
             int num=x;
            System.out.println("\n"+num+"digits are");
             while(num!=0)
             {
               int rem=num%10;
               System.out.println(rem);
               num=num/10;
             }
           }*/


//sum of digit code



    /* for(int x=100;x<=200;x++)
      {
        int num=x,sum=0,temp=num;
        while(num!=0)
        {
         int rem=num%10;
         sum+=rem;
         num/=10;
        }
      System.out.println(temp+" sum is "+sum);
      }*/


//armstrong range 1to1000
 
   /* for(int x=1;x<=10000;x++)
     {
       int num=x,count=0,rem=0,sum=0,temp=num;
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
              num/=10;
          }
          if(sum==temp)
          System.out.println(temp+" armstrong number");
       }*/
  }
}