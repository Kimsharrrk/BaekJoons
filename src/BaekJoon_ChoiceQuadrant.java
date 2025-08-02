package conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_ChoiceQuadrant  {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(input.readLine());
        int Y = Integer.parseInt(input.readLine());

        if (X < 0 && Y > 0){
            System.out.println("2");
        } else if (X > 0 && Y >0 ) {
            System.out.println("1");
            
        } else if (X <0 && Y < 0) {
            System.out.println("3");

        } else if (X>0 && Y <0) {
            System.out.println("4");

        }


    }
}
