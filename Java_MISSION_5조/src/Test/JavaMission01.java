package Test;

import java.util.Scanner;

public class JavaMission01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("영어 : ");
		int eng = sc.nextInt();
		System.out.println("수학 : ");
		int math = sc.nextInt();
		System.out.println("자바 : ");
		int java = sc.nextInt();
		
		
		int sum = eng + math + java;
		System.out.println("총점 : " + sum);
		double avg = sum / 3;
		System.out.println("평균 : " + avg);
		
		sc.close();
	}
}
