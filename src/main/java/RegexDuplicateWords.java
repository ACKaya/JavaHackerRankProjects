import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDuplicateWords {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());
        String regex="\\b(\\w+)(\\s+\\1\\b)+";
        Pattern pattern=Pattern.compile(regex);
        while(n-->0){
            String input=scan.nextLine();
            Matcher matcher = pattern.matcher(input);
            while(matcher.find()){
                input=input.replaceAll(matcher.group(), matcher.group(1));
            }
            System.out.println(input);
        }
    }
}
