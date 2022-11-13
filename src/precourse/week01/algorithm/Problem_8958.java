package precourse.week01.algorithm;

import java.io.*;

public class Problem_8958 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());    // 테스트 케이스 갯수 입력
        String string;
        int score;

        for (int i = 0; i < N; i++) {
            string = br.readLine();
            score = getScore(string);
            bw.write(Integer.toString(score));
            bw.newLine();
        }

        br.close();

        bw.flush();
        bw.close();
    }

    public static int getScore(String string) {

        int score = 0;
        int temp = 0;

        for(int i=0; i<string.length(); i++) {
            if(string.charAt(i)== 'O') { // 맞은 경우
                temp++;
                score+=temp;
                continue;
            }
            temp = 0;
        }

        return score;
    }
}
