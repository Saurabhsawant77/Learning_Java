package com.Part11_Linkedlist;

class Node{
    int val ;
    Node next;

    Node(int val){
        this.val = val;
        this.next=null;
    }


}

public class LinkedlistImpl {

    public static void printLL(Node head){
        if(head==null){
            return;
        }
        while(head!=null){
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static int getMiddle(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.val;

    }

    public static boolean isCircular(Node head){
        if(head == null){
            return false;
        }
        Node slow = head;
        Node fast = head.next;
        while(slow != fast && (slow != null && fast != null)){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(slow==fast){
            return true;
        }

        return false;
    }

    public static Node insertAtStart(Node head, int data) {
        if (head == null) {
            Node newNode = new Node(data);
            return newNode;
        }
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
        return head;
    }

    public static Node insertAtEnd(Node head,int data){
        if(head == null){
            Node newNode = new Node(data);
            return newNode;
        }
        Node temp = head;
        Node newNode = new Node(data);
        while (head.next!=null){
            head = head.next;
        }
        head.next=newNode;
        return temp;

    }

    public static Node deleteFromStart(Node head){
        if(head==null || head.next == null){
            return null;
        }


        return head.next;
    }

    public static Node deleteFromEnd(Node head){
        if(head == null || head.next==null){
            return null;
        }

        Node curr = head.next;
//        Node nextt = head.next;
        while (curr.next.next != null){
            curr = curr.next;
        }
        curr.next = null;


        return head;



    }







    public static void main(String[] args) {
            Node head = new Node(10);
            head.next = new Node(20);
            head.next.next = new Node(30);
            head.next.next.next = new Node(40);
            head.next.next.next.next = new Node(50);
        head = insertAtStart(head,9);
            printLL(head);
        head = insertAtEnd(head,51);
        printLL(head);
        head = deleteFromStart(head);
        printLL(head);
        head = deleteFromEnd(head);
        printLL(head);
//        System.out.println(getMiddle(head) + " Middle Element");
//        System.out.println(isCircular(head) + " it is");


    }
}
