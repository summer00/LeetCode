package ioTest;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

import org.junit.Test;

/**
 * ×ª»»Á÷²âÊÔ
 */
public class InputStreamReaderTest {

	@Test
	public void inputStreamReaderTest() {
		try (InputStreamReader isr = new InputStreamReader(new FileInputStream("F:\\test\\test.txt"));
				OutputStreamWriter osw = new OutputStreamWriter(
						new FileOutputStream("F:\\test\\test.txt2", true), "GBK");) {
			int len;
			char[] b = new char[20];
			while ((len = isr.read(b)) != -1) {
				System.out.println(Arrays.toString(b));
				osw.write(b, 0, len);
			}
			System.out.println(len);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void bufferedReaderTest() {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream("F:\\test\\test.txt"), "UTF-8"));) {
			String s;
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
