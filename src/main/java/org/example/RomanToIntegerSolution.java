package org.example;

import java.util.HashMap;
import java.util.Map;

class RomanToIntegerSolution {

    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        if(s.contains("IIII")) throw new IllegalArgumentException("Invalid roman number: IIII");
        if(s.contains("VIIII")) throw new IllegalArgumentException("Invalid roman number: VIIII");
        if(s.contains("XXXX")) throw new IllegalArgumentException("Invalid roman number: XXXX");
        if(s.contains("LXXXX")) throw new IllegalArgumentException("Invalid roman number: LXXXX");
        if(s.contains("CCCC")) throw new IllegalArgumentException("Invalid roman number: CCCC");
        if(s.contains("DCCCC")) throw new IllegalArgumentException("Invalid roman number: DCCCC");

        s = s.replace("IV", "IIII");
        s = s.replace("IX", "VIIII");
        s = s.replace("XL","XXXX");
        s = s.replace("XC", "LXXXX");
        s = s.replace("CD", "CCCC");
        s = s.replace("CM", "DCCCC");
        int number = 0;

        for(int i = 0; i < s.length(); i++){
            number = number + (map.get(s.charAt(i)));
        }
        return number;
    }

    public static void main(String[] args) {
        System.out.println(RomanToIntegerSolution.romanToInt("IV"));
    }
}
