public class Janken {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		System.out.println("じゃんけんゲーム！");
		System.out.println("選択肢: 0: グー, 1: チョキ, 2: パー");
		System.out.print("あなたの手を選んでください: ");
		int userChoice = scanner.nextInt();

		int computerChoice = random.nextInt(3);
		
		//ここから作成


		//ここまで
		scanner.close();
	}
}