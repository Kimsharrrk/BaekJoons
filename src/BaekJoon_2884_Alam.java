package conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_2884_Alam {
    public static void main(String[] args) throws IOException {
        BufferedReader Bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer St = new StringTokenizer(Bf.readLine());

        int H = Integer.parseInt(St.nextToken());
        int M = Integer.parseInt(St.nextToken());

        M -= 45;

        if (M < 0){
            M += 60;
            H -= 1;

        }if (H < 0){
            H = 23;

        }
        System.out.print(H + " " +M);








    }
}
