class M14
 {
  public static void main(String[] args)
   {
   /* int num1=8,num2=6,num3=86,start=1,max=0;
    while(start<=num1 && start<=num2 && start<=num3)
     {//1<=
       if(num1%start==0 && num2%start==0 && num3%start==0)
         {
           System.out.println(start);
           max=start;
          }
         start++;
       }*/


//take input number as 8765 print 8^3+7^3+6^3+5^3//

     /* int num=8765,sum=0,rem=0,temp=num,count=0,power=3;
      while(num!=0)
      {           //8765!=0t
       rem=num%10;  //8765%10=5
       count++;  //
       double Power=(int)Math.pow(rem,3);
       sum+=power;
       num=num/10;
      }
    System.out.println(temp+" sum is "+sum);*/


//armstorng number or not//

     /* int num=8679,sum=0,count=0,revers=0,rem=0,temp=num;
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
        double power=(int)Math.pow(rem,count);
         sum+=power;
        num/=10;
       }
      System.out.println(sum);
      System.out.println(count);
      System.out.println(sum==temp? temp+" armstrong number ":temp+" not a armstrong number");*/


//print number 77656 and print 6^1+5^2+6^3+7^4+7^5
     
    /*  int num=77656,sum=0,count=0,rem=0,temp=num;
      while(num!=0)
       {
          rem=num%10;
          count++;
         double power=(int)Math.pow(rem,count);
         sum+=power;
         num/=10;
        }
        System.out.println(temp+" sum is "+power);*/


//reverse order
//print num=14789 in reverse module

  /*  int num=14789,rem=0,reverse=0,temp=num;
    while(num!=0)
    {
      rem=num%10;
      reverse=reverse*10+rem;
      num/=10;
     }
     System.out.println(temp+" reverse is "+reverse);*/


//check num is palindrome or not

  /* int num=88,rem=0,sum=0,reverse=0,temp=num;
   while(num!=0)
   {
      rem=num%10;
      reverse=reverse*10+rem;
      //sum+=reverse;
      num/=10;
    }
     System.out.println(reverse==temp? " is a palindrome ":" is not a palindrome");*/


//take a number as input and print it in a reverse and rem and revese module

      /* int num=98667,rem=0,reverse=0,temp=num;
       while(num!=0)
       {
          rem=num%10;
          reverse=reverse*10+rem;
          num=num/10;
        }
      System.out.println(reverse);
       num=reverse;
       while(num!=0)
       {   
         rem=num%10;
          System.out.print( rem);
          num=num/10;
       }*/

//print a number as input and check a palindrome prime number or not a palindrome number


   /* int num=11,count=0,start=1,rem=0,reverse=0,end=num;
     while(start<=num)  
     {
       if(num%start==0)
       {
        count++;
       }
       start++;
     }
     while(num!=0)
     {
       rem=num%10;
       reverse=reverse*10+rem;
       num=num/10;
     }
    System.out.println(reverse==end? end+" is a palindrome":" is not a palindrome");*/


//
   }
 }