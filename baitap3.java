package hocjava;

import java.util.Scanner;

//Bài 3: Viết chương trình tính số tiền điện (in kết quả ra console)
//Yêu cầu: nhập vào số điện, sau đấy tính số tiền dựa vào quy luật sau:
//- Nếu số điện sử dụng từ 0 tới 100, giá mỗi số điện là 1000
//- Từ số điện 101 (tức là > 100), giá mỗi số điện là 1500
//Gợi ý:
//- Nếu số điện <= 100 => số tiền = số điện x 1000
//- Nếu số điện > 100
//=> số tiền = 100 * 1000 + (số điện - 100) * 1500
public class baitap3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
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
}
