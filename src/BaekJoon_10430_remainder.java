package Input_output_and_four_basic_operations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_10430_remainder {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String I = input.readLine();
        String[] J = I.split(" ");

        int A = Integer.parseInt(J[0]);
        int B = Integer.parseInt(J[1]);
        int C = Integer.parseInt(J[2]);

        int Sum = (A + B) % C;
        System.out.println(Sum);

        Sum = ((A % C) + (B % C))%C;
        System.out.println(Sum);

        Sum = (A * B) % C;
        System.out.println(Sum);

        Sum = ((A % C) * (B % C))%C;
        System.out.println(Sum);





    }
}
