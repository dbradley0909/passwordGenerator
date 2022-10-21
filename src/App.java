import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class App {
 
    public static void main(String args[]) {

        System.out.println("Please input your password: ");
        
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String regex = "^(?=.*[0-9])"+ "(?=.*[a-z])(?=.*[A-Z])"+ "(?=.*[~!@#$%^&*()-=+_])"+ "(?=\\S+$).{8,16}$";
        boolean vPassword = isValidPassword(word, regex);
        System.out.println("Is the password valid true or false: \n" + vPassword);
         sc.close();
    }
 
    public static boolean isValidPassword(String password, String regex)
    {
        Pattern pattern = Pattern.compile(regex);
        if (password == null) {
            return false;
        } else {
            System.out.println("Thanks for playing!");  
        }
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
        
    }
}