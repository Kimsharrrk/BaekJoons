import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_34071_첫번째문제정말쉬문제일까 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(bf.readLine());

        int []levelarr = new int[N];

        for (int i = 0 ; N > i ; i++){
            int level = Integer.parseInt(bf.readLine());
            levelarr[i] = level;

        }

        for (int i = 1 ; N >= i ; i ++){
            if (levelarr[i-1] > levelarr[i]){

                System.out.println("ez");
            }

        }

    }
}
