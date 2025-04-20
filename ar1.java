class Void
   {
       void is1()
       {
         System.out.println();
       }
       void is1(int x)
       {
         System.out.println("int "+x);
       }
       void is1(short y)
       {
         System.out.println("short "+y);
       }
      void s1(byte b)
       {
          System.out.println("byte "+b);
       }
      void s1(long l)
       {
         System.out.println("long "+l);
       }
      void s1(double d)
       {
         System.out.println("double "+d);
       }
      void s1(float f)
       {
         System.out.println("float "+f);
       }
      public static void main(String args[])
      {
        Void a1=new Void();
        a1.is1((short)10);
      }
}