package com.springboot.app.examen.models.util;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.logging.FileHandler;

public class Util {

	public static FileHandler createFile(Map<String, Object>  dbParams) throws IOException {
		File logFile = new File(dbParams.get("logFileFolder") + "/logFile.txt");
		if (!logFile.exists()) {
			logFile.createNewFile();
		}

		FileHandler fh = new FileHandler(dbParams.get("logFileFolder") + "/logFile.txt");
		return fh;
	}
}
