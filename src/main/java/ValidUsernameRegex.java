import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUsernameRegex {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        scan.nextLine();
        String regex="^[A-Za-z]\\w{7,29}$";
        Pattern pattern=Pattern.compile(regex);
        while(num--!=0){
        String input=scan.nextLine();
        Matcher matcher= pattern.matcher(input);
        if(matcher.find()){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
        }
    }
}
