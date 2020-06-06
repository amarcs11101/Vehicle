package com.abhishek.amar.main;

/**
 * 
 * @author Abhishek Amar
 *
 */
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.abhishek.amar.bean.Entry;
import com.abhishek.amar.constants.Constants;
import com.abhishek.amar.util.DirectoryUtil;

public class Main {

	public static void main(String[] args) {
		String sourceFile = Constants.SOURCE_FILE;
		String destinationFile = Constants.DESTINATION_FILE;
		rootDirectory();
		sourceFileAndDestinationFile(sourceFile, 0);
		sourceFileAndDestinationFile(destinationFile, 1);
	}

	public static void sourceFileAndDestinationFile(String filePath, int count) {
		File maindirectory = new File(filePath);
		Constants.filePath = filePath;
		if (maindirectory.exists() && maindirectory.isDirectory()) {
			File arr[] = maindirectory.listFiles();
			String fileType = arr[0].isDirectory() ? Constants.FOLDER : Constants.FILE;
			Entry mainDirectoryEntry = new Entry(maindirectory.getName(), fileType);
			Constants.fileName = maindirectory.getName();
			Constants.fileType[count] = Constants.sourceDestination[count];
			Constants.count = count;
			DirectoryUtil.directoryHiererchy(arr, 0, 0, mainDirectoryEntry);
		} else {
			System.err.println(Constants.ERROR_MESSAGE);
		}
	}

	public static void rootDirectory() {
		try {
			Path currentWorkingDir = Paths.get("").toAbsolutePath();
			Constants.ROOT_DIRECTORY = currentWorkingDir.normalize().toString();
		} catch (Exception e) {
			System.out.println();
		}
	}

}
