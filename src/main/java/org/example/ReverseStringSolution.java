package org.example;


public class ReverseStringSolution {
    public static char[] reverseString(char[] s) {
        char[] reverse = new char[s.length];

        int i = s.length - 1 ;
        int j = 0;

        while (j < s.length){
            reverse[j]=s[i];
            j++;
            i--;
        }
        return reverse;

    }

    public static void main(String[] args) {
        System.out.println(ReverseStringSolution.reverseString(new char[]{'H','a','n','a'}));
    }
}
