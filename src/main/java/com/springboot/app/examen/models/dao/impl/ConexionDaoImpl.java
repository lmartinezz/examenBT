package com.springboot.app.examen.models.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Map;
import java.util.Properties;

import com.springboot.app.examen.models.dao.ConexionDao;

public class ConexionDaoImpl implements ConexionDao {

	@Override
	public void conexionBd(Map<String, Object> dbParams, boolean message, int param) throws Exception   {
		Connection connection = null;
		Properties connectionProps = new Properties();
		connectionProps.put("user", dbParams.get("userName"));
		connectionProps.put("password", dbParams.get("password"));

		connection = DriverManager.getConnection("jdbc:" + dbParams.get("dbms") + "://" + dbParams.get("serverName")
				+ ":" + dbParams.get("portNumber") + "/", connectionProps);

		Statement stmt = connection.createStatement();

		stmt.executeUpdate("insert into Log_Values('" + message + "', " + String.valueOf(param) + ")");
		
	}

}
