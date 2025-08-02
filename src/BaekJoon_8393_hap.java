package Repeat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_8393_hap {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bf.readLine());

        int count = 0;

        for (int i = 1 ; num >= i ; i++){

            count += i;


        }
        System.out.println(count);

    }
}
