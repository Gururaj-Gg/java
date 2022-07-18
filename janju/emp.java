
import java.util.Scanner;

import javax.swing.SpringLayout;

class employee {
    int eno,sal;
    String name;
     
    
    employee(int no,int s,String n){
      eno=no;
       
      sal=s;
      name=n;
      
    }
    void printdata()
    {
        System.out.println("EMPNO:"+eno);
        System.out.println("EMPNAME:"+name);
        System.out.println("SALARY:"+sal);
   
    }
}


public class emp {

    public static void main(String[] args) {
        employee e[]=new employee[5];
        String name;
        int i,eno,sal;
       Scanner sc=new Scanner(System.in);
        for(i=1;i<5;i++)
        {
            System.out.println("Enter empno:");
            eno=sc.nextInt();
            System.out.println("Enter name");
            name=sc.next();
            System.out.println("Enter SALARY:");
            sal=sc.nextInt();
            e[i]=new employee(eno,sal,name);
       }
        for(i=1;i<5;i++)
        {

            e[i].printdata();
        }
        

    }
    
}
