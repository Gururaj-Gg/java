import java.util.Scanner;

class accont{
    String owner;
    String accntno;
    double balance;
    accont(String s,String a, double b){
        this.owner=s;
        this.accntno=a;
        this.balance=b;
    }
   void deposit(double ammount)
    {
       this.balance+=ammount;
       System.out.println("the bank details");
       System.out.println(owner+"\t"+accntno+"\tbalance");
    }
    void withdraw(double ammount)
    {
       if(this.balance<500){
        System.out.println("insuffint");
        return;
       }
       this.balance-=ammount;
    }
}
public class account {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the owner name");
        String s=sc.next();
        System.out.println("enter accnt no");
        String a=sc.next();
        System.out.println("balance");
        double b=sc.nextDouble();
    accont c=new accont(s,a,b);
    Boolean opt=true;
    while(opt)
    {
        System.out.println("1.deposit\n2.withdraw\n");
        System.out.println("enter your choice");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:System.out.println("enter dep amm");
            double amt=sc.nextDouble();
            c.deposit(amt);
            break;
            case 2: System.out.println("enter ammount to withdrwal");
            Double amont=sc.nextDouble();
            c.withdraw(amont);
            break;
            default :;
            break;
        }
    }

    }
}
