package com.Questions.Q;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class IBM1 {

    // Calculating number of chunks required
    static int pow2(long N) {
        int ans = 0;
        for (int i = 0; i < 64; i++) {
            long x = 1;
            if ((N & (x << i)) > 0) ans++;
        }
        return ans;
    }

    public static int calculateChunks(long total, ArrayList<ArrayList<Long>> list) {
        // Sorting the uploaded chunks
        Collections.sort(list, new Comparator<ArrayList<Long>>() {
            public int compare(ArrayList<Long> l1, ArrayList<Long> l2) {
                return Long.compare(l1.get(0), l2.get(0));
            }
        });

        long lastChunkNum = 1;
        int ans = 0;

        // Calculating length of un-uploaded items
        for (int i = 0; i < list.size(); i++) {
            long start = list.get(i).get(0);
            long end = list.get(i).get(1);
            ans += pow2(start - lastChunkNum);
            lastChunkNum = end + 1;
        }

        if (list.get(list.size() - 1).get(1) != total) {
            ans += pow2(total - list.get(list.size() - 1).get(1));
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read total size, number of chunks
        System.out.println("Enter total packages");
        long total = sc.nextLong();
        System.out.println("Enter number of rows uploaded");
        int n = sc.nextInt();

        // Taking uploaded chunk input
        ArrayList<ArrayList<Long>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter start ");
            long start = sc.nextLong();
            System.out.println("Enter End ");
            long end = sc.nextLong();
            ArrayList<Long> small = new ArrayList<>();
            small.add(start);
            small.add(end);
            list.add(small);
        }
        sc.close();

        // Calculate and print the result
        int result = calculateChunks(total, list);
        System.out.println(result);
}
}