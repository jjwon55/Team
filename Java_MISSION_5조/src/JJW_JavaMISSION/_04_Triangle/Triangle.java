package JJW_JavaMISSION._04_Triangle;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("");
		int n = sc.nextInt();
		char arr[][] = new char[n][];
		int a= 1;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new char[a];
			a += 2;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = '*';
			}
		}
		for (char[] cs : arr) {
			System.out.println(cs);
		}
		
		sc.close();
	}
}
