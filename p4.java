
class shape{
   private double height;
    private double width;
    
shape(double h,double w)
   {
    width=w;
    height=h;
    }
   double getWidth(){
        return width;
    }
    double getHeight(){
        return height;
    }
    
   /* void setWidth(double w)
    {
       width=w;
    }
    void setHeight(double h){
        height=h;
    }
    */
    void print_sup()
    {
        System.out.println("i am in a super class shape");
    }

}
class triangle extends shape{

    String s;
    triangle( double h,double w)
    {
        super(h,w);
    }
    double area()
    {
        return getWidth()*getHeight()/2;
    }
    /*double areaa()
    {
     return width*height;
}
        void print_sub()
        {
            System.out.println("i am in sub class extending from the shape");
    
    }*/
}
    class rectangle extends shape{
        rectangle( double w,double h){
            super(w, h);
        }
        double areaa(){
            return getWidth()*getHeight();
        }
    }
    
public class p4 {
    public static void main(String[] args) {
        triangle t1=new triangle(10,20);
        rectangle r1=new rectangle(20,30);
        //t1.setHeight(20);
         //t1.setWidth(3);
        //t1.print_sup();
        //t1.print_sub();
        System.out.println("The area of traingle ="+t1.area());
        System.out.println("The area of rectangle ="+r1.areaa());
    }
}
