package com.Part8_HashSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashsetLearning {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        //Adding element in hashset
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        System.out.println(set);

        //Set Contains or not
        System.out.println(set.contains(2));

        //delete in set
//        set.remove(1);

        //size of set
        System.out.println("Size of set is "+set.size());


        //Iterator in set

        Iterator it = set.iterator();
        //hasnext() -> return true or false , next() -> goes to next step

        while (it.hasNext()){
            System.out.println(it.next());
        }

        HashSet<Integer> a1 = new HashSet<>();
//        ArrayList<Integer> a1 = new ArrayList<>();
        fibboNacci(5,a1);
        Primes(13,a1);
        System.out.println(a1);

    }

    public static void fibboNacci(int n,HashSet<Integer> set1){

        set1.add(0);
        set1.add(1);
        int l=0;
        int m=1;

        for(int i=1;i<n-1;i++){
            System.out.println("H!");
            int ans = l+m;
            l=m;
            m=ans;
            set1.add(m);
        }


        System.out.println(set1);
    }

    public static boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void Primes(int n,HashSet<Integer> set1){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                set1.add(i);
            }
        }
    }
}
