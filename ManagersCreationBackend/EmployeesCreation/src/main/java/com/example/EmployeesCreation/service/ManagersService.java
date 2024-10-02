package com.example.EmployeesCreation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeesCreation.entity.Managers;
import com.example.EmployeesCreation.repository.ManagersRepository;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ManagersService {

	@Autowired
	private ManagersRepository managersRepo;
	
	public String createEntity(Managers managers) {
		managersRepo.save(managers);
		return "Data saved";
	}
	
	public List<Managers> getListAll(){
		return managersRepo.findAll();
	}
	
	public Managers findById(Long id) {
		return managersRepo.findById((id)).get();
	}
	
	public List<Managers> fetchByEmployeesName(String managerName){
		return managersRepo.findBymanagerName(managerName);
	}
	
	public Managers updateManagersById(Long id, Managers managers) {
		Managers reDB = managersRepo.findById(id).get();
		
		if(Objects.nonNull(managers.getManagerName())&&
		        !"".equalsIgnoreCase(managers.getManagerName())){
		        	
		            reDB.setManagerName(managers.getManagerName());
		        }
		
		if(Objects.nonNull(managers.getRole())&&
		        !"".equalsIgnoreCase(managers.getRole())){
		        	
		            reDB.setRole(managers.getRole());
		        }
		
		
		if(Objects.nonNull(managers.getAddress1())&&
		        !"".equalsIgnoreCase(managers.getAddress1())){
		        	
		            reDB.setAddress1(managers.getAddress1());
		        }
		
		if(Objects.nonNull(managers.getAddress2())&&
		        !"".equalsIgnoreCase(managers.getAddress2())){
		        	
		            reDB.setAddress2(managers.getAddress2());
		        }
		
		if(Objects.nonNull(managers.getMobileNo())&&
		        !"".equalsIgnoreCase(managers.getMobileNo())){
		        	
		            reDB.setMobileNo(managers.getMobileNo());
		        }
		
		if(Objects.nonNull(managers.getPagerNo())&&
		        !"".equalsIgnoreCase(managers.getPagerNo())){
		        	
		            reDB.setPagerNo(managers.getPagerNo());
		        }
		
		if(Objects.nonNull(managers.getTelPhoneNo())&&
		        !"".equalsIgnoreCase(managers.getTelPhoneNo())){
		        	
		            reDB.setTelPhoneNo(managers.getTelPhoneNo());
		        }
		
		if(Objects.nonNull(managers.getEmailId())&&
		        !"".equalsIgnoreCase(managers.getEmailId())){
		        	
		            reDB.setEmailId(managers.getEmailId());
		        }
		
		return managersRepo.save(reDB);
		
	}
	
	
	public void deleteDataById(Long id) {
		managersRepo.deleteById(id);
	}
	
}
