package StringEx.String01;

import java.util.Scanner;

public class Prob2 {
 
	public static void main(String[] args) {
		String inputStr;
		String result;
		StringBuilder sb;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요. : ");
		inputStr = keyboard.nextLine();
		sb = new StringBuilder(inputStr.toUpperCase());
		result = sb.reverse().toString();
		System.out.println(result);
		//프로그램을 구현하세요.
		
		
	}

}
