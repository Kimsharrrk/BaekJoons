//구사과가 있는 곳은 1×N 크기의 직사각형 지도로 나타낼 수 있으며, 1×1크기의 정사각형으로 나누어져 있다.
// 구사과의 위치는 (1, x)로 나타낼 수 있으며, (1, x)는 왼쪽에서부터 x번째 칸을 의미한다.
//지도의 각 칸에는 E, W중의 한 문자가 쓰여져 있는데, 구사과는 이 문자를 이용해서 이동한다. 구사과의 위치가 (1, x)인 경우에 E가 쓰여져 있는 칸에 서 있었다면,
// (1, x+1)로, W의 경우에는 (1, x-1)로 순간이동한다. 구사과는 지치지 않기 때문에, 계속해서 이동한다.
//욱제는 구사과의 위치를 모르기 때문에, 구사과가 이동을 시작하는 위치와 관계없이 선물을 주는 방법을 알아내려고 한다.
// 최소 몇 개의 칸 위에 선물을 놓으면, 구사과가 항상 선물을 가져가는지 구하는 프로그램을 작성하시오.
// 선물이 놓여진 칸에 구사과가 이동하면, 구사과는 항상 선물을 가져간다.



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_15886_내선물을받아줘2 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        //1. 골목길의 길 N

        int golmokN = Integer.parseInt(bf.readLine());



        //2. 길이가 N짜리 구사과가 있는 N

        String map =  bf.readLine();
        int count = 0;


        for (int i = 1; golmokN > i ; i++){
            //바뀌는 순간에 카운트 하묜 ㄷ힐것가틍ㅁ
            char A = map.charAt(i-1);
            char B = map.charAt(i);


            if (A == 'E' && B == 'W'){
                    count++;

            }


        }

        System.out.println(count);




    }
}
