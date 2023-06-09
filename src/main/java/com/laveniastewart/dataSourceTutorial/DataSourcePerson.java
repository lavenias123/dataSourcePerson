package com.laveniastewart.dataSourceTutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.sql.DataSource;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
//import java.util.Iterator;

@SpringBootApplication
//public class DataSourceTutorialApplication {
	
	// register driver & connection
public class DataSourcePerson {
		public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
		
		public static final String JDBC_URL = "jdbc:mysql://localhost/Person";
		
		public static final String USERNAME = "charles";
				
		public static final String PASSWORD = "";
//	}

	public static void main(String[] args) {
		
		// Creates an instance of DriverManagerDataSource and pass it to the JdbcTemplate. 
//		SpringApplication.run(DataSourceTutorialApplication.class, args);
		SpringApplication.run(DataSourcePerson.class, args);
		
		DataSource source = getDataSource();
		JdbcTemplate template = new JdbcTemplate(source);
		
		// After creating a template with a data source inject we
		// can do a database manipulation such as the CRUD operation.
		
		System.out.println("DataSource = " + template.getDataSource());
		
		// access DB
//		List<Map<String, Object>> records = template.queryForList("SELECT * FROM charles_data");
		
		// can I access the DB? Period?
		// I'm adding an iterator
		List<Map<String, Object>> rows = template.queryForList("SELECT * FROM charles_data");
		Iterator<Map<String, Object>> it = rows.iterator(); // rows is null
		while(it.hasNext()) {
			Map<String, Object> charles_dataMap = (Map<String, Object>) it.next();
			System.out.println(charles_dataMap.get("id"));
		}
//		System.out.println("Full Name = " + charles_data);
			// loop thru the table
//			for (Map<String, Object> charles_data : records) {
//				System.out.println("Full Name = " + charles_data);
//			}
//		
//		for (Map<String, Object> records : charles_data) {
////			System.out.println("Full Name = " + records);
//		}
		
	} // main ends
	  private static DataSource getDataSource() {
		return null;
	}
	/**
     * Returns a DataSource object for connection to the database.
	 * @param dataSource 
     *
     * @return a DataSource.
     */
	// return a DataSource obj
	@Bean
	private static DataSource getDataSource(DriverManagerDataSource dataSource) {
		// Creates a new instance of DriverManagerDataSource
		dataSource = new DriverManagerDataSource();
		
		// set the required parameters such as the Jdbc Driver class, 
		// Jdbc URL, database username and password. DriverManagerDataSource 

		//		dataSource.setDriverClassName(DataSourcePerson.DRIVER);
		dataSource.setUrl(DataSourcePerson.JDBC_URL);
		dataSource.setUsername(DataSourcePerson.USERNAME);
		dataSource.setPassword(DataSourcePerson.PASSWORD);
		return dataSource;
		
		
	}
}  // class ends
















