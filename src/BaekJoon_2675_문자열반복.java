//문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오.
// 즉, 첫 번째 문자를 R번 반복하고,
// 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.
//QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.

//첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8),
// 문자열 S가 공백으로 구분되어 주어진다. S의 길이는 적어도 1이며, 20글자를 넘지 않는다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_2675_문자열반복 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        //1.테스트 케이스를 주어지고 테스트 케이스 만큼 반복

        int testcase = Integer.parseInt(bf.readLine());


        //2. 반복안에서 문자열 , 반복횟수를 입력.

        for (int i = 0 ; testcase > i ; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();


            for (int j = 0; S.length()>j; j++){
                for (int y = 0; R>y ; y++){
                    System.out.print(S.charAt(j));


                }
            }
            System.out.println("");

        }

//        //S 길이만큼 배열 선언 후 배열에 넣고 R * S 로 반복.
//        String sray[] = new String[S.length()];


    }
}
