package reg_ex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
    public static void main(String[] args) {

        String s = "Ivanov Vasiliy,Orkostan,Moskow,Lenin street,51,flat 48," +
                "email: vivanov@mail.ru,Postcode: AA99,Phone number: +15437658943;" +
                "Bogdan Kovalychuk,Kiev,Danchenco street,24,flat 27," +
                "email: bodya@yandex.ua,Postcode: UKR456,Phone number: +80674528965;" +
                "Chuck Noris,USA, Hollywood,All star street, 87,flat 21," +
                "email: chuck@gmail.com,Postcode: USA23, Phone number +17653987979;";

//        Pattern pattern = Pattern.compile("\\w+");
//        Pattern pattern = Pattern.compile("\\b\\d{2}\\b");
//        Pattern pattern = Pattern.compile("\\+\\d{9}");
        Pattern pattern = Pattern.compile("\\w+@\\w+\\.(ru|com|ua)");


        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
