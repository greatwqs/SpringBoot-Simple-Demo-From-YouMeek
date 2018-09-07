package com.gitnavi.springboot.springbootsimpledemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import lombok.extern.log4j.Log4j2;


@ServletComponentScan
@EnableTransactionManagement
@Log4j2
@SpringBootApplication
public class SpringbootBaseDemoApplication implements CommandLineRunner {
	
	private static final Logger log = LoggerFactory.getLogger(SpringbootBaseDemoApplication.class);

	@Value("${server.port:8833}")
	private String serverPort;

	@Value("${server.context-path:/demo}")
	private String serverContextPath;

	//=================================================================================

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBaseDemoApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		log.info("Application is success, Index >> http://127.0.0.1:{}{}", serverPort, serverContextPath);
		log.info("Application is success, Login Page >> http://127.0.0.1:{}{}/login", serverPort, serverContextPath);
		log.info("Application is success, Swagger Url >> http://127.0.0.1:{}{}/swagger-ui.html", serverPort, serverContextPath);
	}

}
