//package BFS_DFS;
//
//import java.util.ArrayList;
//
//public class BaekJoon_14716_DFS {
//    static boolean[][] visited; // 필수 ) 방문 여부를 기록할 배열
//    static int banner[][];
//
//    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>(); // 필수 )
//
//    static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
//    static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
//    static int N , M;
//
//
//    public static void dfs(int node) {
//        visited[node] = true; //필수 ) 방문표시
//        System.out.print(node + " "); //  원하는 작업 수행
//
//        for (int next : graph.get(node)) {
//            if (!visited[next]) {
//                dfs(next); //재귀호출
//            }
//        }
//    }
//
//
//}
