import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

    public class BaekJoon_24479_깊이우선탐색1 {

        static boolean visited[];
        static int order[];
        static int count = 1;

        static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();


        public static void dfs(int node) {
            visited[node] = true; //필수 ) 방문표시
            order[node] = count++;

            for (int next : graph.get(node)) {
                if (!visited[next]) {
                    dfs(next); //재귀호출
                }
            }
        }

        public static void main(String[] args) throws IOException {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(bf.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());

            order = new int[N+1];
            visited = new boolean[N+1];
            graph = new ArrayList<>();

            for (int i = 0; i <= N; i++) {
                graph.add(new ArrayList<>());
            }

            for (int i = 0 ; M > i; i++){
                st = new StringTokenizer(bf.readLine());
                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());

                graph.get(A).add(B);
                graph.get(B).add(A);
            }

            for (int i = 0 ; M > i; i++){
                Collections.sort(graph.get(i));

            }


            dfs(R);

            for(int i=1; i<=N; i++) {
                System.out.println(order[i]);
            }
        }
    }
