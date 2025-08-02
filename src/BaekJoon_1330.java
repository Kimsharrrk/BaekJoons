package conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_1330 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String inputValue = input.readLine();
        String[] Value = inputValue.split(" ");

        int a = Integer.parseInt(Value[0]);
        int b = Integer.parseInt(Value[1]);

        if (a < b){
            System.out.println("<");
        } else if (a > b) {
            System.out.println(">");
        }
        else {
            System.out.println("==");
        }
    }
}
