package com.springjdbc.JdbcCrud;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.employee.dao.EmployeeDaoImpl;
import com.employeemodel.Employee;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		EmployeeDaoImpl ed=context.getBean("ed",EmployeeDaoImpl.class);
	
	// ---------------------------------------------------------------//	
		//insert
		
		/*
		 Employee e=new Employee();
		e.setId(5);
		e.setName("ram");
		
		
		int i=ed.insertEmp(e);
		System.out.println(i);
		*/
	// ---------------------------------------------------------------//		
		// update
		
		/*
		 Employee e=new Employee();
		 e.setId(5);
		e.setName("sham");
		
		
		int i=ed.updateEmp(e);
		System.out.println(i);
		 */
		
		// delete
	// ---------------------------------------------------------------//	
		/*
		 * int i=ed.deleteEmp(1);
		 * System.out.println(i);
		 */
		
	// ---------------------------------------------------------------//		
		// select by id
		
		/*
		 * Employee s=ed.getEmpById(5);
		 * System.out.println(s.getName());
		 */
		 
	// ---------------------------------------------------------------//		
		// select all
		/*
		List<Employee> list=ed.getEmp();
		for(Employee e:list)
		{
			System.out.println(e.getName());
		}
		*/
		
	}

}
