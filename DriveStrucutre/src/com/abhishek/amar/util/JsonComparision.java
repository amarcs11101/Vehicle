/**
 * 
 */
package com.abhishek.amar.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.abhishek.amar.constants.Constants;

/**
 * @author Abhishek Amar
 *
 */
public class JsonComparision {

	public static void compareAndShowDifference(String filePath, String sourceJson, String destinationJson) { 
		String cmdPrompt = Constants.CMD;
		String path = Constants.DRIVE;  
		String npmUpdate = Constants.NPM_CMD + sourceJson + " " + destinationJson + "";

		File jsFile = new File(filePath);
		List<String> updateCommand = new ArrayList<String>();
		updateCommand.add(cmdPrompt);
		updateCommand.add(path);   
		updateCommand.add(npmUpdate);

		try {
			runExecution(updateCommand, jsFile);
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void runExecution(List<String> command, File navigatePath) throws IOException, InterruptedException {
		ProcessBuilder executeProcess = new ProcessBuilder(command);
		executeProcess.directory(navigatePath);
		Process resultExecution = executeProcess.start();

		BufferedReader br = new BufferedReader(new InputStreamReader(resultExecution.getInputStream()));
		StringBuffer sb = new StringBuffer();

		String line;
		while ((line = br.readLine()) != null) { 
			/*if(line.toString().contains("-")) { 
				System.out.println("removed");
			}else if(line.toString().contains("+")) {
				System.out.println("addded");
			}*/
			System.out.println(line);
		}
		br.close();
	}
}
