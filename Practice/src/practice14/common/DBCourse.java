package practice14.common;

public class DBCourse implements Course{

	/*
	 * ★ common.Courseを実装した、DBCourseクラスを作成してください
	 *
	 * コース名称
	 * 		「【Eラーニング】DB基礎」
	 * 単元
	 * 		DB基礎
	 * 		SQL基礎
	 * 		正規化
	 * 		SQL応用
	 */
	
	@Override
	public String getCourseName() {
		// TODO 自動生成されたメソッド・スタブ
		return "【Eラーニング】DB基礎";
	}

	@Override
	public String[] getCourseUnit() {
		// TODO 自動生成されたメソッド・スタブ
		String[]string = null;
		string[0] = "DB基礎";
		string[1] = "SQL基礎";
		string[2] = "正規化";
		string[3] = "配列";
		return null;
	}
	
	
}
