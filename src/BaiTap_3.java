import java.util.Scanner;

public class BaiTap_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// variable
		int tong = 0, n;
		float number;
		// scanner
		Scanner scanner = new Scanner(System.in);

		// vong lap
		do {
			System.out.println("vui long nhap n > 0");
			n = scanner.nextInt();
			if (n <= 0) {
				System.out.println("So ban nhap vao khong phai so > 0");
			}
		} while (n <= 0);

		for (int i = 0; i < n; i++) {
			if (i % 2 != 0) {
				tong += i;
			}
		}
		System.out.println("Tong cac so le nho hon " + n +" la: " + tong);
	}

}
