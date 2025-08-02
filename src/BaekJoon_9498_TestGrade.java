package conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_9498_TestGrade {
    public static void main(String[] args) throws IOException {
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer St = new StringTokenizer(Br.readLine());

        int Grade = Integer.parseInt(St.nextToken());

        if (Grade >= 90 ){
            System.out.println("A");
        } else if (Grade <= 89 && Grade >= 80) {
            System.out.println("B");
            
        }else if (Grade <= 79 && Grade >= 70) {
            System.out.println("C");

        }else if (Grade <= 69 && Grade >= 60) {
            System.out.println("D");

        }else{
            System.out.println("F");
        }

    }
}
