package ioTest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.Reader;

import org.junit.Test;

/**
 * �кŶ�ȡ������ ���Լ���ʵ��
 */
public class LineNumberReaderTest {
	@Test
	public void setLineTest() {
		try (LineNumberReader lnr = new LineNumberReader(new FileReader("F:\\study\\9.JAVA_BASE\\�ʼ�\\test.txt"))) {
			String line;
			lnr.setLineNumber(100); // �����к�
			while ((line = lnr.readLine()) != null) {
				System.out.println(lnr.getLineNumber() + ":" + line);// ��ȡ�к�
			}
			System.out.println(lnr.getLineNumber());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void myLineNumberReaderTest() {
		try (MyLineNumberReader myLnr = new MyLineNumberReader(
				new FileReader("F:\\study\\9.JAVA_BASE\\�ʼ�\\test.txt"))) {
			myLnr.setLineNumber(1000);
			String s;
			while ((s = myLnr.readLine()) != null) {
				System.out.println(myLnr.getLineNumber() + ":" + s);
			}
			System.out.println(myLnr.getLineNumber());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class MyLineNumberReader extends BufferedReader {
	private int lineNumber;

	public MyLineNumberReader(Reader in) {
		super(in);
		lineNumber = 1;
	}

	public int getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}

	@Override
	public String readLine() throws IOException {
		String s;
		if ((s = super.readLine()) != null) {
			lineNumber++;
		}
		return s;
	}
}
