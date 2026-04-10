package lab2;

import java.util.Scanner;

//Bài 2: Viết bảng cửu chương của 1 số nguyên bất kỳ
//Gợi ý:
//- Dùng vòng lặp từ 1 tới 10
//sysout(" %d x %d = %d ", x, i, x*i)
public class bt2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào số nguyên: ");
		int n = scanner.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d x %d = %d \n", n, i, n * i);
		}
		System.out.println();
		for (int i = 10; i >= 1; i--) {
			System.out.printf("%d / %d = %d \n", n * i, i, n);
		}

		scanner.close();
	}
}
