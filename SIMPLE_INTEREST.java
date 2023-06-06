import java.util.*;
public class Simple
{
    public static void main(String args[])
    {
        int P,T;
        float R,I;
        Scanner sc=new Scanner(System.in);
        P=sc.nextInt();
        T=sc.nextInt();
        R=sc.nextFloat();
        I=(P*T*R)/100;
        System.out.println((int)I);
        sc.close();
    }
}