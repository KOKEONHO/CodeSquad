package precourse.week01.shine;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        GlobalPrintln globalPrintln = new GlobalPrintln(bw);

        globalPrintln.globalPrintln(br.readLine());
    }
}
