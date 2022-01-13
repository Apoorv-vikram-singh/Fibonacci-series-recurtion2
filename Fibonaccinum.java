//using only single variable interview usefull
import java.util.*;
public class Fibonaccinum 
{
    public static void  printFibonacci(int n,int m,int last)
    {
        if(last == 0)
        {
            return;
        }
        int o=n+m;
        System.out.println(o);
        printFibonacci(m, o, last-1);
        
    }
    public static void main(String args[])
    {
        int n=0;
        int m=1;
        Scanner sc=new Scanner(System.in);
        int last=sc.nextInt();
        System.out.println(n);
        System.out.println(m);
        printFibonacci(n,m,last-2);
    }
}
