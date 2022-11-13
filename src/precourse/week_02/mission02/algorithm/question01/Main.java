package precourse.week_02.mission02.algorithm.question01;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("끝말잇기 게임을 시작합니다!!");
        bw.newLine();
        bw.write("게임에 참여하는 인원은 몇 명입니까? >> ");
        bw.flush();
        int memberCnt = Integer.parseInt(br.readLine());
        List<String> memberList = new ArrayList<String>();
        for (int i = 0; i < memberCnt; i++) {
            bw.write("참가자 이름을 입력해주세요. >> ");
            bw.flush();
            memberList.add(br.readLine());
        }
        bw.write("시작 단어를 입력해주세요. >> ");
        bw.flush();
        String startWord = br.readLine();
        bw.write("시작 단어는 \""+startWord+"\"입니다.");
        bw.flush();

        while(true) {

        }

        bw.close();
    }
}
