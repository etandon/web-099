/**
 * Created by eshan.tandon on 2/22/18.
 */
public class LinkedListCycle {
    public static void main(String[] arg) {
        System.out.println("Test");


    }

    boolean hasCycle(Node head) {
        Node l1 = head;
        Node l2 = head;
        boolean result = false;
        if(l1 == null) return false;
        while (l1.next != null) {
          if(l2.next == null || l2.next.next == null){
              result = false;
              break;
          }
          else if(l1.next == l2.next.next){
              result = true;
              break;
          }
          else {
              l1=l1.next;
              l2=l2.next.next;
          }

        }
        return result;



    }

    class Node {
        int data;
        Node next;
    }

}
