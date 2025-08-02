package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_10871_X {
    public static void main(String[] args)throws IOException {

        BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        //수열과 정수 입력받기
        int sequence = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());

        //수열 수만큼 배열에넣기 위핸 배열
        int []seqArray = new int[sequence];

        //수열 수만큼 배열에 입력 넣기
        StringTokenizer st2 = new StringTokenizer(bf.readLine());
        for (int i = 0; sequence > i ; i++){
            seqArray[i] = Integer.parseInt(st2.nextToken());
        }

        for (int i : seqArray) {

            if (i < num){
                System.out.print(i + " ");
            }

        }

    }
}
