package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_10818_LeastMost {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(bf.readLine());

        int []num = new int[count];
        //배열에 값 넣기
        StringTokenizer st = new StringTokenizer(bf.readLine());

        for (int i = 0; count > i ; i++){
            num[i] = Integer.parseInt(st.nextToken());

        }

        //탐색 : 최소값, 최대값
        int least = num[0];
        int most = num[0];


        for (int i : num) {
            if (i < least){
                least = i;
            }
            else if (i > most) {
                most = i;
            }

        }
        System.out.print(least + " " + most);



    }
}
