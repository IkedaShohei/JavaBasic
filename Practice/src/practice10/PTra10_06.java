package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();

		car1.color = "Red";
		car1.gasoline = 50;

		car2.color = "Blue";
		car2.gasoline = 60;

		car3.color = "Green";
		car3.gasoline = 70;

		Car[] carList = new Car[3];
		carList[0] = car1;
		carList[1] = car2;
		carList[2] = car3;

		final int distance = 300;

		for (int i = 0; i < carList.length; i++) {

			int progress = 0;
			int n = 0;

			while(true) {
				int run = carList[i].run();
				n++;

				if(run == -1) {
					System.out.println(carList[i].color +"は目的地に到達できませんでした");
					break;
				}

				progress += run;
				if(progress >= distance) {
					System.out.println(carList[i].color +"は目的地にまで" + n + "時間かかりました。残りのガソリンは、" + carList[i].gasoline + "リットルです");
					break;
				}
			}
		}

	}
}
