package homework6;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		File dir1 = new File("C:\\Users\\Admin\\Desktop\\1\\");
		File dir2 = new File("C:\\Users\\Admin\\Desktop\\2\\");

		FileFilter filter = new Filter();

		if (dir1.isDirectory() && dir2.isDirectory()) {
			File[] files = dir1.listFiles(filter);
			for (File file : files) {
				try {

					FileCopy.fileCopy2(file, dir2);
					System.out.println("done!");

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
