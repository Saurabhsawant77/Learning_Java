package com.Questions.LeetCode;


  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
class Solution extends ListNode{
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num1 = 0;
        int max = 0;
        int c1 = 0;
        int c2 = 0;
        while(l1!=null){
            num1 = num1*10 + l1.val;
            c1++;
            l1 = l1.next;
        }
        // num1 = reversenum(num1);
        System.out.println(num1);
        int num2 = 0;
        while(l2!=null){
            num2 = num2*10 + l2.val;
            c2++;
            l2 = l2.next;
        }
        if(c1==c2){
            max = c1;
        }
        else if(c1>c2){
            max = c1;
        }
        else{
            max=c2;
        }
        // num2 = reversenum(num2);
        System.out.println(num2);

        int finalans = num1+num2;
        System.out.println(finalans);
        ListNode finalList = new ListNode();
        ListNode root=finalList;

        while(finalans>0 ){
            int rem = finalans%10;
            finalList.val = rem;
            if(max>0){
                finalList.next  = new ListNode();
                finalList=finalList.next;
                max--;
            }
            else{
                return root;
            }

            finalans = finalans/10;

        }


        return root;
    }

    public static int reversenum(int n){
        int rev = 0;
        while(n>0){
            int rem = n%10;
            rev = rev*10 + rem;
            n = n/10;
        }

        return rev;
    }
}
public class AddTwoNumbers extends Solution{
    public static void main(String[] args) {
        ListNode l1 = new ListNode(7);
        l1.next = new ListNode(0);
        l1.next = new ListNode(8);

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next = new ListNode(1);

    Solution.addTwoNumbers(l1,l2);
    }
}