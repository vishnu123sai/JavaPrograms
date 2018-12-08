import java.io.*;
import java.util.*;
class BigInteger {
    public static void main(String[] args) throws InterruptedException {
      Scanner s = new Scanner(System.in);
      int i = s.nextInt();
      System.out.println(fact(i));
    }
    public static int fact(int n)
    {
        if(n==1)
        return 1;
        else
        return n*fact(n-1);
    }
}