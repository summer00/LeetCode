package ioTest;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

public class BufferedInputStreamTest {
	@Test
	public void copyTest() {
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			FileInputStream fis = new FileInputStream("F:\\study\\9.JAVA_BASE\\�ʼ�\\test.txt");
			// װ����ģʽ
			bis = new BufferedInputStream(fis);
			FileOutputStream fos = new FileOutputStream("F:\\study\\9.JAVA_BASE\\�ʼ�\\test4.txt", true);
			bos = new BufferedOutputStream(fos);
			int len;
			while ((len = bis.read()) != -1) {
				bos.write(len);
			}
			// �س�
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
	 * ��try()�д��������������ʵ����AutoCloseable����ӿ�,���ʵ���ˣ���try�����{}(��д����)ִ�к�ͻ��Զ�����,
	 * �������close���������ص�����java 7��ʼ
	 */
	public void tryResourceTest() {
		try (BufferedInputStream bis = new BufferedInputStream(
				new FileInputStream("F:\\study\\9.JAVA_BASE\\�ʼ�\\test.txt"));
				BufferedOutputStream bos = new BufferedOutputStream(
						new FileOutputStream("F:\\study\\9.JAVA_BASE\\�ʼ�\\test5.txt", true));) {
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