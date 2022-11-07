package precourse.week_01.mission02.presentation;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BoardChangedExample {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BoardChanged board1 = new BoardChanged("안녕하세요","안녕","고뭉남","2022.11.05",5);
        BoardChanged board2 = new BoardChanged("훈민정음","나랏말싸미","세종대왕","2022.11.03");
        BoardChanged board3 = new BoardChanged("자바의 정석","공부하세요","자바지기");
        BoardChanged board4 = new BoardChanged("혼자 공부하는 자바","혼자 하세요");
        BoardChanged board5 = new BoardChanged("빼애애액");

        bw.write(board1.toString());
        bw.newLine();
        bw.write(board2.toString());
        bw.newLine();
        bw.write(board3.toString());
        bw.newLine();
        bw.write(board4.toString());
        bw.newLine();
        bw.write(board5.toString());
        bw.newLine();

        bw.flush();
        bw.close();
    }
}
