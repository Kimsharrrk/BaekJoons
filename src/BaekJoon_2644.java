//기본적으로 부모와 자식 사이를 1촌으로 정의하고 이로부터 사람들 간의 촌수를 계산한다.
// 예를 들면 나와 아버지, 아버지와 할아버지는 각각 1촌으로
// 나와 할아버지는 2촌이 되고,
// 아버지 형제들과 할아버지는 1촌,
// 나와 아버지 형제들과는 3촌이 된다.

//여러 사람들에 대한 부모 자식들 간의 관계가 주어졌을 때, 주어진 두 사람의 촌수를 계산하는 프로그램을 작성하시오.
package BFS_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BaekJoon_2644 {

    static int Start, End; //첫, 끝 노드
    static int[] depth;


    static boolean[] visited; // 필수 ) 방문 여부를 기록할 배열
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>(); // 필수 )

    public static void dfs(int node, int height) {
        visited[node] = true; //필수 ) 방문표시
        depth[node] = height;



        for (int next : graph.get(node)) {
            if (!visited[next]) {
                if (node != End){
                    dfs(next, height + 1); //재귀호출

                }
            }



        }


    }


    public static void main(String[] args)throws IOException {

        //1. 전체사람의 수 입력 (노드의 수)
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());



        visited = new boolean[n + 1];  // 필수 ) 방문 여부를 기록할 배열
        depth = new int[n + 1];

        // 그래프 초기화
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }





        //2. 서로 다른 사람의 번호가 주어진다.

        StringTokenizer st = new StringTokenizer(bf.readLine());

         Start = Integer.parseInt((st.nextToken())); // 시작 노드
         End = Integer.parseInt((st.nextToken())); // 끝 노드

        //3. 부모 자식간의 관계의 개 m (간선의 수)
        int m = Integer.parseInt(bf.readLine());


        //4~. 두 번호 x,y가 각 줄에 나온다. 이때 번호 x는 뒤에 나오는 정수 y의 부모 번호를 나타낸다.

        for (int i = 0 ; m > i ; i++){
             st = new StringTokenizer(bf.readLine());
             int x = Integer.parseInt((st.nextToken())); // 부모
             int y = Integer.parseInt((st.nextToken())); // 자식


            //방향성 없으니 양방향 연결.
            graph.get(x).add(y);
            graph.get(y).add(x);



        }
        dfs(Start, 1); // 필수 ) 시작 노드
        System.out.println(depth[End] - 1);



    }
}
