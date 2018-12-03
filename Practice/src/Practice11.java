
public class Practice11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("入力された数値を合計します。1から9の数値を入力して下さい。0を入力したら計算結果を表示します。");

		int num = 0;
		int sum = 0;

		while(true) {
			num  = new java.util.Scanner(System.in).nextInt();

			if(0 == num) {
			break;
			}

			if(0 > num || 9 < num) {
			System.out.println("0から9の数値を入力して下さい。");
			continue;

			}
			sum += num;
		}
		System.out.println("合計値は" + sum + "です。");
	}
}
