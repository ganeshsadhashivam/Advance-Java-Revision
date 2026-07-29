package com.blinkit.auth.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="roles")
public class RoleEntity {
	
	
		public RoleEntity()
		{
			
		}
		
		public RoleEntity(String roleName, String description, Boolean active) {
		    this.roleName = roleName;
		    this.description = description;
		    this.active = active;
		}

		@Id
	  	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  	private Long id;
	
	    @Column(name = "role_name", nullable = false, unique = true)
	    private String roleName;

	    @Column(length = 500)
	    private String description;

	    @Column(nullable = false)
	    private Boolean active;
	    
	    
	    
	    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL, orphanRemoval = true)
	    private List<UserRoleEntity> userRoles = new ArrayList<>(); 
	    

	    public List<UserRoleEntity> getUserRoles() {
			return userRoles;
		}

		public void setUserRoles(List<UserRoleEntity> userRoles) {
			this.userRoles = userRoles;
		}

		@CreationTimestamp
	    private LocalDateTime createdAt;

	    @UpdateTimestamp
	    private LocalDateTime updatedAt;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getRoleName() {
			return roleName;
		}

		public void setRoleName(String roleName) {
			this.roleName = roleName;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Boolean getActive() {
			return active;
		}

		public void setActive(Boolean active) {
			this.active = active;
		}

		public LocalDateTime getCreatedAt() {
			return createdAt;
		}

		public void setCreatedAt(LocalDateTime createdAt) {
			this.createdAt = createdAt;
		}

		public LocalDateTime getUpdatedAt() {
			return updatedAt;
		}

		public void setUpdatedAt(LocalDateTime updatedAt) {
			this.updatedAt = updatedAt;
		}
	    
		
}
	