package com.Part13_TreeImpl;

class Node{
    int val;
    Node left;
    Node right;

    Node(int data){
        this.val = data;
        this.left = null;
        this.right=null;
    }
}

public class TreeNodeImpl {
    public static void print(Node node){

        if(node==null){
            return;
        }

        if(node!=null){
            System.out.println("----");
            System.out.println(node.val);
        }
        print(node.left);
        print(node.right);
    }
    public static void main(String[] args){
        Node node = new Node(5);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(1);
        node.left.right = new Node(0);
        node.right.left = new Node(4);
        node.right.right = new Node(6);

        print(node);
    }
}
