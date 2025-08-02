package conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_2753_leapYear {
    public static void main(String[] args) throws IOException {

        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer St = new StringTokenizer(Br.readLine());

        int Years = Integer.parseInt(St.nextToken());

        if (Years % 4 == 0 && Years % 100 != 0 || Years % 400 == 0){
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }

    }
}
