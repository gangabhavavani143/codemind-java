import java.util.*;
public class Circle
{
    public static void main(String args[])
    {
        int n;
        float area;
        final float pi=3.14f;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        area=pi*n*n;
        System.out.format("%.2f",area);
        sc.close();
    }
}