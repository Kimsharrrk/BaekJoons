package Repeat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_25314_CodingIsPEClass {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(bf.readLine());

        // long int 는 4바이트
        // long long int 는 8바이트
        // 즉, int 앞에 long을 하나 씩 붙일 때 마다 4바이트 씩 늘어남

        int input = Integer.parseInt(bf.readLine());
        int Byte = 0;

        Byte = input / 4;

        for (int i = 0; Byte > i ; i++){
            System.out.print("long ");
        }
        System.out.print("int");


    }
}
