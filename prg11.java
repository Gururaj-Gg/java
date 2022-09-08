import java.util.LinkedList;
import java.util.List;

public class prg11 {
    public static void main(String[] args) {
        LinkedList<Character> l1=new LinkedList<Character>();
        l1.add('B');
        l1.add('E');
        l1.add('F');

        l1.addLast('G');
        l1.addFirst('A');
        l1.add(2, 'D');
        l1.add(2, 'C');
        System.out.println("\n After Insertion");
        System.out.println("contents: "+l1);

        System.out.println("\n Here the first and last elements: "+l1.getFirst() +" " + l1.getLast());
        List<Character> sub=l1.subList(2, 5); 
        System.out.println("\n content of sublist"+sub);
        LinkedList<Character> l2=new LinkedList<Character>(sub);
        l1.removeAll(l2);
        System.out.println("\n After removing l2 from l1");
        System.out.println("contents: "+l1);
        l1.removeFirst();
        l1.removeLast();
        System.out.println("\n after deleting 1st and last elemnt");
        System.out.println("contents: "+l1);
        l1.set(0, Character.toLowerCase(l1.get(0)));
        System.out.println("\n after change:"+l1);

       l1.pollLast();
       System.out.println("\n after polllast: "+l1);
       l1.pollFirst();
       System.out.println("\n after pollfirst: "+l1);
       l1.offerFirst('E');
       l1.offerLast('A');
       System.out.println("\n after offer: "+l1);
       l1.push('M');
       System.out.println("\n after push:"+l1);
       l1.pop();
       System.out.println("\n after pop: "+l1);

    }
}
