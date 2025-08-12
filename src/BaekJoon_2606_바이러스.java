import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BaekJoon_2606_바이러스 {

    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean Visited[];
    static int count = 0;

    public static void dfs(int node) {
        Visited[node] = true;

        for (int next : graph.get(node)) {
            if (!Visited[next]) {
                count++;
                dfs(next); //재귀호출
            }


        }
    }

        public static void main (String[]args) throws IOException {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


            //1. 컴퓨터수 노드의수
            int computer = Integer.parseInt(bf.readLine());


            //2. 컴퓨터의 순서쌍 간선의 수

            for (int i = 0; i <= computer; i++) {
                graph.add(new ArrayList<>());
            }
            Visited = new boolean[computer + 1]; // 방문 배열 초기화


            int computerLine = Integer.parseInt(bf.readLine());

            for (int i = 0 ; computerLine > i ; i++){
                StringTokenizer st = new StringTokenizer(bf.readLine());

                 int A = Integer.parseInt(st.nextToken());
                 int B = Integer.parseInt(st.nextToken());

                graph.get(A).add(B);
                graph.get(B).add(A);

            }

            dfs(1);

            System.out.println(count);



        }


}
