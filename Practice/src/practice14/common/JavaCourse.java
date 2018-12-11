package practice14.common;

public class JavaCourse implements Course{
	/*
	 * ★ common.Courseを実装した、JavaCourseクラスを作成してください
	 *
	 * コース名称
	 * 		「【Eラーニング】Java」
	 * 単元
	 * 		式と演算
	 * 		制御構文
	 * 		メソッド
	 * 		配列
	 * 		オブジェクト指向
	 * 		継承
	 * 		高度な継承
	 */
	@Override
	public String getCourseName() {
		// TODO 自動生成されたメソッド・スタブ
		return "【Eラーニング】Java";
	}

	@Override
	public String[] getCourseUnit() {
		String[] string = null;
		// TODO 自動生成されたメソッド・スタブ
		string[0] = "式と演算";
		string[1] = "制御構文";
		string[2] = "メソッド";
		string[3] = "配列";
		string[4] = "オブジェクト指向";
		string[5] = "継承";
		string[6] = "高度な継承";
		return null;
	}

	}

