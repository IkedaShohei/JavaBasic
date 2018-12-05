package practice;

import practice.logics.PracticeLogic16;

public class Practice16 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int age = scanner.nextInt();
		
		boolean result = PracticeLogic16.checkChild(age);
		
		if(result == true) {
			System.out.println("子供");
		}else if(result == false) {
			System.out.println("大人");
		}
	}

}
