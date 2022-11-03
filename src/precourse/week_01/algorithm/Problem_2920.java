package precourse.week_01.algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Problem_2920 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int[] array = new int[8];

        String string = br.readLine();
        br.close();
        st = new StringTokenizer(string);

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }   // 배열에 대입 완료

        String result = checkWhether(array);

        bw.write(result);
        bw.newLine();

        bw.flush();
        bw.close();
    }

    public static String checkWhether(int[] array) {

        boolean flag = true;    // true면 ascending, false면 descending

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] - array[i + 1] == -1) {
                flag = true;
                continue;
            }
            if (array[i]-array[i+1]==1) {
                flag = false;
                continue;
            }
            return "mixed"; // continue를 통해 반복문이 계속되지 않으면 바로 mixed를 return
        }

        if(flag) {
            return "ascending";
        }
        return "descending";
    }
}
