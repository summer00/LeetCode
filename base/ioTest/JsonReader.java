package ioTest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
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
		simpleReader("F:\\study\\9.JAVA_BASE\\笔记\\test.json");
	}

	/**
	 * 简单实现，单层json
	 * 
	 * @throws Exception
	 */
	public List<Map<String, String>> simpleReader(String fileName) throws Exception {
		String str = getString(fileName);
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			// TODO 未完成
		}
		System.out.println(str);
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
