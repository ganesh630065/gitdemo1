//divisible by 3//
class M6
 {
  public static void main(String args[])
   {
    /* int num=686968988;
     if(num%3==0)
      {
        System.out.println("divisible by 3");
      }
     else
      {
        System.out.println("not divisible by 3");
      }*/
//find x and y values//
     /*  String gender="female";
         int x=10,y=20;
             x=-9;
             y=-7;
         if(gender=="male")
          {
              x=45;
              y=324;
          }
         else
          {
              x=987;
              y=89780;
          }
          System.out.println(x+" "+y);*/
 //which is greater num1 or num2 and sum of the num1 and num2//
          /* int num1=198,num2=877;
            if(num1>num2)
             {
               System.out.println("num1 is greater");
             }
             else
             {
               System.out.println("num2 is greater");
             }*/
               int num1=198,num2=877;
               if(num1>num2)
               {
                 System.out.println("num1 is greater");
                  int last_num1=num1%10;
                  int last_num2=num2%10;
                 System.out.println("last digit of"+num1+"is"+last_num1+"last digit of"+num2+"is"+last_num2);
                }
               else
                {
                   System.out.println("num2 is greater");
                      int sum=num1+num2;
                    System.out.println(" sum of " +num1+ " and " +num2+ " is " +sum);
                }  
   }
 }