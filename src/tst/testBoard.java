package tst;

import java.util.ArrayList;
import java.util.List;

public class testBoard {
    public static void main(String[] args) {

        String asd = "$ 52,411. 23";

        asd = asd.replaceAll("\\D+","");
        int number = Integer.parseInt(asd);
        System.out.println(number);


        List<String> sss = new ArrayList<>();
        ArrayList<String> sss2 = new ArrayList<>();
    }
}
