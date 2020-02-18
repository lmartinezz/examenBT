package com.springboot.app.examen;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Properties;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import com.springboot.app.examen.models.service.IJobLoggerService;

public class JobLogger {
	@Autowired
	private IJobLoggerService iJobLoggerService;
	

	public void logMessage(String messageText, boolean message, boolean warning, boolean error) throws Exception {
		iJobLoggerService.registrarLogMessage(messageText, message, warning,error);

	
	}
}

