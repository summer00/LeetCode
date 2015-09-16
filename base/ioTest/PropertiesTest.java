package ioTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

import org.junit.Test;

public class PropertiesTest {
	@Test
	public void test() {
		Properties p = new Properties();
		try (FileOutputStream fos = new FileOutputStream("F:\\test\\test1.properties");
				FileInputStream fis = new FileInputStream("F:\\test\\test.properties");) {
			p.load(fis);
			Enumeration<?> e = p.propertyNames();
			while (e.hasMoreElements()) {
				String s = (String) e.nextElement();
				System.out.println(s + "--" + p.getProperty(s));
			}
			p.store(fos, null);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
