package precourse.week01.algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Problem_1008 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        br.close();

        bw.write(Double.toString(Double.parseDouble(st.nextToken()) / Double.parseDouble(st.nextToken())));
        bw.newLine();

        bw.flush();
        bw.close();
    }
}
