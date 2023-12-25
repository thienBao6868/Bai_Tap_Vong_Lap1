
public class BaiTap_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// khai bao
		int total = 0, i = 0, n=0;
		while (total < 10000) {
			total += i;

			if (total > 10000) {
				n = i;
			}
			i += 1;
		}
		System.out.print(" So nguyen duong n la: " + n);
	}

}
