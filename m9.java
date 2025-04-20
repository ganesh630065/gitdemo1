class M9
 {
   public static void main(String[] args)
     {
//ternary operator for months we required in a data//
           /* int month=15;
            System.out.println((month==1||month==3||month==5||month==7||month==8||month==10||month==12)? "31 days": (month==4||month==6||month==9||month==11)? "30 days": (month==2)? "28/29 days" : "invalid days");*/










//Accept number as input and check wheather it is even or odd to one //
// => if the number is even check wheather its a perfect square or not //
//=> if the number is odd check whether last digit is divisible by five or not//
         /* int num=25;
          if(num%2==0)
           {
                double squre=Math.sqrt(num);
                if(squre==(int)(squre))
                     System.out.println(num+" even number and it is a perfet square");
                else
                       System.out.println(num+" even number and it is not a perfect square");
            }
           else 
            {
                    int last_digit=num%10;
                    if(num%5==0)
                         System.out.println(num+" last digit  is divisible by 5");
                    else
                        System.out.println(num+" last digit  is not divisible by 5");
             }*/









//write a ternary operator for days and take a day as input// 
                   /*  int day=1;
                     System.out.println((day==1) ? "monday": (day==2) ? "tuesday": (day==3) ? "wednesday": (day==4) ? "thursday": (day==5) ? "friday" : (day==6) ? "saturday" : (day==7) ? "sunday" : "invalid days");*/ 







//Take age as input and print whether it is major or minor in it//
                    /*  int age=16;
                      System.out.println(age>=18 ? "major" : "minor");*/






//Accept a person age as input =>if he is a senior citizen =>if the gender is female provided retairment amount of 30,000 per month,if the gender is male provided retairment amount of 35,000 =>if the peron is major=>if he/she is a ug graduate provide scholarship of 30,000 per year =>if he/she is a pg graduate provide scholarship of 40,000 per year =>in all the other cases provide scholarship of 20,000 per year//
                    /* int age=25;
                       if(age>60)
                        {
                           String gender="female";
                            if(gender=="female")
                             {
                               System.out.println("retairment amount of 30,000 to female per month");
                             }
                            else
                             {
                                System.out.println("retairment amount of 35,000 to male per month");
                             }
                         }
                        else if(age>=18)
                           {
                              String qualification="ug";
                                if(qualification=="ug")
                                       {
                                           System.out.println("provided scholarship for ug is 30,000");
                                        }
                                else if(qualification=="pg")
                                      {
                                           System.out.println("provided scholarship for pg is 40,000");
                                      }
                                 else 
                                      {
                                          System.out.println("provided scholarship for ug and pg is 20,000");
                                      }
                             }
                       else
                         {
                                System.out.println("then he/she will become minor");
                         }*/










                          /*int age=44;
                           System.out.println(age>60 ? string gender=" female " gender==" female " ? " retairment amount of 30,000 to female per month " : " retairment amount of 35,000 to male per month " age>=18 string qualification = " ug " qualification=="ug" ? " provided scholarship for ug is 30,000 " qualification=="pg" ? " provided scholarship for pg is 40,000 " : " provided scholarship for ug and pg is 20,000 "  " then he/she will become minor "; */








                
//creating a application to create for parking //
                  /*String name="car";
                    int num=1;
                   char block='a';
                   double tax=100.10;
                   float fee=30.03f;
                   boolean b=true;
                  System.out.println(name);*/
/*int rank = 1234;
String caste = "OC" ;
boolean EWS = true;







if(rank < 1000) 
{
    if(caste =="SC" || caste =="ST")
   {
    System.out.println("Congratulations You will get seat in");
    System.out.println("All Jntu-A Universities");
   }
    else
   {
     if(EWS)
     { 
      System.out.println("Congratulations You will get seat in");
      System.out.println("All Jntu-A Universities");
     }
     else
     {
      System.out.println("Congratulations You will get seat in");
      System.out.println("All Jntu-A Colleges");
     }
   } 
}
else if(rank < 5000)
{
    if(caste =="SC" || caste =="ST")
   {
    if(EWS)
    {
      System.out.println("Congratulations You will get seat in");
      System.out.println("All Jntu-A Tier 1 Colleges");
    }
    else
    {
      System.out.println("Congratulations You will get seat in");
      System.out.println("All Jntu-A Tier 2 Colleges");
    }
   }
    else 
   {
    if(EWS)
    {
      System.out.println("Congratulations You will get seat in");
      System.out.println("All Jntu-A Tier 2 Colleges");
    }
    else
    {
      System.out.println("Congratulations You will get seat in");
      System.out.println("All Jntu-A Tier 3 Colleges");
    }
   }
 }
 else if(rank < 15000)
{
    if(caste =="SC" || caste =="ST")
   {
    if(EWS)
    {
      System.out.println("Congratulations You will get seat in");
      System.out.println("All Jntu-A Tier 2 Colleges");
    }
    else
    {
      System.out.println("Congratulations You will get seat in");
      System.out.println("All Jntu-A Tier 3 Colleges");
    }
   }
    else 
   {
    if(EWS)
    {
      System.out.println("Congratulations You will get seat in");
      System.out.println("All Jntu-A Tier 3 Colleges");
    }
    else
    {
      System.out.println("Congratulations You will get seat in");
      System.out.println("All Jntu-A Tier 4 Colleges");
    }
   }
 }
 else if(rank < 30000)
{
    if(caste =="SC" || caste =="ST")
   {
    if(EWS)
    {
      System.out.println("Congratulations You will get seat in");
      System.out.println("All Jntu-A Tier 4 Colleges");
    }
    else
    {
      System.out.println("Congratulations You will get seat in");
      System.out.println("All Good Colleges");
    }
   }
    else 
   {
    if(EWS)
    {
      System.out.println("Congratulations You will get seat in");
      System.out.println("All Good Colleges");
    }
    else
    {
      System.out.println("Congratulations You will get seat in");
      System.out.println("All Average Colleges");
    }
   }
 }
 else if(rank < 50000)
 {
  System.out.println("Congratulations You will get seat in");
  System.out.println("All Below Average Colleges");
 }
 else 
 {
  System.out.println("Congratulations You will get seat in");
  System.out.println("All Below Average Colleges but not sure that you will get placemenets");
 }
}*/









           /*  String name="Thirumala theater";
             int num1=50;
             int num2=50;
             char c1='a',c2='b';
             String v1="bench",v2="mahindra";
             double d=125.55;
             float fee=30.89f;
             short=2;
             */





//check a code to print fizz buzz if a number is divisible by both 3&5. print last digit of the number if the number is divisible by 7 or 9//
                              /* int num=81;
                               int num2=num%10;
                               if(num%3==0 && num%5==0)
                                {
                                  System.out.println("fizz");
                                }
                               else if(num2%7==0 || num2%9==0)
                                {
                                   System.out.println("buzz");
                                }
                                else
                                {
                                   System.out.println("number cannot be divisible by given numbers");
                                }*/





//take the three nummbers as input and check which number is greater//
                      /* int num1=8;
                       int num2=12;
                       int num3=56;
                       if(num1>num2 &&num1>num3)  //8>12 && 8>56 f
                       {
                         System.out.println("num1 is  greatest number");
                       }
                      else if(num2>num3)  //12>56 f
                       {
                         System.out.println("num2 is greatest number");
                       }
                      else
                       {
                         System.out.println("num3 is greatest number");
                       }*/




//take marks as input and and find grades//
             /*  int total=520;
               if(total>=550 && total<=600)
               {
                 System.out.println("o grade");
               }
              else if(total>=450 && total<550)
               {
                 System.out.println("a grade");
               }
              else if(total>=350 && total<450)
              {
                 System.out.println("b grade");
              }
             else if(total>=250 && total<350)
              {
                 System.out.println("c grade");
              }
            else if(total>=200 && total<249)
              {
                System.out.println("d grade");
              }
            else if(total>=150 && total<199)
              {
                System.out.println("e grade");
              }
            else if(total>=0 && total<149)
              {
                System.out.println("fail");
              }
            else if(total<0)
              {
                System.out.println("invalid negative grade");
              }
            else
              {
                System.out.println("invalid positive grade");
              }*/






//accept a number as input print the number its a single digit number print the last digit if its a double digit number print last two digits its a triple digit number//
                                 /*int num=564;
                                 if(num>=0 && num<10)
                                 {
                                   System.out.println(num);
                                 }
                                else if(num>=10 && num<=99)
                                 {
                                   System.out.println(num%10);
                                 }
                                else if(num>=100 && num<=999)
                                 {
                                   System.out.println(num%100);
                                 }
                                else 
                                 {
                                   System.out.println("triple digit");
                                 } */   








//take a letter as input and convert small to capital letter or capital to smaall letter //
                           /*  int letter='s';
                             if(letter>='A'&&letter<='Z')
                              {
                                char c=((char)(letter+32));
                                System.out.println(letter +" is a capital letter");
                              }
                            else if(letter>='a' && letter<='z')
                              {
                                char c=((char)(letter-32));
                                System.out.println(letter +" is a small letter");
                              }
                            else
                              {
                                System.out.println("invalid letter");
                              }*/






//accept character as input and check wheather its a capital letter,small letter,digit,space and symbol//
                    /*  char c='M';
                      if(c>='a' && c<='z')
                      {
                        System.out.println("small letter");
                      }
                     else if(c>='A' && c<='Z')
                      {
                        System.out.println("capital letter");
                      }
                     else if(c>='0' && c<='9')
                      {
                        System.out.println("digit");
                      }
                     else if(c==' ')
                      {
                        System.out.println("space");
                      }
                     else
                      {
                         System.out.println("symbol");
                      }*/





//accept a number as input print the following //
//=>if the number is divisible by 3 print fizz;//
//=>if the number is divisible by 5 print buzz;//
//=>if the number is divisible by 3 and 5 print fizz and buzz;//
//=>if the number is neither divisible by  3 nor by 5 print the number//
                     /*    int num=2398;
                         if(num%3==0 && num%5==0)
                          {
                             System.out.println("fizz");
                          }
                         else if(num%3==0)
                          {
                             System.out.println("fizz");
                          }                  
                         else if(num%5==0)
                          {
                             System.out.println("buzz");
                          }
                         else 
                          {
                             System.out.println("neither divisible by 3 nor by 5");
                          }*/




//take three numbers as input and keep them into a ternary operator//
                /*   int num1=7,num2=679,num3=89;
                   System.out.println((num1>num2 && num1>num3)? "num1 is" + num1 + " greatest number " : (num2>num3)? " num2 is "+ num2 +" greatest number " : " num3 is "+ num3 +" greatest number");     */







//take four numbers as input and keep them into a ternary operator//
                   /* int num1=8999,num2=66757,num3=90,num4=789;
                     if(num1>num2 && num1>num3 && num1>num4)//89>66757 f 89>90 f 89>789 f//
                     {
                        System.out.println(" num1 " + num1 +" is greatest number");
                     }
                    else if(num2>num3 && num2>num4)//66757>789 t  66757>789 t//
                     {
                        System.out.println(" num2 " + num2 +" is greatest number");
                     }
                    else if(num3>num4)
                     {
                        System.out.println(" num3 " + num3 +" is greatest number");
                     }
                    else
                     {
                        System.out.println(" num4 "+num4 +" is greatest number");
                     }*/






//take a year as input and get wheather it is a leap year or not//
                   /*   int num1=2019;
                      if(num1%4==0 && num1%100!=0 || num1%400==0)//2019%4=
                      {
                        System.out.println("leap year");
                      }
                      else
                      {
                         System.out.println("not a leap year");
                      }*/




//take two numbers as input and check them into switch case//
               /*    int num1=23,num2=43;
                   char symbol='+';
                   switch(symbol)
                    {
                    case'+':
                        System.out.println(num1+num2);
                    case'-':
                        System.out.println(num1-num2);
                    case'/':
                        System.out.println(num1/num2);
                    case'%':
                        System.out.println(num1%num2);
                    case'*':
                        System.out.println(num1*num2);
                     }*/



//using switch case in days//
              /*  int day=4;
                switch(day)
                 {
                    case 1:
                            System.out.println("monday");
                    break;
                    case 2:
                           System.out.println("tuesday");
                    break;
                   case 3:
                           System.out.println("wednesday");
                    break;
                   case 4:
                           System.out.println("thursday");
                     break;
                   case 5:
                           System.out.println("friday");
                     break;
                   case 6:
                           System.out.println("saturday");
                     break;
                   case 7:
                            System.out.println("sunday");
                     break;
                  
                   default:
                   {
                        System.out.println("invalid day");
                    break;
                    }
                 }*/







//write a code by using a switch case even number or odd number//
                   int num1=6;
                   switch(num1%2)
                     {
                       case 0 :
                                  System.out.println("even number");
                       break;
                       case 1:
                                 System.out.println("odd number");
                       break;
                       default :
                                System.out.println("invalid input");
                        break;
                      }
     }
 }