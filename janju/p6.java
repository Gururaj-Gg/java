import java.util.Scanner;
import java.util.concurrent.SubmissionPublisher;

import javax.print.attribute.Size2DSyntax;

public class p6 {
    public static void main(String[] args) {
        int []a;
        int i,s=0,n;
        Scanner sc=new Scanner(System.in);
        a=new int[10];
        System.out.println("Enter the array size:");
        n=sc.nextInt();
        System.out.println("Enter the array elements:");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }


    
        for(i=0;i<10;i++)
        {
            s+=a[i];
            
        }

        System.out.println("SUM of the array is:"+s);
    



    }
}
