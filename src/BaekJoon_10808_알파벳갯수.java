import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_10808_알파벳갯수 {

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
            find[i] = 0;
        }




//        2. 단어 길이 만큼 반복

        for (int i = 0; word.length() > i; i++){
            //3. if ( 단어와 알파벳 이 있다면 )
            //3-1 if (

            for (int j = 0; charArr.length > j ; j++){

                if (word.charAt(i) == charArr[j] ){
                    find[j] += 1;
                    break;
                }


            }


        }

        for (int i = 0 ; find.length > i ; i++){
            System.out.print(find[i]+ " ");
        }





    }

}
