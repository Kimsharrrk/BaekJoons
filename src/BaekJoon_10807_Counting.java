package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_10807_Counting {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bf.readLine()); // 입력 받을 정수의 수 # 11 입력

        int []intNum = new int[num];

        //11개 입력 받기위해 반복문 사용
        StringTokenizer st = new StringTokenizer(bf.readLine());

        for (int i =0; num > i; i++){
            intNum[i] = Integer.parseInt(st.nextToken());
        }



        int target = Integer.parseInt(bf.readLine()); // 찾을려는 수
        int count = 0;// 찾는 값이몇개인지 확인용 변수

        for (int i =0; num > i; i++){
            if (intNum[i] == target){//찾는것이 같다면 카운트 올라감
                count++;
            }
        }

        System.out.println(count);


    }
}
