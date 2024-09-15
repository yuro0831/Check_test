package Test.pass;

public class PassBook implements Pass {

	// 名前
	private String name;

	// 支店番号
	private int branchNumber;

	// 口座番号
	private int accountNumber;

	// 残高
	private int money;

	public PassBook(String name, int branchNumber, int accountNumber, int money) {
		this.name = name;
		this.branchNumber = branchNumber;
		this.accountNumber = accountNumber;
		this.money = money;
	}
	//問題2～5の記述はここから
	
	//ゲッターセッター(必要に応じて追加する事)
}
