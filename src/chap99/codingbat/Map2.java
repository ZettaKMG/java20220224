package chap99.codingbat;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
	public Map<String, Integer> word0(String[] strings) {
		Map<String, Integer> map = new HashMap<>();

		for (String str : strings) {
			map.put(str, 0);
		}

		return map;
	}

	public Map<String, Integer> wordLen(String[] strings) {
		Map<String, Integer> map = new HashMap<>();

		for (String str : strings) {
			map.put(str, str.length());
		}

		return map;
	}

//	public Map<String, String> pairs(String[] strings) {
//		Map<String, String> map = new HashMap<>();
//
//		for (String str : strings) {
//			map.put(str.substring(0, 1), str.substring(str.length() - 1));
//		}
//
//		return map;
//	}

	public Map<String, String> pairs(String[] strings) {
		Map<String, String> map = new HashMap<>();

		for (String str : strings) {
			String key = str.substring(0, 1);
			String value = str.substring(str.length() - 1);

			map.put(key, value);
		}

		return map;
	}

}
