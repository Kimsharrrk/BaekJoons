import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[5];
        StringTokenizer st = new StringTokenizer(bf.readLine());

        for (int i = 0; i < 5; i++) {
            array[i] = Integer.parseInt(st.nextToken());


        }

        int count1 = 0;
        for (int i = 0; i < 5; i++) {
            if (array[i] == array[0]) {
                count1++;
            }

        }

        int count2 = 0;
        for (int i = 0; i < 5; i++) {
            if (array[i] == array[3] && array[i] != array[0]) {
                count2++;

            }
        }

        if ((count1 == 3 && count2 == 2) || (count1 == 2 && count2 == 3)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}