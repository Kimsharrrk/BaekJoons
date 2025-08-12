//알파벳 소문자로만 이루어진 단어 S가 주어진다.
// 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를,
// 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

//첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_10809_알파뱃찾기 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        //1.단어 받기.
        String word = bf.readLine();

        //


        int alph = 97;

        int Array[] = new int[26];
        for (int i = 0 ; Array.length > i; i ++){
            Array[i] = alph;
            alph++;

        }

        char[] charArr = new char[Array.length];

        for (int i = 0; i < Array.length; i++) {
            charArr[i] = (char) Array[i];
        }

        int find[] = new int[26];

        for (int i = 0 ; find.length > i ; i++){
            find[i] = -1;
        }


        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int idx = ch - 'a'; // a=0, b=1 ...
            if (find[idx] == -1) { // 아직 기록 안된 경우만
                find[idx] = i;
            }
        }


        for (int i = 0 ; find.length > i ; i++){
            System.out.print(find[i]+ " ");
        }


    }
}
