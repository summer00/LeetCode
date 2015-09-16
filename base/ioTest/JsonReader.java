package ioTest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

/**
 * 解析Json文件
 */
public class JsonReader {
	@Test
	public void test() throws Exception {
		Date start = new Date();
		List<Map<String, String>> list = simpleReader("F:\\test\\test.json");
		Date end = new Date();
		System.out.println(end.getTime() - start.getTime());
		System.out.println(list);
	}

	/**
	 * 简单实现，单层json; 时间复杂度（n*n*n）：n--读取，n--分隔字符串为数组,n--解析
	 * 
	 * @throws Exception
	 */
	public List<Map<String, String>> simpleReader(String fileName) throws Exception {
		String[] arr = getString(fileName).split("\"");
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		int length = 0;
		for (int i = 0; i < arr.length; i++) {
			if ("{".equals(arr[i])) {
				Map<String, String> map = new HashMap<>();
				list.add(map);
			} else if (":".equals(arr[i])) {
				list.get(length).put(arr[i - 1], null);
			} else if (",".equals(arr[i])) {
				list.get(length).put(arr[i - 3], arr[i - 1]);
			} else if ("}".equals(arr[i])) {
				list.get(length).put(arr[i - 3], arr[i - 1]);
			} else if ("},{".equals(arr[i])) {
				list.get(length).put(arr[i - 3], arr[i - 1]);
				Map<String, String> map = new HashMap<>();
				list.add(map);
				length++;
			}
		}
		return list;
	}

	private String getString(String fileName) {
		StringBuffer sb = new StringBuffer();
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			int len;
			char[] c = new char[1024];
			while ((len = br.read(c)) != -1) {
				sb.append(c, 0, len);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString().replaceAll("\\s", "");
	}
}
