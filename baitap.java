package hocjava;

import java.util.Scanner;

//Cho phương trình ax + b = 0
//Viết chương trình nhập vào 2 số nguyên a và b. Tính toán nghiệm của phương trình
//trên
//Gợi ý:
//- Nếu a = 0, b = 0 => thông báo "phương trình có vô số nghiệm"
//- Nếu a = 0, b # 0 => thông báo "phương trình vô nghiệm"
//- Còn lại: x = -b/a => thông báo x = ?
public class baitap {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
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
}
