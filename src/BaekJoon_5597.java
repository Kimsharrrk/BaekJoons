package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon_5597 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        boolean[] submitted = new boolean[31]; //0~ 30까지 false

        for (int i = 0; i < 28; i++) {
            int num = Integer.parseInt(bf.readLine());
            submitted[num] = true; // 제출한 학생 체크 , 만약 2, 28이 입력값에 없으면 2, 28만 flase
        }
        for (int i = 1; i <= 30; i++) {
            if (!submitted[i]) {  //false라면 출력
                System.out.println(i); // 제출하지 않은 사람 출력
            }
        }


    }
}
