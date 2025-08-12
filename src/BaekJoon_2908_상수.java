import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_2908_상수 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        String A = st.nextToken();
        String B = st.nextToken();
        int ReverseA = 0;
        int ReverseB = 0;
        int su = 1;

        for (int i = 0; i < A.length(); i++) {
            int digit = A.charAt(i) - '0';
            ReverseA += digit * su;
            su *= 10;
        }

        su = 1;
        for (int i = 0; i < B.length(); i++) {
            int digit = B.charAt(i) - '0';
            ReverseB += digit * su;
            su *= 10;
        }

        if (ReverseA > ReverseB){
            System.out.println(ReverseA);
        }else {
            System.out.println(ReverseB);
        }


    }


}
