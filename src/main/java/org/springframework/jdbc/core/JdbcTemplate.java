package org.springframework.jdbc.core;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

public class JdbcTemplate {

	public JdbcTemplate(DataSource source) {
		// TODO Auto-generated constructor stub
	}

	public String getDataSource() {
		return null;
//		return getResultList();
	}

	public List<Map<String, Object>> queryForList(String string) {
		return null;
//		return getResultList();
	}
// method needed to be added 
//	private List<Map<String, Object>> getResultList() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
