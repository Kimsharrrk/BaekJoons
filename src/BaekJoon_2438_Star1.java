package Repeat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_2438_Star1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bf.readLine());

        for (int i = 1; num >= i ; i++){
            for (int j = 0;i > j; j++){
                System.out.print("*");

            }

            System.out.println(" ");

        }
    }
}
