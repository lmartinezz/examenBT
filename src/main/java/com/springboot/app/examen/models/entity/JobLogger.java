package com.springboot.app.examen.models.entity;

import java.util.Map;
import java.io.Serializable;

public class JobLogger implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	boolean logToFileParam;
	boolean logToConsoleParam; 
	boolean logToDatabaseParam;
	boolean logMessageParam;
	boolean logWarningParam; 
	boolean logErrorParam; 
	Map<String, Object> dbParamsMap;
	
	public boolean isLogToFileParam() {
		return logToFileParam;
	}
	public void setLogToFileParam(boolean logToFileParam) {
		this.logToFileParam = logToFileParam;
	}
	public boolean isLogToConsoleParam() {
		return logToConsoleParam;
	}
	public void setLogToConsoleParam(boolean logToConsoleParam) {
		this.logToConsoleParam = logToConsoleParam;
	}
	public boolean isLogToDatabaseParam() {
		return logToDatabaseParam;
	}
	public void setLogToDatabaseParam(boolean logToDatabaseParam) {
		this.logToDatabaseParam = logToDatabaseParam;
	}
	public boolean isLogMessageParam() {
		return logMessageParam;
	}
	public void setLogMessageParam(boolean logMessageParam) {
		this.logMessageParam = logMessageParam;
	}
	public boolean isLogWarningParam() {
		return logWarningParam;
	}
	public void setLogWarningParam(boolean logWarningParam) {
		this.logWarningParam = logWarningParam;
	}
	public boolean isLogErrorParam() {
		return logErrorParam;
	}
	public void setLogErrorParam(boolean logErrorParam) {
		this.logErrorParam = logErrorParam;
	}
	public Map<String, Object> getDbParamsMap() {
		return dbParamsMap;
	}
	public void setDbParamsMap(Map<String, Object> dbParamsMap) {
		this.dbParamsMap = dbParamsMap;
	}

	
	
	
}
