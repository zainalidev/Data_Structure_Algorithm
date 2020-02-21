import java.util.LinkedList;
import java.util.Queue;  
class Lab5Task3 {
    public static void main(String[] args) {
        Queue <String> queue = new LinkedList<String>();
        queue.add("Zain Ali");
        queue.add("Raja");
        queue.add("Ali");
        queue.add("Ahmed");
        queue.add("Asad");
        //Display contents of the queue. 
        System.out.println("Elements of queue-"+queue);
        //To remove the head of queue.
        String removedele = queue.remove();
        System.out.println("removed element-" + removedele);
        //Display contents of the queue after remove();
        System.out.println(queue);
        //To view the head of queue
        String head = queue.peek();
        System.out.println("head of queue-" + head); 
        // size(); 
        int size = queue.size(); 
        System.out.println("Size of queue-" + size);
        String s="Zain";
        //Removing using Object
        queue.remove("Ali");
        //Removing using index
        queue.remove(0);
        System.out.println("Elements of queue-"+queue);
        queue.clear();
        System.out.println("Elements after clear() method: -"+queue);
   }
}