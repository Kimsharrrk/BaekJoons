package Repeat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_25304_Receipt {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int total = Integer.parseInt(bf.readLine()); //총 금액

        int su = Integer.parseInt(bf.readLine()); //물건 수

        int nowBuy = 0;

        for (int i = 0; su > i; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());

            int item = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());

            nowBuy += cost * item;

        }
        if (nowBuy == total){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }



    }
}
