package ioTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * ×Ö·û»º³åÁ÷²âÊÔ
 */
public class BufferedReaderTest {
	@Test
	public void copyTest() {
		try (BufferedReader br = new BufferedReader(new FileReader("F:\\test\\test.txt"));
				BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\test\\test2.txt"))) {
			String s;
			while (null != (s = br.readLine())) {
				bw.write(s);
				bw.newLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void exchangeFileLine() {
		try (BufferedReader br = new BufferedReader(new FileReader("F:\\test\\test.txt"));
				BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\test\\test1.txt"));) {
			String s;
			List<String> list = new ArrayList<>();
			while ((s = br.readLine()) != null) {
				list.add(s);
			}
			for (int i = list.size() - 1; i >= 0; i--) {
				bw.write(list.get(i));
				bw.newLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
