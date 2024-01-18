public class JStr_PS1 {
    public static void main(String[] args) {
        //PROBLEM 1
        String a="Monisha";
        a=a.toLowerCase();
        System.out.println(a);

        //PROBLEM 2
        String b="You can do it";
        b=b.replace(" ","_");
        System.out.println(b);

        //PROBLEM 3
        String letter="Dear <|name|>, Thanks a lot";
        letter=letter.replace("<|name|>", "Monisha");
        System.out.println(letter);

        //PROBLEM 4
        String c="This string contains  double and   triple spaces";
        System.out.println(c.indexOf("  "));
        System.out.println(c.indexOf("   "));

        //PROBLEM 5
        String letters="Dear Monisha,\nYou are great.\nLove you";
        System.out.println(letters);

    }
}
