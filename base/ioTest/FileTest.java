package ioTest;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

import org.junit.Test;

/**
 * 文件测试
 */
public class FileTest {

	@Test
	/**
	 * 创建文件目录
	 */
	public void createDirectoryTest() {
		File file = new File("D:\\test1\\test2\\test3\\test4\\test5");
		file.mkdirs();
	}

	@Test
	public void deleteFileTest() {
		deleteFile("D:\\test1\\test2\\test3\\test4\\test5");
	}

	/**
	 * 递归删除文件
	 */
	//TODO 未完成
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
	 * 过滤文件
	 */
	public void fileNameFilterTest() {
		File file = new File("F:\\study\\9.JAVA_BASE\\笔记");

		String nameList[] = file.list();
		System.out.println(Arrays.toString(nameList));
		// 过滤得到所有txt
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
	 * 递归得到制定目录下所有文件
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
