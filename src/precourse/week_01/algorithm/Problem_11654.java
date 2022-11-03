package precourse.week_01.algorithm;

import java.io.*;

public class Problem_11654 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String string = br.readLine();
        int ch = string.charAt(0);

        // 아스키 코드 값 구하기
        bw.write(Integer.toString(ch));
        bw.newLine();

        bw.flush();
        bw.close();
    }
}
