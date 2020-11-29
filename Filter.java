package homework6;

import java.io.File;
import java.io.FileFilter;

public class Filter implements FileFilter {

	@Override
	public boolean accept(File pathname) {
		if (pathname.getName().endsWith(".mp3")) {
			return true;
		}
		return false;
	}
}
