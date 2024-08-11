import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValidIp {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        MyRegex myRegex=new MyRegex();
        while(scan.hasNext()){
            String str=scan.next();
            Pattern pattern= Pattern.compile(myRegex.pattern);
            Matcher matcher=pattern.matcher(str);
            System.out.println(matcher.find());

        }

    }
    static class MyRegex{
        String myRegex="(25[0-5]|2[0-4][0-9]|[0-1]?\\d{1,2})";
        String pattern="^"+myRegex+"\\."+myRegex+"\\."+myRegex+"\\."+myRegex+"$";

    }
}
