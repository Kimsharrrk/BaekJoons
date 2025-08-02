package Repeat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_2439_Start2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bf.readLine());
        int j = num-1;
        for (int i = 1; num >= i ; i++){

            System.out.print(" ".repeat(j));
            System.out.println("*".repeat(i));

            j--;




        }
    }
}
