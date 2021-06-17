package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pwchecker2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter password: ");
		String password = sc.next();
		if(password.length()>8&&password.length()<=12)
		{
			System.out.println("Strong password");
		}
		else
		{
			System.out.println("weak password");
		}
		String[] r = {"[*A-z]","[*0-9]","[*$!@%^&*]","\\S"};
		for(int i=0;i<4;i++)
		{
			Pattern p = Pattern.compile(r[i]);
			Matcher m = p.matcher(password);
			if(m.find())
			{
				System.out.println("pw checked for conditon "+i);
			}
			else
			{
				System.out.println("Conditon "+i+" failed");
			}
		}

	}

}
