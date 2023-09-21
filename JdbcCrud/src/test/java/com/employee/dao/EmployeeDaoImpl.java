package com.employee.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.employeemodel.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	private JdbcTemplate jd;
	public JdbcTemplate getJd() {
		return jd;
	}

	public void setJd(JdbcTemplate jd) {
		this.jd = jd;
	}

	public int insertEmp(Employee s) {
		// TODO Auto-generated method stub
		String query="insert into Employee(emp_id,emp_name) values(?,?)";
		int i=jd.update(query,s.getId(),s.getName());
		
		return i;
	}

	public int updateEmp(Employee s) {
		// TODO Auto-generated method stub
		String update="update Employee set emp_name= ? where emp_id= ?";
		int j=jd.update(update,s.getName(),s.getId());
		
		return j;
	}

	public int deleteEmp(int id) {
		// TODO Auto-generated method stub
		String delete="delete from Employee where emp_id=?";
		int k=jd.update(delete,id);
		
		return k;
	}

	public Employee getEmpById(int id) {
		// TODO Auto-generated method stub
		String select="Select * from Employee where emp_id= ?";
		 
				RowMapper rm=new RowMapper()
				{

					public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
						// TODO Auto-generated method stub
						Employee e=new Employee();
						e.setId(rs.getInt(1));
						e.setName(rs.getString(2));
						return e;
					}
			
				};
		Employee e=jd.queryForObject(select,rm,id);
		
		
		return e;
	}

	public List<Employee> getEmp() {
		// TODO Auto-generated method stub
			String select="Select * from Employee ";
			 
			RowMapper rm=new RowMapper()
			{
	
				public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
					// TODO Auto-generated method stub
					Employee e=new Employee();
					e.setId(rs.getInt(1));
					e.setName(rs.getString(2));
					return e;
				}
		
			};
	List<Employee> list=jd.query(select,rm);	
	
	return list;
	}

}
