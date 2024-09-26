package com.Part12_StackImpl;

public class Part12_Stack {
    int maxsize ;
    int[] stackArray;
    int top;

    Part12_Stack(int size){
        this.maxsize = size;
        this.stackArray = new int[maxsize];
        this.top = -1;
    }

    public void push(int val){
        if(isFull()){
            System.out.println("Stack is full");
        }
        else{
            stackArray[++top] = val;
        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        else{
            return stackArray[top--];
        }
    }

    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isFull(){
        return top==maxsize-1;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        else{
            return stackArray[top];
        }
    }

    public static void main(String[] args) {
        Part12_Stack stack = new Part12_Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
