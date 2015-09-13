package ioTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.junit.Test;

/**
 * 文件字节流测试
 */
public class FileInputStreamTest {

	@Test
	/**
	 * read()一次读取一个字节
	 */
	public void readTest() {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("F:\\study\\9.JAVA_BASE\\笔记\\test.txt");
			int b;
			while ((b = fis.read()) != -1) {
				System.out.print((char) b);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != fis) {
					fis.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	@Test
	public void writeTest() {
		try (// 从新写
				FileOutputStream fos1 = new FileOutputStream("F:\\study\\9.JAVA_BASE\\笔记\\test.txt");
				// 接着写
				FileOutputStream fos2 = new FileOutputStream("F:\\study\\9.JAVA_BASE\\笔记\\test.txt", true);) {
			fos1.write(99);
			fos1.write(99);
			fos1.write(99);
			fos2.write(100);
			fos2.write(100);
			fos2.write(100);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	/**
	 * 一次读取一个字节，效率较慢
	 */
	public void copyTest() {
		try (FileInputStream fis = new FileInputStream("F:\\study\\9.JAVA_BASE\\笔记\\test.txt");
				FileOutputStream fos = new FileOutputStream("F:\\study\\9.JAVA_BASE\\笔记\\test1.txt");) {
			int b;
			while ((b = fis.read()) != -1) {
				fos.write(b);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	/**
	 * 拷贝改进
	 */
	public void copyTestUseArr() {
		try (FileInputStream fis = new FileInputStream("F:\\study\\9.JAVA_BASE\\笔记\\test.txt");
				FileOutputStream fos = new FileOutputStream("F:\\study\\9.JAVA_BASE\\笔记\\test2.txt");) {
			// 每次读取的字节存储的数组
			byte[] b = new byte[100];
			// 每次长度
			int len;
			while ((len = fis.read(b)) != -1) {
				fos.write(b, 0, len);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 把控制器输入写入文件
	 */
	public void scannerInputIntoFile() {
		try (Scanner scanner = new Scanner(System.in);
				FileOutputStream fos = new FileOutputStream("F:\\study\\9.JAVA_BASE\\笔记\\test.txt")) {
			String line = scanner.nextLine();
			if ("exc".equals(line)) {
				return;
			} else {
				fos.write(line.getBytes());
				fos.write("\r\n".getBytes());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}