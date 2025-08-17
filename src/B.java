import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B {

    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int[] depth;



    public static void dfs(int node, int height){
        visited[node] = true;
        depth[node] = height;

        for (int next : graph.get(node)) {
            if (!visited[next]) {
                if (node != next){
                    dfs(next, height + 1); //재귀호출

                }
            }



        }


    }


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        visited = new boolean[n + 1];
        depth = new int[n + 1];



        for (int i = 0 ; n >= i ; i++){

            graph.add(new ArrayList<>());
        }


        for (int i = 1 ; n >= i ; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());


            int x = Integer.parseInt((st.nextToken())); // 부모
            int y = Integer.parseInt((st.nextToken())); // 자식


            graph.get(x).add(y);
            graph.get(y).add(x);

        }

        dfs(1,1);

        System.out.println(depth.length-1);



    }

}
