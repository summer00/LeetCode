package ioTest;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;

import org.junit.Test;

/**
 * �ļ�����
 */
public class FileTest {

	@Test
	public void createFileTest() {
		File file = new File("D:\\test.js");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	/**
	 * �����ļ�Ŀ¼
	 */
	public void createDirectoryTest() {
		File file = new File("D:\\test1\\test2\\test3\\test4\\test5");
		file.mkdirs();
	}

	@Test
	/**
	 * ������
	 */
	public void renameTest() {
		File file = new File("D:\\test.js");
		// ��ͬ·�����൱�ڼ��в���
		// file.renameTo(new File("E:\\test.js"));
		// ��ͬ��Ϊ������
		file.renameTo(new File("D:\\tt.js"));
	}

	/**
	 * �ݹ�ɾ���ļ�
	 */
	@Test
	public void deleteFileTest() {
		deleteFile("D:\\test.js");
	}

	public void deleteFile(String filename) {
		if (filename == null) {
			return;
		}
		File file = new File(filename);
		if (file.isDirectory()) {
			String[] list = file.list();
			for (int i = 0; i < list.length; i++) {
				deleteFile(filename + "\\" + list[i]);
			}
		}
		file.delete();
	}

	@Test
	/**
	 * �����ļ�
	 */
	public void fileNameFilterTest() {
		File file = new File("F:\\study\\9.JAVA_BASE\\�ʼ�");

		String nameList[] = file.list();
		System.out.println(Arrays.toString(nameList));
		// ���˵õ�����txt
		String nameList1[] = file.list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				if (name.endsWith("txt")) {
					return true;
				}
				return false;
			}
		});
		System.out.println(Arrays.toString(nameList1));
	}

	@Test
	/**
	 * �ݹ�õ��ƶ�Ŀ¼�������ļ�
	 */
	public void fileListTest() {
		String root = "E:\\10.file";
		getAllFileList(root);
	}

	public void getAllFileList(String path) {
		if (path != null) {
			File file = new File(path);
			if (file.isDirectory()) {
				String[] fileList = file.list();
				for (int i = 0; i < fileList.length; i++) {
					getAllFileList(path + "\\" + fileList[i]);
				}
			} else {
				System.out.println(file.getName());
			}
		}
	}
}

/**
 * ����File������
 * 
 * ----------------- A:�жϹ��ܣ�------------------
 * 
 * public boolean isDirectory():�ж��Ƿ���Ŀ¼
 * 
 * public boolean isFile():�ж��Ƿ����ļ�
 * 
 * public boolean exists():�ж��Ƿ����
 * 
 * public boolean canRead():�ж��Ƿ�ɶ�
 * 
 * public boolean canWrite():�ж��Ƿ��д
 * 
 * public boolean isHidden():�ж��Ƿ�����
 * 
 * ----------------- B:��ȡ���ܣ�-------------------
 * 
 * public String getAbsolutePath()����ȡ����·��
 * 
 * public String getPath():��ȡ·��
 * 
 * public String getName():��ȡ����
 * 
 * public long length():��ȡ���ȡ��ֽ���
 * 
 * public long lastModified():��ȡ���һ�ε��޸�ʱ�䣬����ֵ
 * 
 * public String[] list():��ȡָ��Ŀ¼�µ������ļ������ļ��е���������
 * 
 * public File[] listFiles():��ȡָ��Ŀ¼�µ������ļ������ļ��е�File����
 */
