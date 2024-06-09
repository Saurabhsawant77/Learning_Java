package com.Questions.BinaryTrees;

import com.Part9_Trees.TreesTrail;

public class CountNumberofNodes {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int[] nodes){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static int countNodes(Node root,int count){
            if(root == null){
                return count;
            }

            countNodes(root.left,count++);
            countNodes(root.right,count++);

            return count;
        }
    }
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
//        System.out.println(root.data);

        int cntNodes = tree.countNodes(root,0);
        System.out.println(cntNodes);


    }
}
