class student {
     int usn;
     String name;
    void getdata(int u,String n) {
        usn=u;
        name=n;

    }
    void printdata() {
        System.out.println("usn="+usn);
        System.out.println("name="+name);

    }


}

public class sdemo {
    public static void main(String[] args) {
        student s=new student();
        s.getdata(10,"dhanu");
        System.out.println("usn="+s.usn);
        
        s.printdata();


    }
    
}
