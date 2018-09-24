package jp.co.run;

import java.io.File;

public class FileValid {

	/**
	 * Check path input is a file.
	 * 
	 * @param path.
	 * @return true if it is a file, else return false.
	 */
	public static boolean isFile(String path) {
		File file = new File(path);
		
		if (file.exists()) {
			if (file.isFile()) {
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * Check if the path input is a folder.
	 * 
	 * @param path.
	 * @return true if it is a folder, else return false.
	 */
	public static boolean isFolder(String path) {
		File file = new File(path);
		
		if (file.exists()) {
			if (file.isDirectory()) {
				return true;
			}
		}
		return false;
	}
}
