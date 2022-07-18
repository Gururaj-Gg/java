import java.text.NumberFormat.Style;
import java.util.Scanner;

//class revers{
   // int d=s.length()-1;
        //for(int i=d;i>=0;i--){
          //  System.out.print(sb.charAt(i));
    //    }
//}
public class p3 {
    public static void main(String[] args) {
        //StringBuffer sb=new StringBuffer(s);
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.next();
        StringBuffer sb=new StringBuffer(s);
        System.out.println("capacity="+sb.capacity());
int g=sb.length()-1;
StringBuffer re=new StringBuffer();
StringBuffer r=new StringBuffer();
        for(int i=g;i>=0;i--)
        {
re=re.append(sb.charAt(i));
        }
//System.out.println(re.toString());
String b=re.toString();
System.out.print(b.toUpperCase());
r.append(b.toUpperCase());
System.out.println("\n");
System.out.println("enter the string TO APPEND");
b=sc.next();
System.out.println("apended="+r.append(b));
        }
    }
