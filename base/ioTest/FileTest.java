package ioTest;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;

import org.junit.Test;

/**
 * 文件测试
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
	 * 创建文件目录
	 */
	public void createDirectoryTest() {
		File file = new File("D:\\test1\\test2\\test3\\test4\\test5");
		file.mkdirs();
	}

	@Test
	/**
	 * 重命名
	 */
	public void renameTest() {
		File file = new File("D:\\test.js");
		// 不同路径，相当于剪切操作
		// file.renameTo(new File("E:\\test.js"));
		// 相同，为重命名
		file.renameTo(new File("D:\\tt.js"));
	}

	/**
	 * 递归删除文件
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

/**
 * 其他File函数：
 * 
 * ----------------- A:判断功能：------------------
 * 
 * public boolean isDirectory():判断是否是目录
 * 
 * public boolean isFile():判断是否是文件
 * 
 * public boolean exists():判断是否存在
 * 
 * public boolean canRead():判断是否可读
 * 
 * public boolean canWrite():判断是否可写
 * 
 * public boolean isHidden():判断是否隐藏
 * 
 * ----------------- B:获取功能：-------------------
 * 
 * public String getAbsolutePath()：获取绝对路径
 * 
 * public String getPath():获取路径
 * 
 * public String getName():获取名称
 * 
 * public long length():获取长度。字节数
 * 
 * public long lastModified():获取最后一次的修改时间，毫秒值
 * 
 * public String[] list():获取指定目录下的所有文件或者文件夹的名称数组
 * 
 * public File[] listFiles():获取指定目录下的所有文件或者文件夹的File数组
 */
