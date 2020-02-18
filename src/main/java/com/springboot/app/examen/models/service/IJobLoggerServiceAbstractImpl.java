package com.springboot.app.examen.models.service;

import java.util.Map;
import java.util.logging.Logger;

import com.springboot.app.examen.models.entity.JobLogger;

public class IJobLoggerServiceAbstractImpl {
	protected static boolean logToFile;
	protected static boolean logToConsole;
	protected static boolean logMessage;
	protected static boolean logWarning;
	protected static boolean logError;
	protected static boolean logToDatabase;
	protected boolean initialized;
	protected static Map<String, Object> dbParams;
	protected static Logger logger;
	
	public void cargarParametros() {
		JobLogger jobLogger = new JobLogger();
		logToFile = jobLogger.isLogToFileParam();
		logToConsole = jobLogger.isLogToConsoleParam();
		logMessage = jobLogger.isLogMessageParam();
		logWarning = jobLogger.isLogWarningParam();
		logError = jobLogger.isLogErrorParam();
		logToDatabase = jobLogger.isLogToDatabaseParam();
		dbParams = jobLogger.getDbParamsMap();
		
	}
}
