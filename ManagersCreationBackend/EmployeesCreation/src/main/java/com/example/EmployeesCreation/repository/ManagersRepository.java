package com.example.EmployeesCreation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EmployeesCreation.entity.Managers;
import java.util.List;

@Repository
public interface ManagersRepository extends JpaRepository<Managers, Long>{

	public List<Managers> findBymanagerName(String employeesName);
	
}
