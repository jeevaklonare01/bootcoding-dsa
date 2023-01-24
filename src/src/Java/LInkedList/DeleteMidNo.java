//package Java.LInkedList;
//
//public class DeleteMidNo {
//
//
//    public static void main(String[] args) {
//        DeleteMidNo del = new DeleteMidNo();
//        Node head = del.createLinkedList();
//        deleteNode(head);
//
//    }
//    public Node createLinkedList()
//    {
//        Node firstNode = new Node(10);
//        Node secondNode = new Node(20);
//        Node thirdNode = new Node(30);
//        Node forthNode = new Node(40);
//
//        Node head = firstNode;
//        head.next = secondNode;
//        secondNode.next = thirdNode;
//        thirdNode.next = forthNode;
//        forthNode.next =secondNode;
//        return head;
//    }
//    private static void deleteNode(Node node){
//        int temp = data;
//
//        node = node.next;
//        node.next = node.next.next;
//}
//
//}
