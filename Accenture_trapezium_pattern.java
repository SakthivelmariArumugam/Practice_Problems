import java.util.Scanner;

public class Accenture_trapezium_pattern {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int start=1;
        int end=n*n+1;
        int k1=end+n;
        int k2=k1;
        for(int i=n;i>=1;i--)
        {
            for(int j=n;j>i;j--)
            {
                System.out.print("__");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(start+"*");
                start++;
            }
            k2=k1-i;
            for(int l=k2;l<k1;l++)
            {
                System.out.print(l);
                if(l!=k1-1)
                {
                    System.out.print("*");
                }
            }
            k1=k2;
            System.out.println();
        }
    }
}
