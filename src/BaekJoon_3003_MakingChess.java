package conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_3003_MakingChess {
    public static void main(String[] args) throws IOException {
        BufferedReader Bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(Bf.readLine());
//체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.
        int whiteChess[] = new int[6];


        for (int i= 0; 6 > i ; i++ ){
            int want = Integer.parseInt(st.nextToken());

            whiteChess[i] += want;

        }

        int[] ChessUnits = {1, 1, 2, 2, 2, 8};

        for (int i = 0; ChessUnits.length > i; i++){

            ChessUnits[i] -= whiteChess[i];

            System.out.print(ChessUnits[i] +" ");

        }




    }
}
