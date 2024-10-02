package com.example.EmployeesCreation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeesCreation.entity.Managers;
import com.example.EmployeesCreation.service.ManagersService;

import java.util.List;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@CrossOrigin(origins = "*")
public class ManagersController {

	@Autowired
	private ManagersService managersService;
	
	@PostMapping("/save")
	public String saveEntity(@RequestBody Managers managers) {
		return managersService.createEntity(managers);
	}
	
	@GetMapping("/listAll")
	public List<Managers> getEntity(){
		return managersService.getListAll();
	}
	
	@GetMapping("/byId/{id}")
	public Managers getById(@PathVariable("id") Long id) {
		return managersService.findById(id);
	}
	
	@GetMapping("/byName/{name}")
	public List<Managers> getByEmployeesName(@PathVariable("name") String managerName){
		return managersService.fetchByEmployeesName(managerName);
	}
	
	@PostMapping("/updateById/{id}")
	public Managers updateById(@PathVariable("id") Long id, @RequestBody Managers managers) {
		return managersService.updateManagersById(id, managers);
	}
	
	@DeleteMapping("/deleteById/{id}")
	public String deleteById(@PathVariable("id") Long id) {
		managersService.deleteDataById(id);
		return "data deleted";
	}
}
