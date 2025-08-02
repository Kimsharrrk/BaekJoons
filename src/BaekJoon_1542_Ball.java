package NIMDA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_1542_Ball {
    public static void main(String[] args) throws IOException {
        BufferedReader Bf = new BufferedReader(new InputStreamReader(System.in));

        int []Cup = {0,1,2,3};


        int ChangeBall = Integer.parseInt(Bf.readLine());


        int Ball = Cup[1];

        int count = 0;

        while (ChangeBall != count){

            StringTokenizer St = new StringTokenizer(Bf.readLine());


            int X = Integer.parseInt(St.nextToken());
            int Y = Integer.parseInt(St.nextToken());

            if (Ball == X) {
                Ball = Y;
            } else if (Ball == Y) {
                Ball = X;
            }



            count++;


        }

        System.out.println(Ball);



    }
}
