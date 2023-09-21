package com.employee.dao;

import java.util.List;

import com.employeemodel.Employee;

public interface EmployeeDao {
      public int insertEmp(Employee s);
      public int updateEmp(Employee s);
      public int deleteEmp(int id);
      public Employee getEmpById(int id);
      public List<Employee> getEmp();
      
}
