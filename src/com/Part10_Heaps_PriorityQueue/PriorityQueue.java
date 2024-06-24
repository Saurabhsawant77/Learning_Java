package com.Part10_Heaps_PriorityQueue;

import java.util.Comparator;

public class PriorityQueue {
    static class Student implements Comparable<Student> { // comparable is interface it is by degfault in java
        String name;
        int rank;

        Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }

    }



    public static void main(String[] args) {
        java.util.PriorityQueue<Student> pq = new java.util.PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new Student("Saurabh",1)); // O(logn)
        pq.add(new Student("Sachin",3));
        pq.add(new Student("Abhishek",2));
        pq.add(new Student("Arpit",4));

        while (!pq.isEmpty()){
            System.out.println(pq.peek().rank + " -_- " + pq.peek().name); // O(1)
            pq.remove(); // O(logn)
        }


    }
}
