package patterns;

import java.util.Scanner;

public class Starpattern1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while (i <= n) {
            int space = 1;
            while(space <= n - i){
                System.out.print(" ");
                space++;
            }
            int j = 1;
            while (j <= (i*2 - 1)) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

    }
}