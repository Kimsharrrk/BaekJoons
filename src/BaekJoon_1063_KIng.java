package NIMDA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_1063_KIng {
    public static void main(String[] args) throws IOException {

        BufferedReader Bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer St = new StringTokenizer(Bf.readLine());

        int[] x = {0, 1, 1, 1, 0, -1, -1, -1};
        int[] y = {1, 1, 0, -1, -1, -1, 0, 1};

        String KingLocation = St.nextToken();
        String StoneLocation = St.nextToken();
        int MovementCount = Integer.parseInt(St.nextToken());

        int King_X = KingLocation.charAt(0) - 'A';
        int King_Y = KingLocation.charAt(1) - '1';
        int Stone_X = StoneLocation.charAt(0) - 'A';
        int Stone_Y = StoneLocation.charAt(1) - '1';

        int count = 0;

        while (count != MovementCount) {

            String Move = Bf.readLine();
            int dx = 0;
            int dy = 0;
            if (Move.equals("R")) {
                dx = x[1];
                dy = y[0];
            } else if (Move.equals("L")) {
                dx = x[6];
                dy = y[6];
            } else if (Move.equals("B")) {
                dx = x[4];
                dy = y[4];
            } else if (Move.equals("T")) {
                dx = x[0];
                dy = y[0];
            } else if (Move.equals("RT")) {
                dx = x[1];
                dy = y[1];
            } else if (Move.equals("LT")) {
                dx = x[7];
                dy = y[7];
            } else if (Move.equals("RB")) {
                dx = x[3];
                dy = y[3];
            } else if (Move.equals("LB")) {
                dx = x[5];
                dy = y[5];
            }

            int last_KX = King_X + dx;
            int last_KY = King_Y + dy;

            if (last_KX >= 0 && last_KX < 8 && last_KY >= 0 && last_KY < 8) {
                if (last_KX == Stone_X && last_KY == Stone_Y) {
                    int last_SX = Stone_X + dx;
                    int last_SY = Stone_Y + dy;
                    if (last_SX >= 0 && last_SX < 8 && last_SY >= 0 && last_SY < 8) {
                        Stone_X = last_SX;
                        Stone_Y = last_SY;
                        King_X = last_KX;
                        King_Y = last_KY;
                    }
                } else {
                    King_X = last_KX;
                    King_Y = last_KY;
                }
            }

            count++;
        }

        System.out.println((char)(King_X + 'A') + "" + (King_Y + 1));
        System.out.println((char)(Stone_X + 'A') + "" + (Stone_Y + 1));
    }
}