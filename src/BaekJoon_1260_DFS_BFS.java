package NIMDA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BaekJoon_1260_DFS_BFS {
    static boolean[] visited ;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    public static void dfs(int node){
        visited[node] = true;
        System.out.print(node + " ");

        for (int next : graph.get(node)) {
            if (!visited[next]) {
                dfs(next); //재귀호출
            }
        }

    }

    public static void bfs(int start){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int next : graph.get(node)) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.offer(next);
                }
            }
        }
    }

    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        visited = new boolean[N + 1];

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++){
            StringTokenizer st2 = new StringTokenizer(bf.readLine());
            int N1 = Integer.parseInt(st2.nextToken());
            int N2 = Integer.parseInt(st2.nextToken());
            graph.get(N1).add(N2);
            graph.get(N2).add(N1);

        }
        for (int i = 1; i <= N; i++) {
            Collections.sort(graph.get(i));
        }


        dfs(V); // 필수 ) 시작 노드
        System.out.println(" ");


        Arrays.fill(visited, false); // BFS 전에 초기화

        bfs(V);


    }


}
