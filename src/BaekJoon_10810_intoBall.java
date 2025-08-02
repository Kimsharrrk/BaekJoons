package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_10810_intoBall {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        //문제는 어렵지 않다. n개의 바구니들을 만들고 , m번 넣는다.
        // 그 후  i번 에서부터 j번 까지의 바구니에 , k숫자를 넣는다.
        // 예를 들어 i = 1 , j = 4 이면 1번부터 4까지 k를 넣는다.
        // 그 후 1번부터 n번까지의 바구니에 들어있는 공의 숫자를 출력한다.

        int n = Integer.parseInt(st.nextToken()); // n 개의 바구니를 만들고 아래에 n사이즈의 배열을 만든다.
        int m = Integer.parseInt(st.nextToken()); // m번 반복

        int[] balls = new int[n];

        //m번 반복
        for (int y = 0; m > y; y++){
             st = new StringTokenizer(bf.readLine());
            int i = Integer.parseInt(st.nextToken()); // i 번부터
            int j = Integer.parseInt(st.nextToken()); // j 까지
            int k = Integer.parseInt(st.nextToken());

            /* i 부터 j 까지 k 를 넣기위해 한번더 반복.
            여기서 궁금증 for( i ; j>= i ; i++) 로 초기에는 했는데 오류가 나서 i = i  같은 이상한 모양이 되어 버렸다.. 그게 왜 굳이저렇게 써야하는지
            궁금하다.
            */
            for (i = i; j>= i ;i++){


                balls[i-1] =+ k;

            }


        }

        for (int h = 0; n > h ; h++){
            System.out.print(balls[h] + " ");
        }




    }
}
