package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Maps {

	private static Iterator<Entry<String, Integer>> iterator;

	public static void main(String[] args) {
		maps();
	}

	private static void maps() {
		Map<String, Integer> mp1 = new HashMap<>();
		mp1.put("身法", 1966);
		mp1.put("会心", 55);
		mp1.put("命中", 105);
		mp1.put("破防", 30);
		mp1.put("无双", 28);
		mp1.put("攻击", 5888);
		/*
		 * Iterator<Entry<String, Integer>> iterator2 = mp1.entrySet().iterator(); while
		 * (iterator2.hasNext()) { Entry<String, Integer> entry = iterator2.next();
		 * String key = entry.getKey(); Integer value = entry.getValue();
		 * System.out.println(key + "----" + value); }
		 */
		for (Entry<String, Integer> entry : mp1.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("key=" + key + "----" + "value=" + value);
		}
	}

	private static void lists() {
		List<String> ls = new ArrayList<>();
		ls.add("皮皮猪");
		ls.add("小貂");
		ls.add("zzh");
		/*
		 * Iterator<String> it1 = ls.iterator(); while (it1.hasNext()) { String str =
		 * it1.next(); System.out.println(str); }
		 */

		/*
		 * for (int i = 0; i < ls.size(); i++) { System.out.println(ls.get(i)); }
		 */

		for (String string : ls) {
			System.out.println(string);
		}
	}

	private static void arrays() {
		String[] st = new String[3];
		st[0] = "ppz";
		st[1] = "xd";
		st[2] = "zzh";

		/*
		 * for (int i = 0;i<st.length; i++) { System.out.println(st[i]); }
		 */
		int a = 0;
		while (a < st.length) {
			System.out.println(st[a]);
			a++;
		}
	}

}
