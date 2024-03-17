package util;

import java.util.Scanner;

public class InputScanner {
	
	private static final Scanner sc = new Scanner(System.in);
	
	//정수 입력받기
	public static int scanInt() {
		return Integer.parseInt(sc.nextLine());
	}
	
	//문자열 입력받기
	public static String scanString() {
		return sc.nextLine();
	}
}
