package mission01;

import java.io.*;

public class Star_2442 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int temp;

        for (int i = 1; i <= N; i++) {
            temp = i;
            for (int j = 1; j <= N - i; j++) {
                bw.write(" ");
            }
            for (int j = 1; j <= 2 * temp - 1; j++) {
                bw.write("*");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
