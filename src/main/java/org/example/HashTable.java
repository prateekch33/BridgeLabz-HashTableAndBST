package org.example;

import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {
        Hashtable<String,Integer> hashtable=new Hashtable<>();
        String sentence="Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        String[] words=sentence.split(" ");
        for(String i:words) {
            if(hashtable.containsKey(i)){
                hashtable.replace(i,hashtable.get(i)+1);
            } else {
                hashtable.put(i, 1);
            }
        }
        for(String i:hashtable.keySet()){
            System.out.println(i+" "+hashtable.get(i));
        }
        hashtable.remove("avoidable");
        for(String i:hashtable.keySet()){
            System.out.println(i+" "+hashtable.get(i));
        }
    }
}
