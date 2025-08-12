import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_34071_첫번째문제정말쉬문제일까 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        int[] levelarr = new int[N];

        for (int i = 0; N > i; i++) {
            levelarr[i] = Integer.parseInt(bf.readLine());
        }

        boolean Bigger = true;
        boolean Smaller = true;

        for (int i = 0; N > i; i++) {

            if (levelarr[i] >= levelarr[0]) {
                Smaller = false;
            }else if (levelarr[i] <= levelarr[0]){
                Bigger = false;
            }
        }


        if (Bigger) {
            System.out.println("ez");
        } else if (Smaller) {
            System.out.println("hard");
        } else {
            System.out.println("?");
        }
    }


}
