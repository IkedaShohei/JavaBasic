/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import entity.Player;

public class PTra18_03 {

	/*
	 * PTra18_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player> array = new ArrayList<>();
		try (Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
			while (scanner.hasNext()) {
				/**自分メモ**/
				/**クラス型配列？**/
				/**PlayerクラスのtoString()ですでに文字列はカンマで区切ってある。**/
				String line = scanner.nextLine();
				String[] info = line.split(",");

				Player player = new Player();
				player.setPosition(info[0]);
				player.setName(info[1]);
				player.setCountry(info[2]);
				player.setTeam(info[3]);

				// ★ 1行ごとにArrayListに格納してください
				array.add(player);
			}
		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりません");
		}

		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください
		/**前の方から探す形for (int i = 0; i < array.size(); i++) だと前から消していってしまうため(i)番目にズレが生じて正確にレアルとバルサの選手を除外できない。（前が消されると箱の順番が詰まっていく仕組みだから）
		 * だから後ろから消していく。すると（i）番目がずれずに除外していける。**/
		for (int i = array.size() - 1; i >= 0; i--) {
			/**(i)番目が本当に消えているのかの確認equals()→スライド16の7参照。**/
			if (array.get(i).getTeam().equals("レアル・マドリード") || array.get(i).getTeam().equals("バルセロナ")) {
			/**箱の中身の(i)番目を消すメソッド**/
			/**箱の中身が消えると後ろが詰まってくる考え方は要注意！！メモ参照**/
				array.remove(i);
			}
		}

		// ★ 削除後のArrayListの中身を全件出力してください

		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
	}
}
