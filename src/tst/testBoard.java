package tst;

public class testBoard {
    public static void main(String[] args) {

        String asd = "$ 52,411. 23";

        asd = asd.replaceAll("\\D+","");
        int number = Integer.parseInt(asd);
        System.out.println(number);

    }
}
