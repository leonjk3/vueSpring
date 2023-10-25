package com.project;

import org.apache.tomcat.util.security.Escape;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Connection;
import java.sql.DriverManager;

@SpringBootTest
class ProjectApplicationTests {

	static{
		try{
			Class.forName("org.mariadb.jdbc.Driver");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	@Test
	void contextLoads() {
		try(Connection con =
					DriverManager.getConnection(
							"jdbc:mariadb://localhost:3306/project",
							"leon",
							"dlworms123!"
					)){
			System.out.println(con);
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
