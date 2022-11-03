package precourse.week01.shine;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Shine_1_1_1_midNum {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        ArrayList<Integer> arrayList = new ArrayList<>();   // ArrayList 생성

        bw.write("정수 3개 입력>> ");
        bw.flush();

        st = new StringTokenizer(br.readLine());    // 정수 3개 입력
        br.close();     // 버퍼 리더 닫아주기

        while (st.hasMoreTokens()) {    // token이 남아 있는 동안 계속 반복
            arrayList.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(arrayList);    // arrayList 정렬

        bw.write("중간 값은 ");
        bw.write(arrayList.get(1).toString());

        bw.flush();
        bw.close();
    }
}
