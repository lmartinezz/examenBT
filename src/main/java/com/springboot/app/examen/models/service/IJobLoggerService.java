package com.springboot.app.examen.models.service;

public interface IJobLoggerService {
	
	public void registrarLogMessage(String messageText, boolean message, boolean warning, boolean error) throws Exception;

}
