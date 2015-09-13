package ioTest;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

import org.junit.Test;

/**
 * �ļ�����
 */
public class FileTest {

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
	//TODO δ���
	public void fileListTest() {
		String root = "E:\\10.file";
		getAllFileList(root);
	}

	public String getAllFileList(String path) {
		if (path != null) {
			File file = new File(path);
			if (file.isDirectory()) {
				String[] fileList = file.list();
				for (int i = 0; i < fileList.length; i++) {
					if (!(new File(path + "\\" + fileList[i])).isDirectory()) {
						System.out.println(fileList[i]);
					} else {
						getAllFileList(path + "\\" + fileList[i]);
					}
				}
			} else {
				System.out.println(file.getName());
				return null;
			}
		}
		return null;
	}

}
