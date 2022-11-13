package precourse.week02.mission02.question02.real;

import java.io.*;
import java.util.StringTokenizer;

public class File {

    String fileName = null;

    public void createFile() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter console = new BufferedWriter(new OutputStreamWriter(System.out));        // 콘솔 창에 출력하는 버퍼라이터

        console.write("파일 생성 시작");
        console.newLine();
        console.write("파일 이름 입력: ");
        console.flush();

        fileName = br.readLine();

        BufferedWriter fw = new BufferedWriter(new FileWriter("C:\\Users\\User\\IdeaProjects\\CodeSquad\\"+fileName, true));

        String string;

        console.write("----- "+fileName+"에 입력할 내용을 적으십시오. -----");
        console.newLine();
        console.write("이름 / 학번 / 전공과목 / 국어 / 수학 / 영어 순서로 적으십시오.");
        console.newLine();
        console.write("입력을 종료하시려면 Exit 입력!!!");
        console.newLine();
        console.flush();

        while(true) {
            console.write(">>> ");
            console.flush();
            string = br.readLine();
            if(string.equals("Exit")) break;
            fw.write(string);   // 입력 받은 string을 파일에 write
            fw.newLine();       // 개행
        }
        
        br.close();     // 버퍼리더 종료
        fw.flush();     // 파일에 flush
        fw.close();     // 파일 버퍼라이터 flush 후 종료
        console.close();        // 콘솔 버퍼라이터 종료

        return;
    }

    public void viewFile() throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        if(fileName==null) {        // 파일을 생성하기 전에 이 메서드를 호출할 경우
            bw.write("파일을 먼저 생성하세요!!!");
            bw.newLine();
            bw.flush();
            bw.close();
            return;
        }

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\rhrjs\\Desktop\\"+fileName));

        StringTokenizer st;

        String string;
        String name = null, number = null, major = null;
        int sbjCnt, kor, math, eng, tot, avg;
        int cycleCnt;


        while ((string = br.readLine()) != null) {
            st = new StringTokenizer(string);
            cycleCnt = 0;
            sbjCnt = 0;
            tot = 0;
            while (st.hasMoreTokens()) {
                switch (cycleCnt) {
                    case 0:
                        name = st.nextToken();
                        cycleCnt++;
                        break;
                    case 1:
                        number = st.nextToken();
                        cycleCnt++;
                        break;
                    case 2:
                        major = st.nextToken();
                        cycleCnt++;
                        break;
                    case 3:
                        kor = Integer.parseInt(st.nextToken());
                        tot += kor;
                        cycleCnt++;
                        sbjCnt++;
                        break;
                    case 4:
                        math = Integer.parseInt(st.nextToken());
                        tot += math;
                        cycleCnt++;
                        sbjCnt++;
                        break;
                    case 5:
                        eng = Integer.parseInt(st.nextToken());
                        tot += eng;
                        cycleCnt++;
                        sbjCnt++;
                        break;
                }
            }
            avg = tot / sbjCnt;
            bw.write(name + " 학생은 " + sbjCnt + "과목을 수강했습니다.");
            bw.newLine();
            bw.write("총점은 " + tot + "점이고 평균은 "+avg+"점입니다.");
            bw.newLine();
            bw.write("--------------------------------");
            bw.newLine();
        }

        bw.flush();

        br.close();
        bw.close();

        return;
    }
}
