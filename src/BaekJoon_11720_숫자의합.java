import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_11720_숫자의합 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bf.readLine());

        int total = 0;
        String a = bf.readLine();


        for (int i = 0;num > i ; i++ ){
            int n = Integer.parseInt(String.valueOf(a.charAt(i)));
            total = total + n;
        }
        System.out.println(total);
    }
}
