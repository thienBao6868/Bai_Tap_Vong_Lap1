import java.util.Random;
import java.util.Scanner;

public class BaiTap1 {

	// TODO Auto-generated method stub
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int playerWins = 0;
		int computerWins = 0;
		int rounds = 0;

		System.out.println("Chào mừng bạn đến với trò chơi Oẳn Tù Tì!");

		do {
			int playerChoice = getPlayerChoice(scanner);
			int computerChoice = random.nextInt(3); // 0: bao, 1: kéo, 2: kim

			System.out.println("Máy chọn: " + getGestureName(computerChoice));
			System.out.println("Bạn chọn: " + getGestureName(playerChoice));

			int result = determineWinner(playerChoice, computerChoice);

			if (result == 1) {
				System.out.println("Bạn thắng!");
				playerWins++;
			} else if (result == -1) {
				System.out.println("Máy thắng!");
				computerWins++;
			} else {
				System.out.println("Hòa!");
			}

			rounds++;

			System.out.print("Nhấn một số khác 0 để tiếp tục, nhấn 0 để dừng lại: ");
		} while (scanner.nextInt() != 0);

		System.out.println("Kết quả cuối cùng:");
		System.out.println("Tổng số ván chơi: " + rounds);
		System.out.println("Số lần bạn thắng: " + playerWins);
		System.out.println("Số lần máy thắng: " + computerWins);
		System.out.println("Tỉ lệ chiến thắng của bạn: " + ((double) playerWins / rounds) * 100 + "%");
		System.out.println("Tỉ lệ chiến thắng của máy: " + ((double) computerWins / rounds) * 100 + "%");

		scanner.close();
	}

	private static int getPlayerChoice(Scanner scanner) {
		System.out.println("Chọn một số: 0 (bao), 1 (kéo), 2 (kim)");
		return scanner.nextInt();
	}

	private static String getGestureName(int choice) {
		switch (choice) {
		case 0:
			return "Bao";
		case 1:
			return "Kéo";
		case 2:
			return "Kim";
		default:
			return "Không xác định";
		}
	}

	private static int determineWinner(int playerChoice, int computerChoice) {
		if (playerChoice == computerChoice) {
			return 0; // Hòa
		} else if ((playerChoice == 0 && computerChoice == 1) || (playerChoice == 1 && computerChoice == 2)
				|| (playerChoice == 2 && computerChoice == 0)) {
			return 1; // Người chơi thắng
		} else {
			return -1; // Máy thắng
		}
	}

}
