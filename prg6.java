class Q{
    int n;
    boolean valueSet=false;
    synchronized int get()
    {
        while(!valueSet)
        try{
            wait();
        }catch(InterruptedException e){
            System.out.println("InterruptedException caught");
        }
        System.out.println("got"+n);
        valueSet=false;
        notify();
        return n;
    }
    synchronized void put(int n){
        while(valueSet){
            try{
                wait();
            }catch(InterruptedException e){
                System.out.println("InterruptedException caught");
        }}
        this.n=n;
        valueSet=true;
        System.out.println("put:"+n);
        notify();
   }}
 class Producer implements Runnable{
 Q q;
 Producer(Q q){
    this.q=q;
    new Thread(this,"producer").start();
 }

public void run(){
int i=0;
for(i=0;i<5;i++){
    q.put(i++);
}
}
 }
 class Consumer implements Runnable{
 Q q;
 Consumer(Q q){
    this.q=q;
    new Thread(this, "consumer").start();
 }
 public void run(){
    for( int i=0;i<5;i++){
        q.get();
    }
 }
 }
 
public class prg6 {
  public static void main(String[] args) {
    Q q=new Q();
    new Producer(q);
    new Consumer(q);
  }  
}
