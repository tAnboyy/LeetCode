package linkedlist;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

//if(nums1.length > nums2.length) {
//        return intersect(nums2, nums1);
//        }
//        Map<Integer, Integer> map

public class MiddleoftheLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.next = temp2;

        Node ans = middleNode(head);
        System.out.println(ans.data);
    }

    public static Node middleNode(Node rabbit) {
        Node tort = rabbit;
        while (rabbit != null && rabbit.next != null) {
            tort = tort.next;
            rabbit = rabbit.next.next;
        }
        return tort;
    }
}
