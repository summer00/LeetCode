package ioTest;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

/**
 * 字节缓冲流测试
 */
public class BufferedInputStreamTest {
	@Test
	public void copyTest() {
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			FileInputStream fis = new FileInputStream("F:\\test\\test.txt");
			// 装饰者模式
			bis = new BufferedInputStream(fis);
			FileOutputStream fos = new FileOutputStream("F:\\test\\test4.txt", true);
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
				new FileInputStream("F:\\test\\test.txt"));
				BufferedOutputStream bos = new BufferedOutputStream(
						new FileOutputStream("F:\\test\\test5.txt", true));) {
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

}