package com.blinkit.auth.response;

import java.time.LocalDateTime;

public class RoleResponse {

	
	  private Long id;
	    private String roleName;
	    private String description;
	    private Boolean active;
	    private LocalDateTime createdAt;
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
		public void setUpdatedAt(LocalDateTime updateAt) {
			this.updatedAt = updateAt;
		}
	    
	    
}
