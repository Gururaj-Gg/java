import java.util.Scanner;

class LessBalanceEXception extends Exception
{
    LessBalanceEXception(double amnt)
    {
        System.out.println("withdrawing"+amnt+"is invalid");
    }
}

class user{
    String name;
    user(String name){
        this.name=name;
    }
    class Account{
        int acno;
        double bal;
        Account(int acno,double bal){
            this.acno=acno;
            this.bal=bal;
        }
    }

   Account [] a = new Account[2];
        void depost(int acno,double amnt)
        {
            int k=-1,found=0;
            for(int i=0;i<2;i++)
                if(a[i].acno==acno){
                    found=1;
                    k=i;
                    break;
                }
                    if(found==1){
                        System.out.println("balamce updated");
                            display(a[k].acno);
                    }
                    else
                System.out.println("acc no exist");
        }
        
        void withdra(int acno,double amnt) throws LessBalanceEXception{
            int k=-1,found=0;
            for(int i=0;i<2;i++)
                if(a[i].acno==acno){
                    k=i;
                    found=1;
                    break;
                }
                if(found==1)
                {
                    if((a[k].bal<500)||a[k].bal<amnt)
                    throw new LessBalanceEXception(amnt);
                    else
                    {
                        a[k].bal-=amnt;
                        display(a[k].acno);
                    }
                }
                else
                System.out.println("acnt no exist");
        }
void creat_accnt()
{
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<2;i++)
    {
        System.out.println("enter amnmt");
        int acno=sc.nextInt();
        System.out.println("enter bal");
        double bal=sc.nextDouble();
        a[i]=new Account(acno, bal);
    }
}
void display(int acno)
{
    int k=-1,found=0;
    for(int i=0;i<2;i++)
    {
        if(a[i].acno==acno)
        {
            k=i;
            found=1;
            break;
        }
        if(found==1)
        {
            System.out.println("-----acc details-----");
            System.out.println(name+"\t"+a[k].acno+"\t"+a[k].bal);
            System.out.println("---------------------");
        }
    }
}
}
public class P5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("create an accnt with min bal 500");
        System.out.println("enter name");
        String name=sc.next();
        int acno;
        user u = new user(name);
        u.creat_accnt();
        System.out.println("account created sucessfully");
        boolean opt=true;
        while(opt)
        {
          System.out.println("---------------");
          System.out.println("1.balance en2.deposit3.witd");
          System.out.println("entr ur choice");
          int ch=sc.nextInt();
          switch(ch)
          {
            case 1:System.out.println("your accnt dts");
                    System.out.println("entr acc no");
                    acno=sc.nextInt();
                    u.display(acno);
                    break;
            case 2:System.out.println("entr acn");
                   acno=sc.nextInt();
                   System.out.println("ent amnt to dep"); 
                   double amnt=sc.nextDouble();
                   u.depost(acno, amnt);     
                   break;
            case 3:try{
                   System.out.println("entr acc no");
                   acno=sc.nextInt();
                   System.out.println("to wid");
                double accnt=sc.nextDouble();
                u.withdra(acno,acno);
            } 
            catch(LessBalanceEXception e){}
            break;
          }

        }
    }
}
