package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		
		// 太郎
		KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
		taro.setGivenName();
		taro.execIntroduce();
		System.out.println();
		
		// 一郎
		KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
		ichiro.setGivenName();
		ichiro.execIntroduce();
		System.out.println();
		
		// 花子
		KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
		hanako.setGivenName();
		hanako.execIntroduce();
	}
	
}


// 子クラスの実行をするクラス

/* 

start

各子クラスのインスタンスを作成する

setGivenNameメソッドを実行する

execlntroduceメソッドを実行する

end

*/