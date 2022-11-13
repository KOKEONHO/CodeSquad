package precourse.week01.mission02.question03;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class CafeExample {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Customer James = new Customer("James", 5000, "별다방", "아메리카노");
        Customer Thomas = new Customer("Thomas", 10000, "콩다방", "라떼");

        Cafe StarBucks = new Cafe(James, James.getMenu());
        Cafe CoffeeBean = new Cafe(Thomas, Thomas.getMenu());

        bw.write(StarBucks.toString());
        bw.newLine();
        bw.write(CoffeeBean.toString());
        bw.newLine();

        bw.flush();
        bw.close();
    }
}
