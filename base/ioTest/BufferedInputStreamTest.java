package ioTest;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class BufferedInputStreamTest {
	@Test
	public void copyTest() {
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			FileInputStream fis = new FileInputStream("F:\\study\\9.JAVA_BASE\\笔记\\test.txt");
			// 装饰者模式
			bis = new BufferedInputStream(fis);
			FileOutputStream fos = new FileOutputStream("F:\\study\\9.JAVA_BASE\\笔记\\test4.txt", true);
			bos = new BufferedOutputStream(fos);
			int len;
			while ((len = bis.read()) != -1) {
				bos.write(len);
			}
			// 回车
			bos.write(13);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bos != null) {
				try {
					bos.close();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					try {
						bis.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	@Test
	/**
	 * 在try()中创建的流对象必须实现了AutoCloseable这个接口,如果实现了，在try后面的{}(读写代码)执行后就会自动调用,
	 * 流对象的close方法将流关掉，从java 7开始
	 */
	public void tryResourceTest() {
		try (BufferedInputStream bis = new BufferedInputStream(
				new FileInputStream("F:\\study\\9.JAVA_BASE\\笔记\\test.txt"));
				BufferedOutputStream bos = new BufferedOutputStream(
						new FileOutputStream("F:\\study\\9.JAVA_BASE\\笔记\\test5.txt", true));) {
			int b;
			while ((b = bis.read()) != -1) {
				bos.write(b);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void exchangeFileLine() {
		try (BufferedReader br = new BufferedReader(new FileReader("F:\\study\\9.JAVA_BASE\\笔记\\test.txt"));
				BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\study\\9.JAVA_BASE\\笔记\\test1.txt"));) {
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