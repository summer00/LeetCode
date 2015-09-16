package ioTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

/**
 * 文件字符流测试
 * 
 * 什么情况下使用字符流 字符流也可以拷贝文本文件, 但不推荐使用. 因为读取时会把字节转为字符, 写出时还要把字符转回字节.
 * 
 * 程序需要读取一段文本, 或者需要写出一段文本的时候可以使用字符流
 * 
 * 读取的时候是按照字符的大小读取的,不会出现半个中文
 * 
 * 写出的时候可以直接将字符串写出,不用转换为字节数组
 */
public class FileReaderTest {
	@Test
	public void copyTest() {
		try (FileReader fr = new FileReader("F:\\test\\test.txt");
				FileWriter fw = new FileWriter("F:\\test\\test2.txt");) {
			int c;
			while ((c = fr.read()) != -1) {
				fw.write(c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void copyTestUseArr() {
		try (FileReader fr = new FileReader("F:\\test\\test.txt");
				FileWriter fw = new FileWriter("F:\\test\\test2.txt");) {
			int len;
			char[] arr = new char[1024];
			while ((len = fr.read(arr)) != -1) {
				fw.write(arr, 0, len);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}