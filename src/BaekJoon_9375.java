package Data_Structure.Map_Set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BaekJoon_9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        int TestCase = Integer.parseInt(bf.readLine());

        for(int j = 0; TestCase > j; j++){
            Map<String, Integer> map = new HashMap<>();



            int cloth = Integer.parseInt(bf.readLine());

            for (int i = 0; cloth > i ; i++){
                StringTokenizer st = new StringTokenizer(bf.readLine());
                String name = st.nextToken();
                String type = st.nextToken();
                map.put(type,map.getOrDefault(type,0)+1);
            }

            int result = 1;
            for (int value : map.values()) {
                result *= (value+1);

            }
            System.out.println(result - 1);



        }


    }
}
