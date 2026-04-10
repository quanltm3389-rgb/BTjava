package lab2;

import java.util.Arrays;
import java.util.Scanner;

//Bài 3: Viết chương trình nhập vào 1 mảng số nguyên bất kỳ:
//- Sắp xếp và xuất mảng vừa nhập ra màn hình
//- Xuất phần tử có giá trị nhỏ nhất
//- Xuất phần tử có giá trị lớn nhất
public class bt3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào số phần tử của mảng: ");

		int n = scanner.nextInt();
		int[] Number = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Nhập vào phần tử thứ " + (i + 1) + " của mảng: ");
			Number[i] = scanner.nextInt();
		}
		System.out.println("Mang ban dau: " + Arrays.toString(Number));
		Arrays.sort(Number);
		System.out.println("Sau khi sap xep: " + Arrays.toString(Number));
		System.out.println("Max: " + Number[Number.length - 1]);
		System.out.println("Min: " + Number[0]);
		scanner.close();
	}
}
