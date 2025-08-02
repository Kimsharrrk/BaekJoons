package Input_output_and_four_basic_operations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_10998_A_Mul_B {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String W = input.readLine();
        String[] Token = W.split(" ");

        int A = Integer.parseInt(Token[0]);
        int B = Integer.parseInt(Token[1]);

        System.out.println(A * B);

    }
}
