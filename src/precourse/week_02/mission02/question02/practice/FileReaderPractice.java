package precourse.week_02.mission02.question02.practice;

import java.io.*;
import java.util.StringTokenizer;

public class FileReaderPractice {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\rhrjs\\Desktop\\score.txt"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String string;
        String name = null, number, major;
        int sbjCnt, kor, math, eng, tot, avg;
        int cycleCnt;


        while ((string = br.readLine()) != null) {
            st = new StringTokenizer(string);
            sbjCnt = st.countTokens();      // 수강한 과목 수 카운트
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
    }
}
