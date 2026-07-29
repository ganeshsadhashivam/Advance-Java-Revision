package com.blinkit.auth.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blinkit.auth.entity.RoleEntity;
import com.blinkit.auth.repository.RoleRepository;
import com.blinkit.auth.request.RoleRequest;
import com.blinkit.auth.response.RoleResponse;

@Service
public class RoleService {

	@Autowired
	private RoleRepository roleRepository;
	
	public RoleResponse createRole(RoleRequest request)
	{
		if(roleRepository.existsByRoleName(request.getRoleName()))
		{
			 throw new RuntimeException("Role already exists");
		}
		
		RoleEntity roleEntity = new RoleEntity();
		roleEntity.setRoleName(request.getRoleName());
		roleEntity.setDescription(request.getDescription());
		roleEntity.setActive(request.getActive());
		
		RoleEntity savedEntity = roleRepository.save(roleEntity);
		
		RoleResponse response = new RoleResponse();
		response.setId(savedEntity.getId());
        response.setRoleName(savedEntity.getRoleName());
        response.setDescription(savedEntity.getDescription());
        response.setActive(savedEntity.getActive());
        response.setCreatedAt(savedEntity.getCreatedAt());
        response.setUpdatedAt(savedEntity.getUpdatedAt());
		
		return response;
	}
	
	
	public List<RoleResponse> getAllRoles()
	{
		
		      List<RoleEntity>   roles= roleRepository.findAll();
		      
		      List<RoleResponse> response = new ArrayList();
		      
		      for(RoleEntity role : roles)
		      {
		    	  RoleResponse roleResponse = new RoleResponse();
		    	  
		    	  roleResponse.setId(role.getId());
		    	  roleResponse.setRoleName(role.getRoleName());
		    	  roleResponse.setDescription(role.getDescription());
		    	  roleResponse.setActive(role.getActive());
		    	  roleResponse.setCreatedAt(role.getCreatedAt());
		    	  roleResponse.setUpdatedAt(role.getUpdatedAt());
		    	  response.add(roleResponse);
		      }
		      
		      return response;
 	}
	
	
	public RoleResponse getRoleById(Long id)
	{
		 RoleEntity entity = roleRepository.findById(id).orElseThrow(() -> new RuntimeException("Role not found with id: " + id));
		 RoleResponse response = new RoleResponse();
		    response.setId(entity.getId());
		    response.setRoleName(entity.getRoleName());
		    response.setDescription(entity.getDescription());
		    response.setActive(entity.getActive());
		    response.setCreatedAt(entity.getCreatedAt());
		    response.setUpdatedAt(entity.getUpdatedAt());
		    return response;
		   
		   
	}
	
	
	private RoleEntity getRoleEntityById(Long id) {

	    return roleRepository.findById(id)
	            .orElseThrow(() -> new RuntimeException("Role not found with id: " + id));
	}
	
	public RoleResponse updateRole(Long id , RoleRequest request)
	{
		
		
		
		
		RoleEntity existing =  getRoleEntityById(id);
		
		existing.setRoleName(request.getRoleName());
		existing.setDescription(request.getDescription());
	    existing.setActive(request.getActive());
	    
	    RoleEntity updated = roleRepository.save(existing);
	    
	    RoleResponse response = new RoleResponse();
	    response.setId(updated.getId());
	    response.setRoleName(updated.getRoleName());
	    response.setDescription(updated.getDescription());
	    response.setActive(updated.getActive());
	    response.setCreatedAt(updated.getCreatedAt());
	    response.setUpdatedAt(updated.getUpdatedAt());

	    return response;
	    
		
		
	}
	
	public void deleteRole(Long id)
	{
		RoleEntity role = getRoleEntityById(id);
		
		if(role.getRoleName().equals("ADMIN")) {
		    throw new RuntimeException("Admin role cannot be deleted");
		}
		roleRepository.delete(role);
	}
}
