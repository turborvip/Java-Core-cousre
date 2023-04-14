package _22_advanced_topic.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyClass {
    // Co it nhat 6 ky tu va nhieu nhat 12 ky tu co cho phep khoang trang
    public static final String REGEX_NAME = "^[a-zA-Z ]{6,12}$";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(REGEX_NAME);
        String input = "abcasda a";
        Matcher matcher = pattern.matcher(input);
        System.out.println(matcher.matches());
    }
}
