package com.springjdbc.JdbcCrud;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class AppTest 
    
{
	public static void main(String args[]) throws SQLException
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		JdbcTemplate jd = context.getBean("jdbc",JdbcTemplate.class);
		
		System.out.println(jd.getDataSource().getConnection());
		
		// ---------------------------------------------------------------//		
		// insertion 
		
		/*
		String query="insert into Employee(emp_id,emp_name) values(?,?)";
		int i=jd.update(query,4,"Avni");
		System.out.println("Sucessfully inserted "+i);
		*/
		
		// ---------------------------------------------------------------//	
		// update
		/*
		String update="update Employee set emp_name= ? where emp_id= ?";
		int j=jd.update(update,"Aanchal","3");
		System.out.println("updated succesfully "+j);
		*/
		
		// ---------------------------------------------------------------//	
		// delete
		/*
		String delete="delete from Employee where emp_id=?";
		int k=jd.update(delete,2);
		System.out.println("Deleted succesfully "+k);
		*/
		// ---------------------------------------------------------------//	
		// Read
	/*
	 String select="Select * from Employee where emp_id= ?";
	 
		String select2="Select * from Employee";
		RowMapper rm=new RowMapper()
				{

					public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
						// TODO Auto-generated method stub
						String name=rs.getString(2);
						return name;
					}
			
				};
		String name=jd.queryForObject(select,rm,3);
		List<String> list=jd.query(select2, rm);
		for(String nm:list)
		{
			System.out.println(nm);
		}
		System.out.println(name);
	
		*/
		
		
		
		
		
	}
}