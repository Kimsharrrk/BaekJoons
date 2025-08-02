package Input_output_and_four_basic_operations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_2588_Mul {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String I = input.readLine();
        String J = input.readLine();

        int Isu = Integer.parseInt(I);
        int Jsu = Integer.parseInt(J);
        String[] K = J.split("");
        int[] Ksu= new int[K.length];


        for (int i = 0; i < K.length; i++){
            Ksu[i] = Integer.parseInt(K[i]);
        }


        for (int i = K.length - 1; i >= 0; i--){
            int testsu = 1;
            if (testsu != 0){
                System.out.println(Isu * (Ksu[i] * testsu));
            }
            else {
                System.out.println(Isu * Ksu[i]);

            }
        }
        System.out.println(Isu * Jsu);

    }
}
