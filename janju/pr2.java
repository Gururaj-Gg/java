class outer {
    int out_x=100;
    class inner {
        int in_y=20;
        void in_display()
        {
            System.out.println("The value of y is:"+in_y);
            System.out.println(in_y+out_x);
        }
    }
        void out_display()
        {
          inner in=new inner();
          System.out.println("The value of out_x is:"+out_x);
          System.out.println("The value of in_y is:"+in.in_y);
        }
}




public class pr2 {
    public static void main(String[] args) {
        outer out=new outer();
        out.out_display();
        System.out.println("----------------------------------------");
        outer.inner oi=out.new inner();
        oi.in_display();
    }
    
}
