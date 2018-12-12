/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import entity.Player;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
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
	    	}

	// ★ ArrayListに格納されているインスタンス全てのtoStringメソッドを実行し、出力してください
			// ※ できれば拡張for文を使いましょう
	        for(int i = 0;i < array.size();i++){
	            System.out.println(array.get(i).toString());
	        }


		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
	        /**シャッフルする**/
	        Collections.shuffle(array);

	        int count1 = 0;
	        int count2 = 0;
	        int count3 = 0;
	        int count4 = 0;

	        for (int i = 0; i < array.size(); i++) {
	        	if (array.get(i).getPosition().equals("GK") && count1 < 1) {

					System.out.println(array.get(i));
					count1++;

				}
				if(array.get(i).getPosition().equals("DF") && count2 < 4) {

						System.out.println(array.get(i));
						count2++;

				}
				if(array.get(i).getPosition().equals("MF") && count3 < 4) {

						System.out.println(array.get(i));
						count3++;
				}
				if(array.get(i).getPosition().equals("FW") && count4 < 2) {

						System.out.println(array.get(i));
						count4++;
				}
			}



//	        確認用出力
//	        for (int i = 0; i < array.size(); i++) {
//				System.out.println(array.get(i));
//			}




	        /**最初の考え**/
//	        for (int i = 0;i < array.size();i++) {
//				/**(i)番目が本当に消えているのかの確認equals()→スライド16の7参照。**/
//				if (array.get(i).getPosition().equals("GK")) {
//
//				}
//				if(array.get(i).getPosition().equals("DF")) {
//
//					int count1 = 0;
//					while(count1 == 4) {
//						System.out.println(array.);
//					}
//				}
//				if(array.get(i).getPosition().equals("MF")) {
//
//				}
//				if(array.get(i).getPosition().equals("FW")) {
//
//				}
//			}

	}
}
