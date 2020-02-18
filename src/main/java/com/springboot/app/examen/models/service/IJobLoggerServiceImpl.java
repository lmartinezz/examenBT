package com.springboot.app.examen.models.service;

import java.text.DateFormat;
import java.util.Date;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.examen.models.dao.impl.ConexionDaoImpl;
import com.springboot.app.examen.models.util.Util;

@Service
public class IJobLoggerServiceImpl extends IJobLoggerServiceAbstractImpl implements IJobLoggerService  {

	

	@Autowired
	private ConexionDaoImpl conexionDao;
	
	
	@Override
	public void registrarLogMessage(String messageText, boolean message, boolean warning, boolean error) throws Exception {
		cargarParametros();
		int t = 0;
		if (message && logMessage) {
			t = 1;
		}

		if (error && logError) {
			t = 2;
		}

		if (warning && logWarning) {
			t = 3;
		}

		String l = null;

		
		if (error && logError) {
			l = l + "error " + DateFormat.getDateInstance(DateFormat.LONG).format(new Date()) + messageText;
		}

		if (warning && logWarning) {
			l = l + "warning " +DateFormat.getDateInstance(DateFormat.LONG).format(new Date()) + messageText;
		}

		if (message && logMessage) {
			l = l + "message " +DateFormat.getDateInstance(DateFormat.LONG).format(new Date()) + messageText;
		}
		
		if(logToFile) {
			FileHandler fh = Util.createFile(dbParams);
			logger.addHandler(fh);
			logger.log(Level.INFO, messageText);
		}
		
		if(logToConsole) {
			ConsoleHandler ch = new ConsoleHandler();
			logger.addHandler(ch);
			logger.log(Level.INFO, messageText);
		}
		
		if(logToDatabase) {
			conexionDao.conexionBd(dbParams, message,t);
		}
	}

	public ConexionDaoImpl getConexionDao() {
		return conexionDao;
	}

	public void setConexionDao(ConexionDaoImpl conexionDao) {
		this.conexionDao = conexionDao;
	}


	
}
