package mission01;

import java.io.*;

public class Star_2441 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int space = 0;

        for (int i = N; i > 0; i--) {
            for (int j = 0; j < space; j++) {
                bw.write(" ");
            }
            for(int j=0; j<N-space; j++) {
                bw.write("*");
            }
            bw.newLine();
            space++;
        }

        bw.flush();
        bw.close();
    }
}
