package reg_ex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
//        String s1 = " ABCD ABCE ABCFABCGABCH";
//        Pattern pattern = Pattern.compile("ABC");
//        String s1 = " ABGHSCD";
//        Pattern pattern = Pattern.compile("[ABC]");
//        String s1 = " ABCOP";
//        Pattern pattern = Pattern.compile("AB[C-F]OP");
//        String s1 = " abcd abce abc5abcg6abch";
//        Pattern pattern = Pattern.compile("abc[^e-g4-7]");
//        String s1 = " abcd abce abc5abcg6abch";
//        Pattern pattern = Pattern.compile("abc.");
//        String s1 = " abcd abce abc5abcg6abch";
//        Pattern pattern = Pattern.compile("\\d");
//        String s1 = " abcd abce abc5abcg6abch";
//        Pattern pattern = Pattern.compile("\\w+");
        String s1 = " abc dom poka kino zaur";
        Pattern pattern = Pattern.compile("\\w{4}");



        Matcher matcher = pattern.matcher(s1);
        while (matcher.find()) {
            System.out.println( "Position: " + matcher.start() + "  " + matcher.group());
        }
    }
}
