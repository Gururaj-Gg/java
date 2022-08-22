package shape;

public class shapemin {
    public static void main(String[] args) {
        circle c=new circle();
        square s=new square();
        triangle t=new triangle();
 s.getData(10.5);
        System.out.println("the area of square is"+s.area());
    t.getData(20.56,23.00);
        System.out.println("the area of triangle is"+t.area());
        c.getData(5.5);
        System.out.println("the area of circle is"+c.area());
    }
}
