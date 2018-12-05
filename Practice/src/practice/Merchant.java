package practice;

public class Merchant {
	/**属性*/
	int price = 100;
	int stock = 100;
	int money = 0;
	
	/** 操作 **/
    // 商品を売る
    void sellItem(int number) {
    	this.stock -= number;
    	this.money += price * number;
    };
    // 売り上げを確認する
    String confirmMoney() {
        return "売上は" + money + "円です。";
    }


	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
