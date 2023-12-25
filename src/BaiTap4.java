import java.util.Scanner;

public class BaiTap4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// scanner
		Scanner scanner = new Scanner(System.in);
		// khai bao
		int n, x;
		double S = 0;
		// Yeu cau nhap
		System.out.println("Vui lòng nhập x : ");
		x = scanner.nextInt();
		System.out.println("Vui lòng nhập n : ");
		n = scanner.nextInt();
		// xu ly
		for (int i = 0; i <= n; i++) {
			S += Math.pow(x, n);
		}
		System.out.println("Tong la : " + S);

	}

}
