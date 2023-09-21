package com.springjdbc.JdbcCrud;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.employee.dao.EmployeeDaoImpl;

@Configuration
public class Config {
	
	@Bean
	public DataSource getDataSource()
	{
		DriverManagerDataSource datasource=new DriverManagerDataSource();
		datasource.setDriverClassName("com.mysql.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/spring_jdbc?characterEncoding=utf8");
		datasource.setUsername("root");
		datasource.setPassword("password"); // change it with your password
		return datasource;
	}
	@Bean("jdbc")
	public JdbcTemplate getJdbcTemplate()
	{
		JdbcTemplate jd=new JdbcTemplate();
		jd.setDataSource(getDataSource());
		return jd;
	}
	
	@Bean("ed")
	public EmployeeDaoImpl getDao()
	{
		EmployeeDaoImpl ed=new EmployeeDaoImpl();
		ed.setJd(getJdbcTemplate());
		return ed;
	}

}
