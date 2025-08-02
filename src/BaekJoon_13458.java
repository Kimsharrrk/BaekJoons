//package NIMDA;
//
//
//import com.sun.tools.javac.Main;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.StringTokenizer;
//
//public class BaekJoon_13458 {
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(input.readLine());
//
//        int TestArea = Integer.parseInt(st.nextToken());
//
//
//
//        st = new StringTokenizer(input.readLine());
//
//
//        //
//        int[] Tester = new int[TestArea];
//        for (int i = 0; i < 3; i++) {
//            Tester[i] = Integer.parseInt(st.nextToken());
//        }
//
//
//        st = new StringTokenizer(input.readLine());
//        int MainViewr = Integer.parseInt(st.nextToken());
//        int SubViewr = Integer.parseInt(st.nextToken());
//
//
//        int count= 0;
//
//        for (int i = 0; TestArea > i; i++){
//            if (Tester[i] != 0){
//                System.out.println(Tester[i] - MainViewr) ;
//
//            }
//
//        }
//
//
//
//
//
//
//
//
//
//
//
//
//    }
//}
