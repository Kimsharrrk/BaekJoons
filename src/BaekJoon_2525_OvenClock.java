package conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_2525_OvenClock {
    public static void main(String[] args) throws IOException {
        BufferedReader Bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer St = new StringTokenizer(Bf.readLine());

        int H = Integer.parseInt(St.nextToken());
        int M = Integer.parseInt(St.nextToken());

        int CookTime = Integer.parseInt(Bf.readLine());

        // 전체 시간을 분으로 계산
        int totalMinutes = H * 60 + M + CookTime;

        // 시와 분으로 다시 변환
        H = (totalMinutes / 60) % 24; // 24시간 시계 반영
        M = totalMinutes % 60;

        System.out.println(H + " " + M);
    }
}