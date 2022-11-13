package precourse.week_02.mission02.question02.real;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//        String command;

//        bw.write("--- 학생 성적 편집기 ---");
//        bw.newLine();
//        bw.flush();

//        bw.write("파일 새로 생성: new 입력");
//        bw.newLine();
//        bw.write("학생 추가: add 입력");
//        bw.newLine();
//        bw.write("정보 보기: view 입력");
//        bw.newLine();

        File file = new File();

        file.createFile();

        file.viewFile();
        
        bw.close();
    }
}
