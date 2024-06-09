package com.Questions.HashMaps_HashSet;

import java.util.HashMap;
import java.util.Set;

public class IternaryfromTickets {
    public static void main(String[] args) {
        HashMap<String,String> Tickets = new HashMap<>();
        Tickets.put("Chennai","Bengaluru");
        Tickets.put("Mumbai","Delhi");
        Tickets.put("Goa","Chennai");
        Tickets.put("Delhi","Goa");

        iternaryofTickets(Tickets);
    }

    public static HashMap<String,String> reverseHashMap(HashMap<String,String> hmap){
        HashMap<String,String> rhMap = new HashMap<>();
        for (String key : hmap.keySet()){
            rhMap.put(hmap.get(key),key);
        }
        return rhMap;
    }
    public static void iternaryofTickets(HashMap<String,String> tickets){
        HashMap<String,String> rTickets = reverseHashMap(tickets);
        System.out.println(rTickets + " ------ ");
        System.out.println(tickets+ " ------- ");
        String from ="";

        for (String keys : tickets.keySet()) {
            if (!rTickets.containsKey(keys)) {
                from = keys;
            }
        }
        while(tickets.containsKey(from)){
            System.out.println(from + " --> " + tickets.get(from));
            from = tickets.get(from);
        }
//        System.out.println(from);




    }
}
