package com.codingninja.ifelse;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        // Write your code here
        Scanner sn = new Scanner(System.in);
        char  ch = sn.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z'){
            System.out.println(1);
        }
        else if (ch >= 'a' && ch <= 'z'){
            System.out.println(0);
        }
        else{
            System.out.println(-1);
        }
    }
}