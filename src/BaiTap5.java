import java.util.Scanner;

public class BaiTap5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner
		Scanner scanner = new Scanner(System.in);
		// Khai bao bien
		double P, A, r;
		double m = 0;
		int n =1;
		System.out.println("Vui lòng nhập số tiền bạn muốn gửi : ");
		P = scanner.nextDouble();
		System.out.println("Vui lòng nhập số tiền bạn muốn có để mua xe là : ");
		A = scanner.nextDouble();
		System.out.println("Vui lòng nhập lãi suất hằng năm của ngân hàng : ");
		r = scanner.nextDouble();
		while(m<A) {
			m = P * Math.pow((1+r), n);
			System.out.println(m);
			if(m<A) {
				n++;
			}
		}
		System.out.println("Số năm chờ đợi để đủ tiền mua xe là : " + n);
		
	}

}
