package org.pre.repository;

import org.pre.domain.member.student.UniverseDepartment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniverseDepartmentRepository extends JpaRepository<UniverseDepartment, Long>{

	
	public UniverseDepartment findByUDepartmentName(String uDepartmentName);
}
