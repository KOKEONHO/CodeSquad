package precourse.week_02.mission01;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Question01 {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] alphabetArray = new char[26];

        for (int i = 0; i < alphabetArray.length; i++) {
            alphabetArray[i]=(char)('A'+i);
        }

        // Character 래퍼 클래스로 하려하니 되지 않는데 그 이유가 궁금
//        Character[] alphabetArray = new Character[26];
//
//        for (int i = 0; i < alphabetArray.length; i++) {
//            alphabetArray[i]=(char)('A'+i);
//        }


        bw.write(Arrays.toString(alphabetArray));

        bw.flush();
        bw.close();

    }
}
