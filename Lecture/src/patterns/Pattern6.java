package patterns;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        int val = 1;
        while (i <= n) {
            val = i;
            int spaces = 1;
            while (spaces <= n - i) {
                System.out.print(" ");
                spaces++;
            }
            int j = 1;
            while (j <= i){
                System.out.print(val);
                j++;
                val++;
            }

            System.out.println();
            i++;
        }

    }
}