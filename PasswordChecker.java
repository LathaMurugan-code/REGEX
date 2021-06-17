package regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PasswordChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter password: ");
		String password = sc.next();
		Pattern p = Pattern.compile("[*a-z]");
		Matcher m = p.matcher(password);
		if(password.length()>8&&password.length()<=12)
		{
			System.out.println("Strong password");
		}
		else
		{
			System.out.println("weak password");
		}
		if(m.find())
		{
			System.out.println("pw having small letters");
		}
		Pattern p1 = Pattern.compile("[*A-Z]");
		Matcher m1 = p1.matcher(password);
		if(m1.find())
		{
			System.out.println("pw having Capital letters");
		}
		Pattern p2 = Pattern.compile("[*0-9]");
		Matcher m2 = p2.matcher(password);
		if(m2.find())
		{
			System.out.println("pw having digits");
		}
		Pattern p3 = Pattern.compile("[*$&*%@?{}]");
		Matcher m3 = p3.matcher(password);
		if(m3.find())
		{
			System.out.println("pw having special characters");
		}
		
		

	}

}
