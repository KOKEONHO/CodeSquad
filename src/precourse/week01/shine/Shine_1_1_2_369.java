package precourse.week01.shine;

import java.io.*;

public class Shine_1_1_2_369 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String string, result;

        while (true) {
            bw.write("1~99 사이의 정수를 입력하시오>> ");
            bw.flush();
            string = br.readLine();

            if (string.equals("Quit")) break;    // Quit 입력 시 반복 종료

            result = check369(string);  // checkTsn 메서드로 매개변수 전달

            bw.write(result);
            bw.newLine();
            bw.flush();
        }

        br.close();
        bw.write("게임이 종료됩니다.");
        bw.flush();

        bw.close();
    }

    public static String check369(String string) {

        int temp, cnt = 0;
        String result = "";

        for(int i=0; i<string.length(); i++) {
            temp = Character.getNumericValue(string.charAt(i));
            if(temp==3||temp==6||temp==9) {  // 3 or 6 or 9가 포함되어 있다면
                cnt++;
            }
        }

        switch(cnt) {
            case 0:
                result="박수홍";
                break;
            case 1:
                result = "박수짝";
                break;
            case 2:
                result = "박수짝짝";
                break;
        }

        return result;
    }
}
