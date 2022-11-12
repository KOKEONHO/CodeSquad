package precourse.week_02.mission02.question02.practice;

import javax.xml.transform.stream.StreamSource;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        CreateFile create = new CreateFile(br, bw);

        create.createTextFile();

        br.close();
    }
}
