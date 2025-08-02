package Repeat;

import java.io.*;
import java.util.StringTokenizer;

public class BaekJoon_11022_ApusB8 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int repeat = Integer.parseInt(bf.readLine());

        for (int i=0; repeat>i ; i++){
            StringTokenizer st =new StringTokenizer(bf.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int num = i+1;
            int sum = A + B;

            bw.write("Case #"+ num +": "+A+ " + "+B+" = "+sum + "\n");  // 문자열로 변환해서 출력


        }
        bw.flush();//한번에 모아서 출력
        bw.close();
    }
}
