package _1.합계와평균;

import java.util.Scanner;

public class PlusAndAvg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("");
		int eng = sc.nextInt();
		System.out.print("");
		int math = sc.nextInt();
		System.out.print("");
		int java = sc.nextInt();
		
		int sum = (eng + math + java);
		double avg = (double) (sum / 3);
		System.out.println("영어 점수 : " + eng);
		System.out.println("수학 점수 : " + math);
		System.out.println("자바 점수 : " + java);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		sc.close();
	}
}
