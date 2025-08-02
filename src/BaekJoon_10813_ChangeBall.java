package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_10813_ChangeBall {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken()); // 바구니 수
        int M = Integer.parseInt(st.nextToken()); //공 바꿀 횟수

        int[] Bukit = new int[N];

        for (int i =0; N>i ; i++){
            Bukit[i] = i+1;
        }


        for (int i = 0; M > i ; i++){
             st = new StringTokenizer(bf.readLine());
            int A = Integer.parseInt(st.nextToken()); // A 를
            int B = Integer.parseInt(st.nextToken()); // B 와 교체

            A -= 1;
            B -= 1;

            int wait = Bukit[A];
            Bukit[A] = Bukit[B];
            Bukit[B] = wait;



        }
        for (int i =0; N>i ; i++){
            System.out.print(Bukit[i] + " " );
        }



    }
}
