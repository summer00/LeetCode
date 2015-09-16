package ioTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

/**
 * �ļ��ַ�������
 * 
 * ʲô�����ʹ���ַ��� �ַ���Ҳ���Կ����ı��ļ�, �����Ƽ�ʹ��. ��Ϊ��ȡʱ����ֽ�תΪ�ַ�, д��ʱ��Ҫ���ַ�ת���ֽ�.
 * 
 * ������Ҫ��ȡһ���ı�, ������Ҫд��һ���ı���ʱ�����ʹ���ַ���
 * 
 * ��ȡ��ʱ���ǰ����ַ��Ĵ�С��ȡ��,������ְ������
 * 
 * д����ʱ�����ֱ�ӽ��ַ���д��,����ת��Ϊ�ֽ�����
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