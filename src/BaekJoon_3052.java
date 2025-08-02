package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int[] num = new int[10];

        for (int i = 0; i < 10; i++) {
            num[i] = Integer.parseInt(bf.readLine()) % 42;
        }

        Arrays.sort(num);

        int count = 1; // 처음 수는 무조건 1번 등장
        for (int i = 0; i < 9; i++) {
            if (num[i] != num[i + 1]) {
                count++;
            }
        }

        System.out.println(count);
    }
}
