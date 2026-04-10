package lab2;

import java.util.Scanner;

//Bài 1: Viết chương trình nhập vào 1 số nguyên từ bàn phím. Hiển thị kết quả số đấy là số
//nguyên tố hay không ?
//Gợi ý:
//- Số nguyên tố là số chỉ chia hết cho 1 và chính nó (tối đa 2 ước)
//- Dùng vòng lặp (2, Số nguyên -1). Nếu số nguyên chia hết cho i => ko là số nguyên tố
//- Sử dụng toán tử % để biết có chia hết hay không ?
public class bt1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào số nguyên: ");
		int n = scanner.nextInt();
		int k = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				k = 1;
				break;
			}
		}
		if (k == 0)
			System.out.println("số đó là số nguyên tố!");
		else
			System.out.println("số đó k phải là số nguyên tố!");
		scanner.close();
	}
}
