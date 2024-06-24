package com.Part10_Heaps_PriorityQueue;


import java.util.ArrayList;

public class LearningHeap {

    static class Heap{
        static ArrayList<Integer> arr= new ArrayList<>();

        public void add(int data){
            arr.add(data);
            int x = arr.size()-1; // child index
            int parent = (x-1)/2;

            while (arr.get(x) < arr.get(parent)){ // O(logn);
                int temp = arr.get(x);
                arr.set(x,arr.get(parent)) ;
                arr.set(parent,temp);

                x = parent;
                parent = (x-1)/2;
            }
        }
        public int peek(){
            return arr.get(0);
        }

        private void heapify(int i){
            int left = 2*i +1;
            int right = 2*i +2;

            int minind = i;

            if(left < arr.size() && arr.get(minind) > arr.get(left)) {
                minind = left;
            }

            if(right  < arr.size() && arr.get(minind) > arr.get(right)){
                minind = right;
            }

            if(minind != i ){
                //swap
                int temp = arr.get(i);
                arr.set(i,arr.get(minind));
                arr.set(minind,temp);

                heapify(minind);
            }
        }

        public int remove(){
            int data = arr.get(0);

            //Step 1
            int temp = arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);

            //Step 2
            arr.remove(arr.size()-1);

            //Step 3
            heapify(0);

            return data;
        }

        public static void printHeap(Heap hp){
            System.out.println(arr.toString());
        }

        public boolean isEmpty(){
            return arr.size() == 0;
        }

    }
    public static void main(String[] args) {
        Heap hp = new Heap();
        hp.add(3);
        hp.add(4);
        hp.add(9);
        hp.add(5);
        hp.add(9);

//        System.out.println( hp.peek());
//        System.out.println(hp.remove());

//        Heap.printHeap(hp);

        while (!hp.isEmpty()){
            System.out.println(hp.peek());
            hp.remove();
        }
    }
}
