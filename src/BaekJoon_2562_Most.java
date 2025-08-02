package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_2562_Most {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int count = 9;

        int []num = new int[9];
        //배열에 값 넣기

        for (int i = 0; count > i ; i++){
            num[i] = Integer.parseInt(bf.readLine());

        }

        int most = num[0];
        int find = 0;

        for (int i : num) {
          if (i > most) {
                most = i;

          }

        }
        //왜 find++ 은 안되는거지
        for (int i = 1; count >i ; i++){
            if (most == num[i]){
                find = i;
            }
        }
        find= find + 1;
        System.out.print(most + " "+find);



    }
}
