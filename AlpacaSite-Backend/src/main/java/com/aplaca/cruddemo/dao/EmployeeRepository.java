package com.aplaca.cruddemo.dao;

import com.aplaca.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

// entity type is Employee so we get the endpoint /employees by default and primary key is Integer
// by default spring data rest will return first 20 elements - page size = 20
// we can navigate to the different pages of data using query param
// pages are 0 based

// for custom endpoints like members so, /magic-api/members
//@RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
