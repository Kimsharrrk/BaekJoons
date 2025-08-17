//첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
//
//둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고,
// 이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_4344_평균은넘겠지 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int TestCase = Integer.parseInt(bf.readLine());


        for (int i = 0; TestCase > i ; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());

            int num = Integer.parseInt(st.nextToken());
            int array[] = new int[num];
            int sum = 0;

            for (int j = 0; array.length> j ; j++){
                array[j] = Integer.parseInt(st.nextToken());
                sum += array[j];
            }


            double average = (double) sum / num;

            int count = 0;
            for (int j = 0; num > j ; j++) {
                if (array[j] > average) {
                    count++;
                }
            }

            double result = (double) count / num * 100;
            System.out.printf("%.3f%%\n", result);  //



        }
    }
}
