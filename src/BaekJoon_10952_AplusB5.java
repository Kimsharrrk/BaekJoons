package Repeat;

import java.io.*;
import java.util.StringTokenizer;

public class BaekJoon_10952_AplusB5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if (A == 0 && B == 0) {
                break;
            }

            bw.write((A + B) + "\n");
        }

        bw.flush();
        bw.close();
    }
}