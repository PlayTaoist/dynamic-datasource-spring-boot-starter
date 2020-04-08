package cn.codepeople.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.codepeople.web.mapper.**")
public class DynamicDatasourceSpringBootStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(DynamicDatasourceSpringBootStarterApplication.class, args);
	}

}
