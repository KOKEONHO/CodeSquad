package precourse.week_01.mission02.question02;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class HumanExample {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Human human1 = new Human("제인", 30, 'F', true, 1);
        Human human2 = new Human("고건호", 26, 'M', true, 9);

        bw.write("이름은 "
                + human1.getName()
                + "이고 나이는 "
                + human1.getAge()
                + "살 입니다. 성별은 "
                + human1.getGender()
                + "이며, "
                + human1.getMarriage()
                + "입니다.");

        if (human1.getMarriage().equals("기혼자")) {
            bw.write(" 자녀는 "
                    + human1.getChildrenCnt()
                    + "명이 있습니다.");
        }

        bw.newLine();

        bw.write(human2.toString());
        bw.newLine();

        bw.flush();
        bw.close();
    }
}
