package com.springboot.app.examen.models.dao;

import java.util.Map;

public interface ConexionDao {

	public void conexionBd(Map<String, Object> dbParams, boolean message, int param) throws Exception;
}
