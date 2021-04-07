package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	    char[] c = new char[]{'c','c', 'a','t','a','d','b','t'};
        System.out.println(compress(c));
    }
    public static String compress(char[] chars) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : chars){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        ArrayList<String> s = new ArrayList<>();
        for (char key: map.keySet()){
            s.add(Character.toString(key));
            s.add(String.valueOf(map.get(key)));
        }
        return s.toString();
    }
}
