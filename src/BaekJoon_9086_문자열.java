import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_9086_문자열 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bf.readLine());

        for (int i = 0 ; num > i ; i++){
            String str = bf.readLine();

            char start = str.charAt(0);
            char last = str.charAt(str.length() -1);

            System.out.println("" +start + last );




        }
    }
}
