package Java.LInkedList;

public class Cycle {
    public static void main(String[] args) {
       Cycle cy = new Cycle();
        Node LL = cy.createLinkedList();
        boolean CL = cy.hasCycle(LL);
        System.out.println(CL);

    
    }
    public boolean hasCycle(Node head) {
        Node sp= head;
        Node fp= head;
        while(fp != null && fp.next != null){
            sp = sp.next;
            fp = fp.next.next;
            if(sp == fp){
                return true;
            }
        }
        return false;
    }
    private Node createLinkedList()
    {
        Node firstNode = new Node(10);
        Node secondNode = new Node(20);
        Node thirdNode = new Node(30);
        Node forthNode = new Node(40);

        Node head = firstNode;
        head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;
        forthNode.next =secondNode;
        return head;
    }
}

