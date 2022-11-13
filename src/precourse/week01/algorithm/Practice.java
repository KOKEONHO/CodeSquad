package precourse.week01.algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Practice {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        String str1 = st.nextToken();
        String str2 = st.nextToken();

        String result = getNewString(str1, str2);

        bw.write(result);
        bw.newLine();

        bw.flush();
        bw.close();
    }

    public static String getNewString(String str1, String str2) {

        String str3, str4;
        str3 = str1.substring(0, str1.indexOf(str2));
//        System.out.println(str3);
        str4 = str1.substring(str1.indexOf(str2)+str2.length(),str1.length());
//        System.out.println(str4);

        return str3+str4;
    }
}
