package hocjava;

import java.util.Scanner;

//Bài 4: Viết chương trình tổ chức menu:
//
//System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
//System.out.println("++ ----------------------------------------- ++");
//System.out.println("| 1. Giải phương trình bậc nhất |");
//System.out.println("| 2. Giải phương trình bậc hai |");
//System.out.println("| 3. Tính số tiền điện |");
//System.out.println("| 4. Kết thúc |");
//System.out.println("++ ------------------ ++");
//
//Yêu cầu:
//- Khi nhập vào "tính năng", sẽ thực hiện theo 3 bài tập đã làm ở trên
public class baitap4 {
	public static void bai1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(">>Chương trình Giải phương trình bậc nhất ax + b = 0<< ");
		System.out.print("Nhập a: ");
		int a = scanner.nextInt();
		System.out.print("Nhập b: ");
		int b = scanner.nextInt();
		System.out.printf("Giải phương trình bậc nhất %dx + %d = 0\n", a, b);
		if (a == 0 && b == 0) {
			System.out.println("Phương trình có vô số nghiệm");
		} else if (a == 0 && b != 0) {
			System.out.println("Phương trình vô nghiệm");
		} else {
			double x = (double) -b / a;
			System.out.printf("Phương trình có nghiệm x = %.3f", x);
		}
		scanner.close();
	}

	public static void bai2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(">>Chương trình Giải phương trình bậc hai ax^2 + bx + c = 0");
		System.out.print("Nhập a: ");
		int a = scanner.nextInt();
		System.out.print("Nhập b: ");
		int b = scanner.nextInt();
		System.out.print("Nhập c: ");
		int c = scanner.nextInt();
		System.out.printf("Giải phương trình bậc hai %dx^2 + %dx + %d = 0 \n", a, b, c);

		if (a == 0) {
			System.out.printf("Giải phương trình bậc nhất %dx + %d = 0\n", b, c);
			if (b == 0 && c == 0) {
				System.out.println("Phương trình có vô số nghiệm");
			} else if (b == 0 && c != 0) {
				System.out.println("Phương trình vô nghiệm");
			} else {
				double x = (double) -c / b;
				System.out.printf("Phương trình có nghiệm x = %.3f", x);
			}
		}

		else {
			double delta = (double) Math.pow(b, 2) - 4 * a * c;
			if (delta < 0)
				System.out.println("Phương trình vô nghiệm");
			else if (delta == 0) {
				double x = (double) -b / (2 * a);
				System.out.printf("nghiệm kép x = -b/(2*a)= %.3f \n", x);
			} else {
				double x1 = (double) (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (double) (-b - Math.sqrt(delta)) / (2 * a);
				System.out.printf("Phương trình có hai nghiệm riêng biệt: x1= %.3f, x2= %.3f ", x1, x2);
			}
		}
		scanner.close();
	}

	public static void bai3() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(">>Chương trình tính điện<<");
		System.out.print("Nhập vào số điện: ");
		int dien = scanner.nextInt();
		if (dien >= 0 && dien <= 100) {
			int money = dien * 1000;
			System.out.println("tiền điện: " + money);
		} else {
			int money = 100 * 1000 + (dien - 100) * 1500;
			System.out.println("tiền điện: " + money);
		}
		scanner.close();
	}

	public static void main(String[] args) {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ----------------------------------------- ++");
		System.out.println("| 1. Giải phương trình bậc nhất |");
		System.out.println("| 2. Giải phương trình bậc hai |");
		System.out.println("| 3. Tính số tiền điện |");
		System.out.println("| 4. Kết thúc |");
		System.out.println("++ ------------------ ++");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		switch (n) {
		case 1:
			bai1();
			break;
		case 2:
			bai2();
			break;
		case 3:
			bai3();
			break;
		case 4:
			System.out.println("Bạn đã chọn thoát chương trình");
			break;
		default:
			System.out.println("Dữ liệu không hợp lệ!");
		}
		scanner.close();
	}
}
