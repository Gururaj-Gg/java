class cal{
    double a,b,l,h,d;
     
    double angle(double a) {
        this.a=a;
      return a*a;
    }
    double angle(double b,double l) {
        this.l=l;
        this.b=b;
        return l*b;
      }
    double angle(double d,double l,double h){
        this.d=d;
        this.l=l;
        this.h=h;
        return d*l*h;
    }
    void display(double v) {
        System.out.println("area is"+v);
    }


    
}

public class con {
    public static void main(String[] args) {
    cal cal=new cal();
    double v1=cal.angle(10);
    double v2=cal.angle(10,5);
    double v3=cal.angle(0.5,10,5);
    cal.display(v1);
    cal.display(v2);
    cal.display(v3);
    }





    
}
