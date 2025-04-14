package kadai_018;

abstract public class Kato_Chapter18 {

	// 姓　名　住所
	public String familyName;
	public String givenName;
	public String address;
	
	// コンストラクタ
	public Kato_Chapter18() {
		this.familyName = "加藤";
		this.givenName = "";
		this.address = "東京都中野区◯×";
	
	}
	
	// 共通の紹介を出力する
	public void commonIntroduce() {
		System.out.println("私は" + familyName + givenName + "です。");
		System.out.println("住所は" + address + "です。");
	}
	
	// 抽象メソッド（個別の紹介）
	abstract public void eachIntroduce();
	
	// 紹介を実行する
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}
	
}