class M11
 {
   public static void main(String[] args)
    {
         /*  int num=3;//10
          while(num!=1)
          { //3!=1  10!=1
           if(num%2==0)
            { //3%2=1 10%2=5
                num=num/2; //num=3/2  5/2
              System.out.println(num+"is even number");
            }
           else
            {
               num=3*num+1; //3*3+1=10 3*10+1=31
               System.out.println(num+" is odd number");
            }
          
         }*/

        /*   int start=1,end=100,count=0,sum=0;
           while(start<=end)
           {
             int num=start;
             int square=(int)Math.sqrt(num);
             if(square*square==square)
             {
              sum=sum+num;
              System.out.println("sum of "+num+" is perfect square");
               count++;
             }
             start++;
          }
         System.out.println("count is"+count);*/
        
        /*    int start=1,end=100,count=0;
            while(start<=end)
            {
                int num=start;
              if(num%3==0 && num%5==0)
               {
                 count++;
               }
              start++;
            }
              System.out.println("count is "+count);*/

              /* int num=6;
               int start=1,end=num;
               while(start<=end)
               {
                if(num%start==0)
                  {
                    System.out.println(start);
                  }
                 start++;
                }*/

               /* int num=6;
                int start=1,end=num,sum=0,count=0;
                System.out.println("factors of"+num);
                while(start<=end)
                {
                  if(num%start==0)
                   {
                     sum=sum+num;
                     count++;
                   }
                   start++;
                }
               System.out.println("sum of"+num+"is"+sum);
               System.out.println("count of"+num+"is"+count);*/

                  /*  int num=17;
                     int start=1,end=num/2,sum=0,pro=1;
                     while(start<=end)
                     {  //1<86t 2<86 3<86f  
                        if(num%start==0)    //86%1t 86%2 t
                         {
                            sum=sum+start;  //1+1=2 1+2=3
                            pro=pro*start;   //1*1=1 1*2=2
                          }
                         start++;  //1+1=2 +1=3
                     }
                     System.out.println(" sum of "+num+" is "+sum);
                    System.out.println(" pro of "+num+" is "+num);
                   if(sum==pro)
                    System.out.println("perfect square");
                   else
                    System.out.println("not a perfect square");*/

               /*      int num=12;
                     int start=1,end=num/2,count=0;
                     while(start<=end)
                     {
                       if(num%start==0)
                        {
                         System.out.println(start);
                          count++;
                        }
                         start++;
                     }
                     System.out.println("number of factors of"+num+"is"+count);
                     System.out.println(count==2 ? "prime number":"not a prime number");*/
  
                 /*   int num=12,max=0;
                    int start=1,end=num/2;
                    while(start<=end)
                    {
                        if(num%start==0)
                        {
                           max=start;
                          System.out.println(start);
                        }
                        start++;
                    }
                    System.out.println(" higher factor of "+num+" is "+max);*/    

            
                 /*      int num1=666,num2=124,num3=78,max=0;
                       int start=1;
                       while(start<num1 && start<num2 && start<num3)
                       {
                        if(num1%start==0 && num2%start==0 && num3%start==0)     
                        {        
                         max=start;
			System.out.println(start);
                        }
                        start++;
                       }
                     System.out.println("max is"+max);*/

                     
                      
                /*     int a=0,b=1,c=0,start=a,n=10;
                     while(start<=n)
                     {
                       c=a+b;
                       System.out.println(a+"");
                       a=b;
                       b=c;
                       start++;
                     }*/
     }
 }