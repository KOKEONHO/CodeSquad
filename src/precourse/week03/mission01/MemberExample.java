package precourse.week03.mission01;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class MemberExample {
    public static void main(String[] args) {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Printer printer = new Printer(bw);

        RedMember redMember = new RedMember("James", 10000, 2);
        PlatinumMember platinumMember = new PlatinumMember("Edward", 10000, 2);
        DiamondMember diamondMember = new DiamondMember("Elizabeth",30000,2);

        printer.globalPrintln(redMember.showCustomerInfo());
        printer.globalPrintln();
        printer.globalPrintln(platinumMember.showCustomerInfo());
        printer.globalPrintln();
        printer.globalPrintln(diamondMember.showCustomerInfo());
        printer.globalPrintln();

        printer.globalClose();
    }
}
