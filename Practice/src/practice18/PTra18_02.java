/*
 * PTra18_02.java
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

public class PTra18_02 {

	/*
	 * ★ BestElevenCandidate.csvの情報を保持するためのクラス、entity.Playerクラスを作成してください
	 *
	 * フィールド
	 * 		position	：	String
	 * 		name		：	String
	 * 		country		：	String
	 * 		team		：	String
	 * メソッド
	 * 		各アクセサ
	 *
	 * 		toString()	：	Objectクラスのオーバーライド
	 * 		各フィールドの値を、カンマ区切りの文字列で取得する
	 */

	public static void main(String[] args) {

		/*
		 * entity.Playerの作成後に行ってください
		 *
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		/**↓18_01からコピー**/
		/**ArrayListの型をlayerにすることが肝**/
        ArrayList<Player> array = new ArrayList<>();
        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
            while (scanner.hasNext()) {
            	/**自分メモ**/
            	/**クラス型配列？**/
            	/**PlayerクラスのtoString()ですでに文字列はカンマで区切ってある。**/
            	String line = scanner.nextLine();
            	String[] info = line.split(",");

            	Player player = new Player();
            	player.setPosition(info[0]);
            	player. setName(info[1]);
            	player.setCountry(info[2]);
            	player.setTeam(info[3]);

                // ★ 1行ごとにArrayListに格納してください
                array.add(player);
            }
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");


		// ★ ArrayListに格納されているインスタンス全てのtoStringメソッドを実行し、出力してください
		// ※ できれば拡張for文を使いましょう

        }
        for(int i = 0;i < array.size();i++){
            System.out.println(array.get(i).toString());
        }
	}
}