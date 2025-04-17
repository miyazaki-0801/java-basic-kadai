package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {

	
	private HashMap<String, String> fruits;
	
	public Dictionary_Chapter21() {
	
	fruits = new HashMap<String, String>();
		
	fruits.put("apple","りんご");
	fruits.put("peach","桃");
	fruits.put("banana","バナナ");
	fruits.put("lemon", "レモン");
	fruits.put("pear","梨");
	fruits.put("kiwi","キウィ");
	fruits.put("strawberry","いちご");
	fruits.put("grape","ぶどう");
	fruits.put("muscat","マスカット");
	fruits.put("cherry","さくらんぼ");
	
	}
	
	public boolean containsWord(String word) {
		return fruits.containsKey(word);
	}
	
	public String getMeaning(String word) {
		return fruits.get(word);
	
	
}
}
