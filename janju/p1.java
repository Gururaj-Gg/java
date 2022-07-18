class box {
    double l,h,b;
    box(double x,double y,double z) {

        l=x;
        h=y;
        b=z;
   }
   box(double x) {

    l=b=h=x;

   }
   double volume(){
    return l*b*h;
   }
void print(){
    System.out.println("method overloading");
}
void print(double v){

    System.out.println("volume="+v);
}
}

public class p1 {
    public static void main(String[] args) {
      
        box b=new box(4,2,3);
        box b1=new box(4);
        double v1=b.volume();
       double v2= b1.volume();
       b.print();
       b1.print();
       b.print(v1);
       b1.print(v2);
         

        
    }
    
}
