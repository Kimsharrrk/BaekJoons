package Input_output_and_four_basic_operations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_18108_ButaYear {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String Y = input.readLine();
        int Year = Integer.parseInt(Y);

        if (Year >= 1000 || Year <= 3000){
            System.out.println(Year - 543 );

        }



    }
}
