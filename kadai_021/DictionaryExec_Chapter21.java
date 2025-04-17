package kadai_021;

public class DictionaryExec_Chapter21 {
public static void main(String[] args) {
	
	 Dictionary_Chapter21  dic = new Dictionary_Chapter21();
	
	 
	 String[] words = {"apple", "banana", "grape", "orange"};
	 
	 for(String word : words) {
	 
	 if(dic.containsWord(word) ) {
		 
		 System.out.println(word + "の意味は" + dic.getMeaning(word));
		 
		 
	 } else  
		 
	  System.out.println(word + "は辞書に存在しません");
}
}
}
