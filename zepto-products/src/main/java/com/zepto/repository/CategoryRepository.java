package com.zepto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zepto.entity.CategoryEntity;

@Repository
public interface CategoryRepository extends CrudRepository<CategoryEntity,Long> {

	@Query("SELECT DISTINCT c FROM CategoryEntity c LEFT JOIN FETCH c.products")
	List<CategoryEntity> findAllWithProducts();
}
