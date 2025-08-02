package BFS_DFS;
//혁진이는 우선 현수막에서 글자인 부분은 1, 글자가 아닌 부분은 0으로 바꾸는 필터를 적용하여 값을 만드는데 성공했다.
//그런데 혁진이는 이 값을 바탕으로 글자인 부분 1이 상, 하, 좌, 우 대각선으로 인접하여 서로 연결되어 있다면 한 개의 글자라고 생각만 하였다.


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BaekJoon_14716_BFS {


    static boolean[][] visited;
    static int M, N;
    static int banner[][];
    static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};


    public static void bfs(int x, int y){

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        visited[x][y] = true;


        while (!queue.isEmpty()){
            int now[] = queue.poll();
            int sx = now[0];
            int sy = now[1];

            for (int i = 0; i < 8; i++) {
                int nx = sx + dx[i];
                int ny = sy + dy[i];

                if (nx >= 0 && ny >= 0 && nx < M && ny < N) {
                    if (!visited[nx][ny] && banner[nx][ny] == 1) {
                        visited[nx][ny] = true;
                        queue.offer(new int[]{nx, ny});
                    }
                }
            }
        }



    }

    public static void main(String[] args) throws IOException{
        // 현수막 크기 받고

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());


        banner = new int[M][N];
        visited = new boolean[M][N];


        // M , N 만큼 반복

        //글씨 그려주고
        for (int i = 0 ; M > i ; i++){
            st = new StringTokenizer(bf.readLine());
            for (int j = 0; N > j; j++){
                banner [i][j] = Integer.parseInt(st.nextToken());
            }


        }

        int word = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (banner[i][j] == 1 && !visited[i][j]) {
                    bfs(i, j);
                    word++;
                }
            }

        }

        System.out.println(word);
    }


}
