package jp.co.run;

import java.io.File;

public class FileValid {

	/**
	 * Check path input is a file.
	 * 
	 * @param directory
	 *        The path parent of the file.
	 * @param nameFile
	 *        The name of the file.
	 * @return true if it is a file, else return false.
	 */
	public static boolean isFile(String directory, String nameFile) {
		if (!isDirectory(directory) || StringValid.isNullOrEmpty(nameFile)) {
			return false;
		}
		
		File file = new File(directory, nameFile);
		if (file.isFile()) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * Check if the directory is exist.
	 * 
	 * @param directory
	 *        The path of directory.
	 * @return true if the directory is exist, else return false.
	 */
	public static boolean isDirectory(String directory) {
		//Check if directory is null or empty then return false.
		if (StringValid.isNullOrEmpty(directory)) {
			return false;
		}
		
		File file = new File(directory);
		
		if (file.isDirectory()) {
			return true;
		}
		
		return false;
	}
}
