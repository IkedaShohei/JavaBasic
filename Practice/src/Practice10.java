
public class Practice10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10 ; j++) {
				System.out.print("★");
			}
			System.out.println();
		}

		//別回答
		System.out.println();
		for (int i = 1; i <= 100; i++) {
			System.out.print("★");

			if(i % 10 == 0) {
				System.out.println();
			}
		}
	}

}
