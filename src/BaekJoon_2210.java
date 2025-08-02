//package NIMDA;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class BaekJoon_2210 {
//
//    static int n, m;
//    int [][] Board = new int[5][5];
//    static boolean[][] visited;
//    static int count = 0;
//    static int[][] pos = {{0, -1}, {0, 1}, {1, 0}, {-1, 0}};
//
//    static void dfs(int x, int y) {
//        visited[x][y] = true;
//
//    }
//
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//
//
//
//
//
//        //배열 생성
//
//        for (int i = 0; i<5 ; i++){
//            StringTokenizer st = new StringTokenizer(bf.readLine());
//
//
//            for (int j = 0; j<5; j++){
//
//                Board[i][j] = Integer.parseInt(st.nextToken());
//            }
//        }
//
//        for (int i = 0; i < Board.length; i++) {
//            for (int j = 0; j < Board[i].length; j++) {
//                System.out.print(Board[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//
//
//
//
//        //방문
//
//        for (int i = 0; i<6 ; i++){
//
//
//            for (int j = 0; j<6; j++){
//
//                dfs(i,j);
//
//            }
//        }
//
//
//
//        // 방문된거 ( 6번, 4방향 ) [저장]
//
//
//        // [저장] 안에 있는 지 중복확인
//
//
//
//
//    }
//
//}
