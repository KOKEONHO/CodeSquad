package precourse.week_02.mission02.question02.practice;

import java.io.*;

public class CreateFile {

    static BufferedReader br;
    static BufferedWriter bw;
    private static String directory = "C:/Users/rhrjs/Desktop/input.txt";      // 경로

    CreateFile(BufferedReader br, BufferedWriter bw) {
        this.br = br;
        this.bw = bw;
    }

    public static void createTextFile() throws IOException {

        bw.write("이름 / 학번 / 전공과목 / 국어 / 수학 / 영어");
        bw.newLine();

        bw.flush();
        bw.close();

        String string;

        BufferedOutputStream bs = null;
        try {
            bs = new BufferedOutputStream(new FileOutputStream(directory));
            while (true) {
                string = br.readLine();
                if (string.equals("Done")) break;
                bs.write(string.getBytes());
                bs.write('\n');
            }
        } catch (Exception e) {
            e.getStackTrace();
        } finally {
            bs.close();
        }
    }
}
