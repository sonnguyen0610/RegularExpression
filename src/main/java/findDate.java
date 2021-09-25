import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class findDate {
    public static void main(String[] args) {
        //Bai 1
        String txt="Hello java regex 2-12-2018, hello world 12/12/2018";
        Pattern pattern = Pattern.compile("\\d{1,2}[-/]\\d{1,2}[-/]\\d{4}");
        Matcher matcher = pattern.matcher(txt);

        System.out.println("Ngày tháng trong chuỗi text1: " + txt);
        while (matcher.find()) {
            System.out.println(txt.substring(matcher.start(), matcher.end()));
        }

        //Bai 2
        String regex="Hello java regex son@gmail.com, hello world sonnguyen@gmail.com.com, gmail: 01son@gmail.com";
        Pattern p = Pattern.compile("\\b[a-zA-Z]\\w+(@{1})gmail(\\.[a-z]{2,}){1,2}");
        Matcher m = p.matcher(regex);

        System.out.println("Các email có trong chuỗi: " + regex);
        while (m.find()) {
            System.out.println(regex.substring(m.start(), m.end()));
        }
    }
}
