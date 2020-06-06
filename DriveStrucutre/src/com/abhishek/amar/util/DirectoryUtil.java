package com.abhishek.amar.util;

/**
 * @author Abhishek Amar
 *
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import com.abhishek.amar.bean.Entry;
import com.abhishek.amar.constants.Constants;

public class DirectoryUtil {
	public static void directoryHiererchy(File[] arr, int index, int level, Entry entryObject) {
		Entry entry = null;
		Map<String, String> jsonMap = new HashMap<>();
		try {
			if (index == arr.length) {
				jsonMap.put(entryObject.getName(), Entry.convertObjectToJson(entryObject));
				if (jsonMap.get(Constants.fileName) != null) {
					System.out.println("generated json ===> " + jsonMap.get(Constants.fileName));
					writeJsonToFile(jsonMap.get(Constants.fileName));
					String source = Constants.ROOT_DIRECTORY + Constants.SLASH + Constants.SOURCE;
					String destination = Constants.ROOT_DIRECTORY + Constants.SLASH + Constants.DESTINATION;
					JsonComparision.compareAndShowDifference(Constants.filePath, source, destination);
				}
			}
			if (arr[index].isFile()) {
				entry = new Entry(arr[index].getName(), Constants.FILE);
				entryObject.addChildren(entry);
			} else if (arr[index].isDirectory()) {
				entry = new Entry("[" + arr[index].getName() + "]", Constants.SUB_DIRETORY);
				entryObject.addChildren(entry);
				directoryHiererchy(arr[index].listFiles(), 0, level + 1, entry);
			}

			directoryHiererchy(arr, ++index, level, entryObject);
		} catch (Exception e) {
			System.out.println("");
		}
	}

	public static void writeJsonToFile(String json) {
		try (FileWriter file = new FileWriter(Constants.fileType[Constants.count] + Constants.FILE_EXTENSION)) {
			file.write(json);
			file.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}