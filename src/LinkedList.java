/**
 * @author jeavydsouza on 22/11/2017.
 */
public class LinkedList {

    public boolean hasCycle(Link link){
        if(link == null)
            return false;

        Link slow = link;
        Link fast= link.next;
        while(fast != null && fast.next != null){
            if (fast == slow)
                return true;
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }

    public class Link {
        int data;
        Link next;

        public Link(int data){
            this.data = data;
        }

        public void append(int value){
            Link current = this;
            while(current != null){
                current = current.next;
            }
            current = new Link(value);
        }
    }
}
