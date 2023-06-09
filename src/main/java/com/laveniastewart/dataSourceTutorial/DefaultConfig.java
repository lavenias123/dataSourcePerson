package com.laveniastewart.dataSourceTutorial;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DefaultConfig {
	 @Bean
      public DataSource dataSource(){
         DriverManagerDataSource dataSource = new DriverManagerDataSource();
//         dataSource.setDriverClassName("com.mysql.jdbc.Driver"); older className version cj is newest
         dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
         dataSource.setUrl("jdbc:mysql://localhost:3306/Person");
         dataSource.setUsername( "charles" );
         dataSource.setPassword( " " );
         return dataSource;
      }
	   
	
}
