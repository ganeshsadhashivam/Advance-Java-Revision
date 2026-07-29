package com.blinkit.auth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.blinkit.auth.request.RoleRequest;
import com.blinkit.auth.response.RoleResponse;
import com.blinkit.auth.service.RoleService;

@RestController
@RequestMapping("/api/v1/roles")
public class RoleController {

	@Autowired
	private RoleService roleService;
	
	@PostMapping("/createRole")
	public RoleResponse createRole(@RequestBody RoleRequest role) {
		
		RoleResponse saveRole = roleService.createRole(role);
		
		return saveRole;
	}
	
	@GetMapping("/getAllRoles")
	public List<RoleResponse> getAllRoles()
	{
		  
		return roleService.getAllRoles(); 
	}
	
	@GetMapping("/{id}")
	public RoleResponse getRoleById(@PathVariable Long id)
	{
		return roleService.getRoleById(id);
	}
	
	
	@PutMapping("/{id}")
	public RoleResponse updateRoleById(@PathVariable Long id ,@RequestBody RoleRequest request)
	{
		return roleService.updateRole(id, request);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteRole(@PathVariable Long id)
	{
		 roleService.deleteRole(id);
		 
		 return ResponseEntity.ok("Role Deleted Successfully");
	}
	
}
