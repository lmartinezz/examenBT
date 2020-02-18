package com.springboot.app.examen;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import com.springboot.app.examen.models.service.IJobLoggerService;
import com.springboot.app.examen.models.service.IJobLoggerServiceImpl;
import com.springboot.app.examen.models.entity.JobLogger;

@RunWith(SpringRunner.class)
@ContextConfiguration("/spring-test-dao-context.xml")
@SpringBootTest
class SpringbootExamenApplicationTests {

	@Autowired
	private IJobLoggerService iJobLoggerService;
	
	@Before
	public void setup() {
		JobLogger jobLogger = new JobLogger();
		jobLogger.setLogErrorParam(true);
	}
	
	@Test 
	public void testJobLogger() throws Exception {
		iJobLoggerService.registrarLogMessage("Error", false, false,true);
		}
	
	//@Test
	void contextLoads() {
	}

	public void setiJobLoggerService(IJobLoggerService iJobLoggerService) {
		this.iJobLoggerService = iJobLoggerService;
	}
}
