package precourse.week02.mission02.question02.practice;

import java.io.*;

public class FileWriterPractice {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\rhrjs\\Desktop\\score.txt", true));
        BufferedWriter console = new BufferedWriter(new OutputStreamWriter(System.out));

        String string;

        console.write("----- score.txt에 입력할 내용을 적으십시오. -----");
        console.newLine();
        console.write("이름 / 학번 / 전공과목 / 국어 / 수학 / 영어 순서로 적으십시오.");
        console.newLine();
        console.write("입력을 종료하시려면 Exit 입력!!!");
        console.newLine();
        console.flush();

        while (true) {
            console.write(">>> ");
            console.flush();
            string = br.readLine();
            if (string.equals("Exit")) break;
            bw.write(string + "\n");
        }

        br.close();     // 버퍼리더 종료
        bw.flush();     // 파일에 입력
        bw.close();     // 파일 버퍼라이터 종료
        console.close();        // 콘솔 버퍼라이터 종료
    }
}
