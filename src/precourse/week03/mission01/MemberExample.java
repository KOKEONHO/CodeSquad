package precourse.week03.mission01;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class MemberExample {
    public static void main(String[] args) {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Printer printer = new Printer(bw);

        RedMember redMember1 = new RedMember("James", 10000, 2);
        RedMember redMember2 = new RedMember("Thomas", 30000, 2);
        PlatinumMember platinumMember1 = new PlatinumMember("Edward", 10000, 2);
        PlatinumMember platinumMember2 = new PlatinumMember("Percy", 30000, 2);
        DiamondMember diamondMember1 = new DiamondMember("Elizabeth", 30000, 2);

//        printer.globalPrintln(redMember1.showCustomerInfo());
//        printer.globalPrintln();
//        printer.globalPrintln(redMember2.showCustomerInfo());
//        printer.globalPrintln();
//        printer.globalPrintln(platinumMember1.showCustomerInfo());
//        printer.globalPrintln();
//        printer.globalPrintln(platinumMember2.showCustomerInfo());
//        printer.globalPrintln();
//        printer.globalPrintln(diamondMember1.showCustomerInfo());
//        printer.globalPrintln();

        printer.globalPrintln(redMember1.showCustomerInfo() + "\n"
                + redMember2.showCustomerInfo() + "\n"
                + platinumMember1.showCustomerInfo() + "\n"
                + platinumMember2.showCustomerInfo() + "\n"
                + diamondMember1.showCustomerInfo());

        printer.globalClose();
    }
}
