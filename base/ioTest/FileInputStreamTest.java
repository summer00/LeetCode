package ioTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.junit.Test;

/**
 * �ļ��ֽ�������
 */
public class FileInputStreamTest {

	@Test
	/**
	 * read()һ�ζ�ȡһ���ֽ�
	 */
	public void readTest() {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("F:\\study\\9.JAVA_BASE\\�ʼ�\\test.txt");
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
		try (// ����д
				FileOutputStream fos1 = new FileOutputStream("F:\\study\\9.JAVA_BASE\\�ʼ�\\test.txt");
				// ����д
				FileOutputStream fos2 = new FileOutputStream("F:\\study\\9.JAVA_BASE\\�ʼ�\\test.txt", true);) {
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
	 * һ�ζ�ȡһ���ֽڣ�Ч�ʽ���
	 */
	public void copyTest() {
		try (FileInputStream fis = new FileInputStream("F:\\study\\9.JAVA_BASE\\�ʼ�\\test.txt");
				FileOutputStream fos = new FileOutputStream("F:\\study\\9.JAVA_BASE\\�ʼ�\\test1.txt");) {
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
	 * �����Ľ�
	 */
	public void copyTestUseArr() {
		try (FileInputStream fis = new FileInputStream("F:\\study\\9.JAVA_BASE\\�ʼ�\\test.txt");
				FileOutputStream fos = new FileOutputStream("F:\\study\\9.JAVA_BASE\\�ʼ�\\test2.txt");) {
			// ÿ�ζ�ȡ���ֽڴ洢������
			byte[] b = new byte[100];
			// ÿ�γ���
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
	 * �ѿ���������д���ļ�
	 */
	public void scannerInputIntoFile() {
		try (Scanner scanner = new Scanner(System.in);
				FileOutputStream fos = new FileOutputStream("F:\\study\\9.JAVA_BASE\\�ʼ�\\test.txt")) {
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