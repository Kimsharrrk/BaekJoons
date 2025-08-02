//점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100 으로 고쳤다.
//세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_1546_average {
    public static void main(String[] args) throws IOException {
        BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));

        //  점수/M*100

        //1. 과목 갯수
        int N = Integer.parseInt(bf.readLine());

        //2. 성적
        int [] grade = new int[N];

        StringTokenizer st = new StringTokenizer(bf.readLine());

        for (int i = 0; N > i ; i++){

            int m = Integer.parseInt(st.nextToken());
            grade[i] = m;

        }

        //최대값 찾기

        int Max = grade[0];

        for (int i = 1; N > i ; i++){

            if (grade[i] > Max){
                Max =grade[i];
            }
        }
//50 100 75
        double sagi = 0;
        double hap = 0;

        for (int i = 0; N > i ; i++){
            sagi = (double)grade[i]/Max*100;
            hap += sagi;


        }



        System.out.println(hap / N);



    }
}
