//도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 순서대로 적혀져 있다
//M번 바구니의 순서를 역순으로 만들려고 한다.
// 도현이는 한 번 순서를 역순으로 바꿀 때, 순서를 역순으로 만들 범위를 정하고, 그 범위에 들어있는 바구니의 순서를 역순으로 만든다.
package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class BaekJoon_10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());


        //1. N개의 바구니 입력, M번 반복할지 입력
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int [] vaguni = new int[N];

        for (int v = 0 ; N > v ; v++){
            vaguni[v] = v+1;
        }


        //2~. N개의 바구니를 M번순서를 바꾸는 입력. i 부터 j 번째 순서를 역순으로 바꾼다.
        for (int v = 0; M > v ; v++){
            st = new StringTokenizer(bf.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            int left = i-1;
            int right = j-1;


            //서로 교차 될려는 순간 종료
            while (right > left){

                int temp = vaguni[left];
                vaguni[left] = vaguni[right];
                vaguni[right] = temp;

                right--;
                left++;




            }


        }
        for (int v = 0 ; N > v ; v++){
            System.out.print(vaguni[v] + " ");
        }

        ;





    }
}

//이렇게 하면 범위가 2이하일때만 작동. 범위가 3이상이면 바뀌지 않음.
//            for (; j > i; i++ ){
//                int temp = vaguni[i-1]; // 0을 temp에 넣고
//                vaguni[i-1] = vaguni[i]; // 0번을 1번이랑 바꿈
//                vaguni[i] = temp;// 1번은 0이 된다.
//            }

