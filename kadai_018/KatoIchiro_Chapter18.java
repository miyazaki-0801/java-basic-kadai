package kadai_018;

public  class KatoIchiro_Chapter18 extends Kato_Chapter18 {

	public void setGivenName() {
		this.givenName = "一郎";
	}
	
	@Override
	public void eachIntroduce() {
		System.out.println("好きな食べ物はリンゴです。");
	}
	
}


// 加藤一郎を表すクラス

// public	void	setGivenName	名を表すフィールドの値をセットする

// setGivenNameで、各子クラスはgivenNameフィールドに次の値をセット

/* gevenNameフィールドの値

一郎

*/

/*

eachlntroduceの実装

好きな食べ物はリンゴです、と出力する

*/