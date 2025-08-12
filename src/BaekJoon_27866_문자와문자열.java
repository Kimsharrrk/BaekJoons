import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_27866_문자와문자열 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String word = bf.readLine();
        int num = Integer.parseInt(bf.readLine());

        System.out.println(word.charAt(num-1)); //0부터 index

    }
}
