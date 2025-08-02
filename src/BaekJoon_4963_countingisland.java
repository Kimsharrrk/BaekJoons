package NIMDA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BaekJoon_4963_countingisland {

    static boolean[][] visited;
    static int w, h;
    static int map[][];
    static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};




    public static void bfs(int x, int y) {
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

                if (nx >= 0 && ny >= 0 && nx < h && ny < w) {
                    if (!visited[nx][ny] && map[nx][ny] == 1) {
                        visited[nx][ny] = true;
                        queue.offer(new int[]{nx, ny});
                    }
                }
            }
        }



    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            if (w == 0 && h == 0){
                break;
            }

            map = new int[h][w]; //map 만들어주고
            visited = new boolean[h][w];

            for (int i = 0; i < h; i++) {
                 st = new StringTokenizer(bf.readLine());
                for (int j = 0; j < w; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken()); //map에 따른 땅, 바다 넣어주기
                }
            }

            int island = 0;
            for (int i = 0; i < h; i++) {           // 지도 행
                for (int j = 0; j < w; j++) {       // 지도 열
                    if (map[i][j] == 1 && !visited[i][j]) {  // 땅이고, 아직 방문 안 했으면
                        bfs(i, j);
                        island++;                    // 섬 개수 1 증가
                    }
                }

            }

            System.out.println(island);




        }





    }
}
