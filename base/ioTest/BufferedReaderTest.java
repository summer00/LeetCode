package ioTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

public class BufferedReaderTest {
	@Test
	public void copyTest() {
		try (BufferedReader br = new BufferedReader(new FileReader("F:\\study\\9.JAVA_BASE\\±Ê¼Ç\\test.txt"));
				BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\study\\9.JAVA_BASE\\±Ê¼Ç\\test2.txt"))) {
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
}
