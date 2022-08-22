import java.util.Scanner;
class QueueException extends Exception{
    public void error(){
System.out.println("full");
return;
    }
}
class queue
{
    int front;
int rear;
int q[];
queue(int n){
    q=new int[n];
}
void insert(int ele) throws QueueException{
    if(rear==q.length){
throw new QueueException();
}
if(front==-1)
front=0;
q[rear++]=ele;
}
int delete()
{
    int ele;
if(front==-1){
    throw new ArrayIndexOutOfBoundsException();
}
if(front==rear){
ele=q[front];
rear=front=-1;
}
else{
    ele=q[front++];
}
return ele;
}
void dispaly()
{
    if(front==-1){
        System.out.println("is ful");
    }
    for(int i=front;i<rear;i++){
        System.out.println(+q[i]+"\t");
    }

}
}
public class prg7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size enter");
        int size=sc.nextInt();
        queue que = new queue(size);
        try{
            while(true){
                System.out.println("\n1.insert\n2.delete\n3.dispaly");
                int choice=sc.nextInt();
                switch(choice){
                    case 1:System.out.println("entr no");
                         que.insert(sc.nextInt());
                    break;
                    case 2: que.delete();
                    break;
                    case 3:que.dispaly();
                    break;
                    default:System.out.println("invalid choice");
                    return;
                }
            }
        }
        catch(QueueException e){
            e.error();
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("que is empty");
        }
    }
}
