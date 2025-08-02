package Repeat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BaekJoon_2739_gugudan {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());

        for (int i = 1; 9 >= i ; i++){
            System.out.println(num + " * " + i +" = "+ num * i );
        }
    }
}
