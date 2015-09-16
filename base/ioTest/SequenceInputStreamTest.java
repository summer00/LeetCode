package ioTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Arrays;

import org.junit.Test;

/**
 * �����������������԰Ѷ���ֽ����������ϳ�һ��, ���������ж�ȡ����ʱ,
 * 
 * ���ӱ����ϵĵ�һ������ʼ��, ����һ��֮��������ڶ���, �Դ�����.
 */
public class SequenceInputStreamTest {
	@Test
	public void test() {
		try (FileInputStream fis1 = new FileInputStream("F:\\test\\test2.txt");
				FileInputStream fis2 = new FileInputStream("F:\\test\\test3.txt");
				FileOutputStream fos = new FileOutputStream("F:\\test\\test.txt");
				SequenceInputStream sis = new SequenceInputStream(fis1, fis2);) {
			int len;
			byte[] bytes = new byte[10];
			while ((len = sis.read(bytes)) != -1) {
				System.out.println(Arrays.toString(bytes));
				fos.write(bytes, 0, len);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
