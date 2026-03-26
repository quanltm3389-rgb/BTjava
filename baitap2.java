package hocjava;

import java.util.Scanner;

//Cho phương trình: ax^2 + bx + c = 0
//Viết chương trình nhập vào 3 số nguyên a, b, c. Tính toán nghiệm của phương trình
//trên
//Gợi ý:
//- Nếu a = 0 => làm tương tự ví dụ bài 1
//- Nếu a # 0:
//- Tính delta = b^2 - 4ac.
//- Nếu delta < 0 => thông báo "phương trình vô nghiệm"
//- Nếu delta = 0 => thông báo "nghiệm kép x = -b/(2*a)
//- Nếu delta > 0 => thông báo có 2 nghiệm riêng biệt
//x1 = (-b + căn(delta))/(2*a)
//x2 = (-b - căn(delta))/(2*a)
public class baitap2 {
	public static void giaiPhuongTrinhBacNhat(int a, int b) {
		System.out.printf("Giải phương trình bậc nhất %dx + %d = 0\n", a, b);
		if (a == 0 && b == 0) {
			System.out.println("Phương trình có vô số nghiệm");
		} else if (a == 0 && b != 0) {
			System.out.println("Phương trình vô nghiệm");
		} else {
			double x = (double) -b / a;
			System.out.printf("Phương trình có nghiệm x = %.3f", x);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập a: ");
		int a = scanner.nextInt();
		System.out.print("Nhập b: ");
		int b = scanner.nextInt();
		System.out.print("Nhập c: ");
		int c = scanner.nextInt();
		System.out.printf("Giải phương trình bậc hai %dx^2 + %dx + %d = 0 \n", a, b, c);

		if (a == 0)
			giaiPhuongTrinhBacNhat(b, c);
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
}
