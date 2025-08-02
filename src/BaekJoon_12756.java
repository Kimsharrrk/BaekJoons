package NIMDA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_12756 {
    public static void main(String[] args) throws IOException {
        //"럭키스톤"은 카드를 통해 대결하는 게임이다. 창식이는 럭키스톤을 자주 한다.
        //이 게임의 카드에는 공격력과 생명력이 표시되어있다. 왼쪽에는 공격력이, 오른쪽에는 생명력이 숫자로 적혀있다.
        //서로 꺼낸 카드를 비교하여 남길 카드를 결정하는 데, 카드의 비교는 다음과 같이 이루어진다.
        //비교하는 카드의 공격력만큼 동시에 서로 상대 카드의 생명력을 깎는다. 줄어든 생명력은 다시 회복되지 않는다.
        //생명력이 0 이하인 경우에는 카드는 죽은 상태로 전환된다.
        //카드가 두 장 모두 남아있다면 비교를 계속한다.
        //요즘 따라 게임이 안 풀리는 창식이는 대전 전에 가능한 수를 미리 계산하여 최대한 이득을 챙기고 싶어 한다.
        //카드 2개의 공격력과 생명력이 주어지면 어떤 플레이어의 카드가 남아있을지 출력하는 프로그램을 작성해주자.

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer status = new StringTokenizer(input.readLine());


        int dmgA = Integer.parseInt(status.nextToken());
        int hpA = Integer.parseInt(status.nextToken());

        status = new StringTokenizer(input.readLine());
        int dmgB = Integer.parseInt(status.nextToken());
        int hpB = Integer.parseInt(status.nextToken());


        while (true) {
            hpB = hpB - dmgA;
            hpA = hpA -dmgB;

            if (hpA <= 0 && hpB <= 0) {
                System.out.println("DRAW");
                break;
            } else if (hpA <= 0) {
                System.out.println("PLAYER B");
                break;
            } else if (hpB <= 0) {
                System.out.println("PLAYER A");
                break;
            }
        }
    }
}
