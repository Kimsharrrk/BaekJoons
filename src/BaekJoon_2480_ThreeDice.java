package conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_2480_ThreeDice {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer St = new StringTokenizer(bf.readLine());

        int Dice1 = Integer.parseInt(St.nextToken());
        int Dice2 = Integer.parseInt(St.nextToken());
        int Dice3 = Integer.parseInt(St.nextToken());
        //3개 다 맞는경우
        if (Dice1 == Dice2 && Dice1 == Dice3) {
            System.out.println(10000 + Dice1 * 1000);
            
        } else if (Dice1 == Dice3) {
            System.out.println(1000 + Dice1 * 100);
            
        } else if (Dice2 == Dice3) {
            System.out.println(1000 + Dice2 * 100);
            
        } else if (Dice1 == Dice2){
            System.out.println(1000 + Dice1 * 100);


        }else {
            //dice1이 더크다면
            if (Dice1 > Dice2){
                //dice 1이 제일 큰 경우
                if (Dice1 > Dice3){
                    System.out.println(Dice1 * 100);
                    //dice3가 제일 큰 경우
                } else if (Dice3 > Dice2) {
                    System.out.println(Dice3 * 100);
                }
            } else if (Dice2 > Dice3) {
                System.out.println(Dice2 * 100);

            }
            else if (Dice3 > Dice2){
                System.out.println(Dice3 * 100);

            }
        }


    }
}
