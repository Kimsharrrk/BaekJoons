package Input_output_and_four_basic_operations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_1008_A_Div_B {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String W = input.readLine();
        String[] Token = W.split(" ");

        double A = Double.parseDouble(Token[0]);
        double B = Double.parseDouble(Token[1]);
        double Answer = A / B ;

        System.out.printf("%.9f", Answer);

    }
}
