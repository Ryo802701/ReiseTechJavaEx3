import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// List
		List<String> lstAddress = new ArrayList<>();
		lstAddress.add("北海道札幌市");
		lstAddress.add("宮城県仙台市");
		lstAddress.add("東京都中央区");
		lstAddress.add("愛知県名古屋市");
		lstAddress.add("大阪府大阪市");
		lstAddress.add("福岡県福岡市");

		for (int i = 0; i <= 6; i++) { // 範囲外例外を起こさせる
			try {
				System.out.println(lstAddress.get(i));
			} catch (Exception e) {
				System.out.println("例外が発生しました。");
				System.out.println(e.toString());
			}
		}
		
		// Map
		Map<String, String> mapPostCode = new HashMap<>();
		Map<String, String> mapPostCode2 = new HashMap<>();
		Map<String, String> mapPostCode3 = null;

		mapPostCode.put("060-0806", "北海道札幌市");
		mapPostCode.put("980-0021", "宮城県仙台市");
		mapPostCode.put("100-0001", "東京都中央区");
		mapPostCode.put("450-0002", "愛知県名古屋市");
		mapPostCode.put("530-0001", "大阪府大阪市");
		mapPostCode.put("812-0011", "福岡県福岡市");
		
		try {
		
			// Mapの変数を別の変数にすべてコピーする
			mapPostCode2.putAll(mapPostCode);
		
			for(Map.Entry<String, String> entry : mapPostCode2.entrySet()) {
				System.out.println(entry.getKey() + ":" + entry.getValue());
			}

			// nullをコピーしようとして例外を起こさせる
			mapPostCode2.putAll(mapPostCode3);
		
			for(Map.Entry<String, String> entry : mapPostCode3.entrySet()) {
				System.out.println(entry.getKey() + ":" + entry.getValue());
			}
		
		} catch (Exception e) {
			System.out.println("例外が発生しました。");
			System.out.println(e.toString());
		}
	}

}
