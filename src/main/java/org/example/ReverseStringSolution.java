package org.example;


public class ReverseStringSolution {
    public static void reverseString(char[] s) {

        int right = s.length - 1 ;
        int left = 0;

        while (left < right){
            char c = s[right];
            s[right] = s[left];
            s[left] = c;

            left++;
            right--;
        }

    }

    public static void main(String[] args) {
        ReverseStringSolution.reverseString(new char[]{'H','a','n','a'});
    }
}
