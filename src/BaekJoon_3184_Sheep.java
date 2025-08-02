
package NIMDA;

//마당은 행과 열로 이루어진 직사각형 모양이다. 글자 '.' (점)은 빈 필드를 의미하며, 글자 '#'는 울타리를, 'o'는 양, 'v'는 늑대를 의미한다.
//한 칸에서 수평, 수직만으로 이동하며 울타리를 지나지 않고 다른 칸으로 이동할 수 있다면,
// 두 칸은 같은 영역 안에 속해 있다고 한다. 마당에서 "탈출"할 수 있는 칸은 어떤 영역에도 속하지 않는다고 간주한다.

//양의 수가 늑대의 수보다 많다면 이기고, 늑대를 우리에서 쫓아낸다. 그렇지 않다면 늑대가 그 지역 안의 모든 양을 먹는다.
//맨 처음 모든 양과 늑대는 마당 안 영역에 존재한다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BaekJoon_3184_Sheep {


    static boolean[][] vistied;
    static String falm[][];
    static int R,C;


    static int []dx = {0,1,0,-1};
    static int []dy = {1,0,-1,0};


    static int totalSheep = 0;
    static int totalWolf = 0;

    public static void bfs(int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        vistied[x][y] = true;

        int sheep = 0;
        int wolf = 0;


        if (falm[x][y].equals("o")){
            sheep++;
        }
        if (falm[x][y].equals("v")){
            wolf++;
        }

        while (!queue.isEmpty()){

            int[] cur = queue.poll();
            int cx = cur[0];
            int cy = cur[1];

            for (int i = 0 ; 4 > i ; i++){
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx >= 0 && ny >= 0 && nx < R && ny < C) {
                    if (!vistied[nx][ny] && !falm[nx][ny].equals("#")) {
                        vistied[nx][ny] = true;
                        queue.offer(new int[]{nx, ny});
                        if (falm[nx][ny].equals("o")){
                            sheep++;
                        }
                        if (falm[nx][ny].equals("v")) {
                            wolf++;
                        }
                    }
                }
            }



            }


        if (sheep > wolf){
            totalSheep += sheep;
        }else {
            totalWolf += wolf;
        }

        }



    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        // R , C  울타리 값 받야ㅇ하고

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());


        //R , C번 반복하면서 울타리 , 늑대, 양 그려줘야함

        falm = new String[R][C]; //falm 만들어주고
        vistied = new boolean[R][C];

        for (int i = 0; i < R; i++) {
            String line = bf.readLine();
            for (int j = 0; j < C; j++) {
                falm[i][j] = String.valueOf(line.charAt(j)); // 내용 채워주기
            }
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (!vistied[i][j] && !falm[i][j].equals("#")) { //방문하지 않았고 울타리에 안만났으면 탐색
                    bfs(i, j);
                }
            }
        }

        System.out.println(totalSheep + " " + totalWolf);



    }
}
