import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_22858_원상복구 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] D = new int[N+1];
        int[] S = new int[N+1];
        int[] P = new int[N+1];



        st = new StringTokenizer(bf.readLine());
        StringTokenizer st2 = new StringTokenizer(bf.readLine());

        for (int i = 1; i <= N; i++) {
            S[i] = Integer.parseInt(st.nextToken()) ;
            D[i] = Integer.parseInt(st2.nextToken()) ;

        }


        for (int i = 0; i < K; i++) {
            for (int j = 1; j <= N; j++) {
                P[D[j]] = S[j];
            }
            S = P.clone();
        }

       for (int i = 1; i <=N; i++){
           System.out.print(P[i]+ " ");
       }
    }
}